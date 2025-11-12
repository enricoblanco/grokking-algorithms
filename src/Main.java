import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        SelectionSort selectionSort = new SelectionSort();

        int[] nums = new int[] {1,2,3,4,5,6};

        System.out.println(binarySearch.doBinarySearch(nums, 2));

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(5);
        nums2.add(2);
        nums2.add(7);
        nums2.add(3);

        System.out.println(selectionSort.doSelectionSort(nums2));
    }
}