//Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
//An input string is valid if:
//Open brackets must be closed by the same type of brackets.
//Open brackets must be closed in the correct order.
//Every close bracket has a corresponding open bracket of the same type.
 
//Example 1:
//Input: s = "()"
//Output: true

//Example 2:
//Input: s = "()[]{}"
//Output: true

import java.util.Stack;

public class BracketValidator {

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // Push opening brackets
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            }
            // Check matching closing brackets
            else {
                if (stack.isEmpty()) return false;

                char top = stack.pop();
                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        BracketValidator obj = new BracketValidator();

        System.out.println(obj.isValid("()"));       // true
        System.out.println(obj.isValid("()[]{}"));   // true
        System.out.println(obj.isValid("(]"));       // false
        System.out.println(obj.isValid("([])"));     // true
    }
}
