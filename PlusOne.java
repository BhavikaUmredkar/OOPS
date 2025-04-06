//You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

//Increment the large integer by one and return the resulting array of digits.
//Example 1:

//Input: digits = [1,2,3]
//Output: [1,2,4]
//Explanation: The array represents the integer 123.
//Incrementing by one gives 123 + 1 = 124.
//Thus, the result should be [1,2,4].

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from end to start
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0; // Set current digit to 0 and carry over
        }

        // If all digits were 9, we need an extra digit at the start
        int[] result = new int[n + 1];
        result[0] = 1; // By default, all others are 0
        return result;
    }

    public static void main(String[] args) {
        PlusOne obj = new PlusOne();

        int[] input1 = {1, 2, 3};
        int[] input2 = {4, 3, 2, 1};

        printArray(obj.plusOne(input1)); // Output: [1, 2, 4]
        printArray(obj.plusOne(input2)); // Output: [4, 3, 2, 2]
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) System.out.print(", ");
        }
        System.out.println("]");
    }
}
