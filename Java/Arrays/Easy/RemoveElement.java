// Remove Element

// Given an integer array nums and an integer val,remove all occurrences of val in nums in-place.
// The relative order of the elements may be changed.
// Return the number of elements in nums which are not equal to val.
// Example:
// Input: nums = [3,2,2,3], val = 3
// Output: 2, nums = [2,2,_,_] (The underscores represent ignored values.)

package Java.Arrays.Easy;

public class RemoveElement {

    public static void main(String[] args) {
        int[] nums = {3,2,2,3};
        int val = 2;
        int k = removeElement(nums, val);

        System.out.println("New Length: " + k);
        System.out.println("Array after removal: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }

    public static int removeElement(int[] nums,int val){
        int k = 0; 
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }return k;
    }
    
}