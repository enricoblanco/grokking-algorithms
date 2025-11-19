import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class QuickSort {

    public List<Integer> doQuickSort(List<Integer> nums){
        if(nums.size() < 2){
            return nums;

        } else {
            Integer pivot = nums.getFirst();

            List<Integer> less = nums.stream()
                    .skip(1)
                    .filter(num -> num <= pivot)
                    .toList();

            List<Integer> greater = nums.stream()
                    .skip(1)
                    .filter(num -> num > pivot)
                    .toList();

            return Stream.of(doQuickSort(less).stream(),
                            Stream.of(pivot),
                            doQuickSort(greater).stream())
                    .flatMap(Function.identity())
                    .collect(Collectors.toList());

        }
    }

}