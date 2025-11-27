import java.util.Map;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Dijkstra {

    private static final double INFINITY = Double.POSITIVE_INFINITY;

    private final Map<String, Map<String, Double>> graph;
    private final Map<String, Double> costs = new HashMap<>();
    private final Map<String, String> parents = new HashMap<>();
    private final Set<String> processed = new HashSet<>();

    public Dijkstra(Map<String, Map<String, Double>> graph) {
        this.graph = graph;
    }

    public void compute(String start) {
        for (var node : graph.keySet()) {
            costs.put(node, INFINITY);
        }

        costs.put(start, 0.0);

        Map<String, Double> neighbors = graph.get(start);
        if (neighbors != null) {
            for (var entry : neighbors.entrySet()) {
                costs.put(entry.getKey(), entry.getValue());
                parents.put(entry.getKey(), start);
            }
        }

        String node = findLowestCostNode();
        while (node != null) {
            double cost = costs.get(node);
            Map<String, Double> nodeNeighbors = graph.get(node);

            if (nodeNeighbors != null) {
                for (var entry : nodeNeighbors.entrySet()) {
                    String neighbor = entry.getKey();
                    double newCost = cost + entry.getValue();

                    if (newCost < costs.getOrDefault(neighbor, INFINITY)) {
                        costs.put(neighbor, newCost);
                        parents.put(neighbor, node);
                    }
                }
            }

            processed.add(node);
            node = findLowestCostNode();
        }
    }

    private String findLowestCostNode() {
        String lowestNode = null;
        double lowestCost = INFINITY;

        for (var entry : costs.entrySet()) {
            String node = entry.getKey();
            double cost = entry.getValue();

            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestNode = node;
            }
        }

        return lowestNode;
    }

    public Map<String, Double> getCosts() {
        return costs;
    }

    public List<String> getPath(String start, String target) {
        if (!costs.containsKey(target)) {
            return Collections.emptyList();
        }

        List<String> path = new ArrayList<>();
        String current = target;

        path.add(current);
        while (!current.equals(start)) {
            current = parents.get(current);
            if (current == null) {
                return Collections.emptyList();
            }
            path.add(current);
        }

        Collections.reverse(path);
        return path;
    }
}
