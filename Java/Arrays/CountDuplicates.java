package Java.Arrays;

public class CountDuplicates {

    public static int countDuplicates(int[] nums) {
        int n = nums.length;
        boolean[] visited = new boolean[n];
        int duplicateTypes = 0;

        for (int i = 0; i < n; i++) {
            if (visited[i]) continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                    visited[j] = true;
                }
            }

            if (count > 1) {
                System.out.println("Duplicate value: " + nums[i] + ", Count: " + count);
                visited[i] = true;
                duplicateTypes++;
            }
        }

        return duplicateTypes;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 4, 1, 2, 4, 5, 6, 4};
        int totalDupes = countDuplicates(nums);
        System.out.println("Total Duplicated Values: " + totalDupes);
    }
}
