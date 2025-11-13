import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearch b = new BinarySearch();
        SelectionSort s = new SelectionSort();
        Recursion r = new Recursion();

        int[] nums = new int[] {1,2,3,4,5,6};

        System.out.println(b.doBinarySearch(nums, 2));

        List<Integer> nums2 = new ArrayList<>();
        nums2.add(1);
        nums2.add(5);
        nums2.add(2);
        nums2.add(7);
        nums2.add(3);

        System.out.println(s.doSelectionSort(nums2));

        System.out.println(r.factorial(4));
    }
}