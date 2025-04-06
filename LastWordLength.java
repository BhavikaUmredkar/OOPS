//Given a string s consisting of words and spaces, return the length of the last word in the string.
//A word is a maximal substring consisting of non-space characters only.
//Example 1:
//Input: s = "Hello World"
//Output: 5
//Explanation: The last word is "World" with length 5.

public class LastWordLength {

    public int lengthOfLastWord(String s) {
        s = s.trim(); // Remove leading/trailing spaces
        int lastSpaceIndex = s.lastIndexOf(' ');
        return s.length() - lastSpaceIndex - 1;
    }

    public static void main(String[] args) {
        LastWordLength obj = new LastWordLength();

        String s1 = "Hello Everyone";
        String s2 = "   fly me   to   the moon  ";
        String s3 = "luffy is still joyboy";

        System.out.println("Input: \"" + s1 + "\" ➞ Output: " + obj.lengthOfLastWord(s1)); // 8
        System.out.println("Input: \"" + s2 + "\" ➞ Output: " + obj.lengthOfLastWord(s2)); // 4
        System.out.println("Input: \"" + s3 + "\" ➞ Output: " + obj.lengthOfLastWord(s3)); // 6
    }
}
