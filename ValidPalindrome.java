//A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.
//Given a string s, return true if it is a palindrome, or false otherwise.
//Example 1:
//Input: s = "A man, a plan, a canal: Panama"
//Output: true
//Explanation: "amanaplanacanalpanama" is a palindrome.

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        // Convert to lowercase and remove non-alphanumeric characters
        StringBuilder cleaned = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                cleaned.append(Character.toLowerCase(c));
            }
        }

        // Check palindrome using two pointers
        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    public static void main(String[] args) {
        ValidPalindrome obj = new ValidPalindrome();

        System.out.println(obj.isPalindrome("A man, a plan, a canal: Panama")); // true
        System.out.println(obj.isPalindrome("race a car"));                     // false
        System.out.println(obj.isPalindrome(" "));                              // true
    }
}
