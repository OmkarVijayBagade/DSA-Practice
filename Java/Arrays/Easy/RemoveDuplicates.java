//remove duplicates from sorted array
//Given a sorted array, remove the duplicates in-place such that each element 
//appears only once and return the new length.
package Java.Arrays.Easy;

public class RemoveDuplicates {
     public static int removeDuplicates(int[] nums){
        if (nums.length == 0) return 0;

        int i = 0; 

        for (int j=1; j<nums.length; j++){
            if (nums[i] != nums[j]) {
                i++;
                nums[i] = nums[j];

            }
        }
        return i+1;
     }

     public static void main(String[] args) {
        int[] nums = {1,1,2,2,3};
        System.out.println(removeDuplicates(nums));

     }
}
