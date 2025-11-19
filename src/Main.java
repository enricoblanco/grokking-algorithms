import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        SelectionSort selectionSort = new SelectionSort();
        Recursion recursion = new Recursion();
        QuickSort quickSort = new QuickSort();

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
    }
}