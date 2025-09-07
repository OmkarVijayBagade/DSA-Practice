// Given an integer array nums, move all 0's to the end of it while maintaining 
// the relative order of the non-zero elements.

// Example 1:

// Input: nums = [0,1,0,3,12]
// Output: [1,3,12,0,0]
// Example 2:

// Input: nums = [0]
// Output: [0]
package Java.Arrays;

public class MoveZeroes {
    public static int[] moveZeroes(int[] nums){
        int index = 0;

        for (int i = 0; i<nums.length; i++){
           if (nums[i] != 0) {
                nums[index] = nums[i];
                index++;
           }
        }
        while (index < nums.length) {
            nums[index] = 0;
            index++;
        }
        return nums;
    }
    public static void main (String[] args){
        int[] nums = {0,1,0,3,12};
        moveZeroes(nums);
        System.out.println("\nResults: ");
        for (int num : nums){
            System.out.print(num+" ");
        }
    }
}
