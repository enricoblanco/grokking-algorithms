public class BinarySearch {

    public static Integer doBinarySearch(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while(low<=high){
            int middle = (high+low)/2;
            int current = nums[middle];
            if(current == target){
                return middle;
            }
            if(current>target){
                high = middle - 1;
            } else {
                low = middle + 1;
            }
        }
        return null;
    }
}
