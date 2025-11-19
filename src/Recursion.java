public class Recursion {

    public int doFactorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num <= 1){
            return 1;
        }
        return num * doFactorial(num - 1);
    }

    public int doSum(int[] nums) {
        return doSumRecursive(nums, 0);
    }

    private int doSumRecursive(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        return nums[index] + doSumRecursive(nums, index + 1);
    }

    public int doFindBiggest(int[] nums){
        return doFindBiggestRecursive(nums, 0, 0);
    }

    private int doFindBiggestRecursive(int[] nums, int index, int biggest){
        if (index == nums.length) {
            return biggest;
        }
        if(nums[index] > biggest){
            return doFindBiggestRecursive(nums, index + 1, nums[index]);
        }

        return doFindBiggestRecursive(nums, index + 1, biggest);
    }

    public int binarySearch(int[] nums, int target){
        return doBinarySearchRecursive(nums, target, 0, nums.length - 1);
    }

    private int doBinarySearchRecursive(int[] nums, int target, int lowestIndex,  int highestIndex){
        if(highestIndex<lowestIndex){
            return -1;
        }

        int middleIndex =  (highestIndex + lowestIndex) / 2;
        int middleNumber = nums[middleIndex];

        if(middleNumber == target){
            return middleIndex;
        }
        if(middleNumber>target){
            return doBinarySearchRecursive(nums, target, lowestIndex,middleIndex - 1);
        } else {
            return doBinarySearchRecursive(nums, target, middleIndex + 1, highestIndex);
        }
    }
}
