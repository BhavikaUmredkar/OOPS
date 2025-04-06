//Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
//Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
//Example 1:
//Input: x = 123
//Output: 321

import java.util.Scanner;

class Solution {
    public int reverse(int x) {
        int rev = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;

            // Check for overflow/underflow
            if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && digit > 7)) {
                return 0;
            }

            if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && digit < -8)) {
                return 0;
            }

            rev = rev * 10 + digit;
        }

        return rev;
    }
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a 32-bit signed integer: ");
        int x = scanner.nextInt();

        Solution solution = new Solution();
        int reversed = solution.reverse(x);

        System.out.println("Reversed integer: " + reversed);
    }
}
