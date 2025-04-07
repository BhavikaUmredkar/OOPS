//You are given two integer arrays nums1 and nums2 both of the same length. The advantage of nums1 with respect to nums2 is the number of indices i for which nums1[i] > nums2[i].
//Return any permutation of nums1 that maximizes its advantage with respect to nums2.

//Example 1:
//Input: nums1 = [2,7,11,15], nums2 = [1,10,4,11]
//Output: [2,11,7,15]

import java.util.*;

public class AdvantagePermutation {

    public static int[] getAdvantagePermutation(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] result = new int[n];

        // Sort nums1
        Arrays.sort(nums1);

        // Store original indices of nums2
        Integer[] indices = new Integer[n];
        for (int i = 0; i < n; i++) {
            indices[i] = i;
        }

        // Sort indices based on values in nums2 (descending)
        Arrays.sort(indices, (a, b) -> Integer.compare(nums2[b], nums2[a]));

        int low = 0, high = n - 1;

        for (int i = 0; i < n; i++) {
            int index = indices[i];
            if (nums1[high] > nums2[index]) {
                result[index] = nums1[high--];
            } else {
                result[index] = nums1[low++];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums1 = {5, 17, 3, 9};
        int[] nums2 = {4, 15, 8, 2};

        int[] result = getAdvantagePermutation(nums1, nums2);

        System.out.println("Advantage Permutation:");
        System.out.println(Arrays.toString(result));
    }
}
