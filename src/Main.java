import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        SelectionSort selectionSort = new SelectionSort();
        Recursion recursion = new Recursion();
        QuickSort quickSort = new QuickSort();
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        var nums = new int[] {1,2,3,4,5,6};

        System.out.println(binarySearch.doBinarySearch(nums, 2));

        var nums2 = new ArrayList<Integer>();
        nums2.add(1);
        nums2.add(5);
        nums2.add(2);
        nums2.add(7);
        nums2.add(3);

        System.out.println(selectionSort.doSelectionSort(nums2));

        System.out.println(recursion.doFactorial(4));
        System.out.println(recursion.doSum(nums));
        System.out.println(recursion.doFindBiggest(nums));
        System.out.println(recursion.binarySearch(nums, 2));

        System.out.println(nums2);

        System.out.println(quickSort.doQuickSort(Arrays.asList(10, 5, 2, 3)));

        Map<String, List<String>> graph = new HashMap<>();
        graph.put("you", Arrays.asList("alice", "bob", "claire"));
        graph.put("bob", Arrays.asList("anuj", "peggy"));
        graph.put("alice", List.of("peggy"));
        graph.put("claire", Arrays.asList("thom", "jonny"));
        graph.put("anuj", Collections.emptyList());
        graph.put("peggy", Collections.emptyList());
        graph.put("thom", Collections.emptyList());
        graph.put("jonny", Collections.emptyList());

        System.out.println(bfs.search("you", graph));

        Map<String, Map<String, Double>> graphDijkstra = new HashMap<>();

        Map<String, Double> a = new HashMap<>();
        a.put("B", 5.0);
        a.put("C", 2.0);
        graphDijkstra.put("A", a);

        Map<String, Double> b = new HashMap<>();
        b.put("D", 4.0);
        graphDijkstra.put("B", b);

        Map<String, Double> c = new HashMap<>();
        c.put("B", 8.0);
        c.put("D", 7.0);
        graphDijkstra.put("C", c);

        graphDijkstra.put("D", new HashMap<>());

        Dijkstra path = new Dijkstra(graphDijkstra);

        path.compute("A");

        System.out.println("Costs:");
        path.getCosts().forEach((k, v) -> System.out.println(k + " = " + v));

        System.out.println("\nPath to D:");
        System.out.println(path.getPath("A", "D"));

    }
}