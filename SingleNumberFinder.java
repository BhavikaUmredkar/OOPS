//Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
//You must implement a solution with a linear runtime complexity and use only constant extra space.
//Example 1:
//Input: nums = [2,2,1]
//Output: 1

public class SingleNumberFinder {

    public int singleNumber(int[] nums) {
        int result = 0;

        for (int num : nums) {
            result ^= num; // XOR cancels out duplicate numbers
        }

        return result;
    }

    public static void main(String[] args) {
        SingleNumberFinder obj = new SingleNumberFinder();

        int[] nums1 = {2, 2, 1};
        int[] nums2 = {3, 3, 4, 0, 4};
        int[] nums3 = {7};

        System.out.println("Output: " + obj.singleNumber(nums1)); // 1
        System.out.println("Output: " + obj.singleNumber(nums2)); // 4
        System.out.println("Output: " + obj.singleNumber(nums3)); // 1
    }
}
