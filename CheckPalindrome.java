//Given an integer x, return true if x is a palindrome, and false otherwise.
//Example 1:
//Input: x = 121
//Output: true
//Explanation: 121 reads as 121 from left to right and from right to left.

import java.util.Scanner;

class PalindromeChecker {
    public boolean isPalindrome(int x) {
        // Negative numbers and numbers ending with 0 (but not 0 itself) are not palindromes
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversed = 0;

        // Reverse half of the number
        while (x > reversed) {
            int digit = x % 10;
            reversed = reversed * 10 + digit;
            x /= 10;
        }

        // For even length: x == reversed
        // For odd length: x == reversed / 10
        return x == reversed || x == reversed / 10;
    }
}

public class CheckPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");
        int number = scanner.nextInt();

        PalindromeChecker checker = new PalindromeChecker();
        boolean result = checker.isPalindrome(number);

        System.out.println("Is palindrome? " + result);
    }
}
