// Merge Two Sorted Arrays

// Problem Statement
// You are given two integer arrays:

// nums1 of length m + n (first m elements are valid, rest are 0 placeholders)
// nums2 of length n
// Both arrays are sorted in non-decreasing order.
// Merge nums2 into nums1 as one sorted array.
// You must modify nums1 in-place.

// Example:

// Input:
// nums1 = [1,2,3,0,0,0], m = 3
// nums2 = [2,5,6], n = 3
// Output:
// [1,2,2,3,5,6]

package Java.Arrays;

import java.util.Arrays;

public class MergeSortedArray {

    private static void merge(int[] nums1,int m,  int[] nums2, int n) {
        int[] result = new int[m+n];
        int i = 0, j = 0, k = 0;

         while (i < m && j < n) {
            if (nums1[i] < nums2[j]) {
                result[k++] = nums1[i++];
            } else {
                result[k++] = nums2[j++];
            }
        }

        while (i < m) {
            result[k++] = nums1[i++];
        }

        while (j < n) {
            result[k++] = nums2[j++];
        }

        for (int x = 0; x < m + n; x++) {
            nums1[x] = result[x];
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int[] nums2 = {2, 5, 6};
        merge(nums1, 3, nums2, 3);
        System.out.println(Arrays.toString(nums1));
    }

    
}
