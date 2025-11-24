import java.util.*;

public class BreadthFirstSearch {

    public boolean search(String name, Map<String, List<String>> graph){
        Queue<String> searchQueue = new ArrayDeque<>(graph.get(name));
        List<String> searched = new ArrayList<>();

        while(!searchQueue.isEmpty()){
            String person = searchQueue.poll();

            if(!searched.contains(person)){
                if(isAMangoSeller(person)){
                    System.out.println(person + " is a mango seller.");
                    return true;
                }

                searched.add(person);
                searchQueue.addAll(graph.get(person));
            }
        }
        System.out.println("Nobody is a mango seller.");
        return false;
    }

    private boolean isAMangoSeller(String name){
        return name.endsWith("m");
    }
}
