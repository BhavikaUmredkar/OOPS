//Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

//Example 1:
//Input: n = 3
//Output: ["((()))","(()())","(())()","()(())","()()()"]

import java.util.ArrayList;
import java.util.List;

public class ParenthesesGenerator {

    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, "", 0, 0, n);
        return result;
    }

    private void backtrack(List<String> result, String current, int open, int close, int max) {
        if (current.length() == 2 * max) {
            result.add(current);
            return;
        }

        if (open < max) {
            backtrack(result, current + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(result, current + ")", open, close + 1, max);
        }
    }

    public static void main(String[] args) {
        ParenthesesGenerator obj = new ParenthesesGenerator();

        System.out.println(obj.generateParenthesis(3));
        System.out.println(obj.generateParenthesis(1));
    }
}
