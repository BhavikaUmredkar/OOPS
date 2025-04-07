//You are given an integer array nums. In one operation, you can add or subtract 1 from any element of nums.
//Return the minimum number of operations to make all elements of nums divisible by 3.

//Example 1:
//Input: nums = [1,2,3,4]
//Output: 3

public class DivisibleByThreeHelper {
    
    public static int minOperationsToMakeDivisibleBy3(int[] nums) {
        int operations = 0;

        for (int num : nums) {
            int remainder = num % 3;
            if (remainder != 0) {
                operations += Math.min(remainder, 3 - remainder);
            }
        }

        return operations;
    }
    
    // Optional: Sample usage if needed
    public static void main(String[] args) {
        int[] nums = {4, 7, 12, 5}; // custom example
        int result = minOperationsToMakeDivisibleBy3(nums);
        System.out.println("Minimum operations: " + result); // Output: 3
    }
}
