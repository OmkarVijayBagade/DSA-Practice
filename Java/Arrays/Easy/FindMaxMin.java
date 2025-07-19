package Java.Arrays.Easy;

public class FindMaxMin {
    public static int[] findMaxMin(int[] nums){
        if (nums.length == 0) {
            System.out.println("Array is empty.");
            return nums ;
        }
        int maxElement = nums[0];
        int minElement = nums[0];

        for (int num : nums) {
            if (num > maxElement) {
                maxElement = num;
            }
            if (num < minElement) {
                minElement = num;
            }
        }
        System.out.println("Maximum: " + maxElement);
        System.out.println("Minimum: " + minElement);
        return nums;
    }
    public static void main(String[] args) {
        int[] nums = {5, 2, 9, 1, 7};
        findMaxMin(nums);
    }
    
}
