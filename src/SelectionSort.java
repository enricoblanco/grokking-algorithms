import java.util.ArrayList;
import java.util.List;

public class SelectionSort {

    public List<Integer> doSelectionSort(List<Integer> arr) {
        List<Integer> newArr = new ArrayList<>(arr.size());

        int size = arr.size();
        for (int i = 0; i < size; i++) {
            int smallest = doFindSmallest(arr);
            newArr.add(arr.get(smallest));

            arr.remove(smallest);
        }

        return newArr;
    }

    private int doFindSmallest(List<Integer> arr) {
        int smallest = arr.getFirst();
        int smallestIndex = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) < smallest) {
                smallest = arr.get(i);
                smallestIndex = i;
            }
        }
        return smallestIndex;
    }
}