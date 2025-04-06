//Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//You can return the answer in any order.
//Example 1:
//Input: nums = [2,7,11,15], target = 9
//Output: [0,1]
//Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

import java.util.HashMap;

class TwoSumSolver {
    private int[] nums;
    private int target;

    // Constructor
    public TwoSumSolver(int[] nums, int target) {
        this.nums = nums;
        this.target = target;
    }

    // Method to find two indices
    public int[] findTwoSum() {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];

            if (map.containsKey(complement)) {
                return new int[]{map.get(complement), i};
            }

            map.put(nums[i], i);
        }

        // Since the problem states there is exactly one solution
        throw new IllegalArgumentException("No solution found");
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums1 = {2, 7, 11, 15};
        int target1 = 9;

        TwoSumSolver solver1 = new TwoSumSolver(nums1, target1);
        int[] result1 = solver1.findTwoSum();
        System.out.println("Output: [" + result1[0] + "," + result1[1] + "]");

        int[] nums2 = {3, 2, 4};
        int target2 = 6;

        TwoSumSolver solver2 = new TwoSumSolver(nums2, target2);
        int[] result2 = solver2.findTwoSum();
        System.out.println("Output: [" + result2[0] + "," + result2[1] + "]");

        int[] nums3 = {3, 3};
        int target3 = 6;

        TwoSumSolver solver3 = new TwoSumSolver(nums3, target3);
        int[] result3 = solver3.findTwoSum();
        System.out.println("Output: [" + result3[0] + "," + result3[1] + "]");
    }
}
