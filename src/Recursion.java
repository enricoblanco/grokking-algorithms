public class Recursion {

    public int factorial(int num){
        if (num < 0) {
            throw new IllegalArgumentException("Factorial is not defined for negative numbers.");
        }
        if(num <= 1){
            return 1;
        }
        return num * factorial(num - 1);
    }

    public int sum(int[] nums) {
        return sumRecursive(nums, 0);
    }

    private int sumRecursive(int[] nums, int index) {
        if (index == nums.length) {
            return 0;
        }

        return nums[index] + sumRecursive(nums, index + 1);
    }

    public int findBiggest(int[] nums){
        return findBiggestRecursive(nums, 0, 0);
    }

    private int findBiggestRecursive(int[] nums, int index, int biggest){
        if (index == nums.length) {
            return biggest;
        }
        if(nums[index] > biggest){
            return findBiggestRecursive(nums, index + 1, nums[index]);
        }

        return findBiggestRecursive(nums, index + 1, biggest);
    }

    public int binarySearch(int[] nums, int target){
        return binarySearchRecursive(nums, target, 0, nums.length - 1);
    }

    private int binarySearchRecursive(int[] nums, int target, int lowestIndex,  int highestIndex){
        if(highestIndex<lowestIndex){
            return -1;
        }

        int middleIndex =  (highestIndex + lowestIndex) / 2;
        int middleNumber = nums[middleIndex];

        if(middleNumber == target){
            return middleIndex;
        }
        if(middleNumber>target){
            return binarySearchRecursive(nums, target, lowestIndex,middleIndex - 1);
        } else {
            return binarySearchRecursive(nums, target, middleIndex + 1, highestIndex);
        }
    }
}
