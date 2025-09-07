// Question 3: Contains Duplicate
// Given an integer array nums, return true if any value appears at least twice in the array,
//  and return false if every element is distinct.

// Example 1:

// Input: nums = [1,2,3,1]
// Output: true
// Example 2:

// Input: nums = [1,2,3,4]
// Output: false

package Java.Arrays;

public class ContainsDuplicates {
    public static boolean containsDuplicates (int[] nums){
        if (nums.length == 0) return false;

        for (int i = 0; i<nums.length; i++){
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,4,1};
        System.out.println("\nContains Duplicate: " + containsDuplicates(nums));
    }
}
