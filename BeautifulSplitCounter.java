//You are given an array nums.
//A split of an array nums is beautiful if:
//The array nums is split into three subarrays: nums1, nums2, and nums3, such that nums can be formed by concatenating nums1, nums2, and nums3 in that order.
//The subarray nums1 is a prefix of nums2 OR nums2 is a prefix of nums3.
//Return the number of ways you can make this split.

//Example 1:
//Input: nums = [1,1,2,1]
//Output: 2
//Explanation:
//The beautiful splits are:
//A split with nums1 = [1], nums2 = [1,2], nums3 = [1].
//A split with nums1 = [1], nums2 = [1], nums3 = [2,1].

import java.util.*;

public class BeautifulSplitCounter {

    // Method to count beautiful splits
    public int countBeautifulSplits(int[] nums) {
        int n = nums.length;
        int count = 0;

        // Try all valid split positions
        for (int i = 1; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                int[] nums1 = Arrays.copyOfRange(nums, 0, i);
                int[] nums2 = Arrays.copyOfRange(nums, i, j);
                int[] nums3 = Arrays.copyOfRange(nums, j, n);

                if (isPrefix(nums1, nums2) || isPrefix(nums2, nums3)) {
                    count++;
                }
            }
        }

        return count;
    }

    // Helper method to check if a is a prefix of b
    private boolean isPrefix(int[] a, int[] b) {
        if (a.length > b.length) return false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    // Example usage
    public static void main(String[] args) {
        BeautifulSplitCounter counter = new BeautifulSplitCounter();

        // Example 1
        int[] nums1 = {2, 2, 3, 2}; // Custom input
        System.out.println("Beautiful Splits: " + counter.countBeautifulSplits(nums1)); // Output: 2

        // Example 2
        int[] nums2 = {4, 5, 6, 4, 5}; // Custom input
        System.out.println("Beautiful Splits: " + counter.countBeautifulSplits(nums2)); // Output depends on valid prefixes

        // Example 3
        int[] nums3 = {1, 2, 3, 4}; // Should return 0
        System.out.println("Beautiful Splits: " + counter.countBeautifulSplits(nums3));
    }
}
