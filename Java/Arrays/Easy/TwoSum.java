// Question
// Given an array nums and a target value,
//  find two numbers such that they add up to the target. 
// Return their indices.

package Java.Arrays.Easy;

public class TwoSum {
    public static int[] twoSum(int[] nums, int target){
        for (int i=0; i<nums.length; i++ ){
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return nums;
    }
     public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 22;
        int[] result = twoSum(nums, target);
        if (result.length == 2) {
            System.out.println("\n\nIndices: " + result[0] + " and " + result[1]);
        } else {
            System.out.println("No pair found.");
        }
    }
}
