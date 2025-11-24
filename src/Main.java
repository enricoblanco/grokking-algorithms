import java.util.*;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        SelectionSort selectionSort = new SelectionSort();
        Recursion recursion = new Recursion();
        QuickSort quickSort = new QuickSort();
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        int[] nums = new int[] {1,2,3,4,5,6};

        System.out.println(binarySearch.doBinarySearch(nums, 2));

        List<Integer> nums2 = new ArrayList<>();
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
    }
}