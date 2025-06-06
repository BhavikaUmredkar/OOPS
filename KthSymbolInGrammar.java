//We build a table of n rows (1-indexed). We start by writing 0 in the 1st row. Now in every subsequent row, we look at the previous row and replace each occurrence of 0 with 01, and each occurrence of 1 with 10.
//For example, for n = 3, the 1st row is 0, the 2nd row is 01, and the 3rd row is 0110.
//Given two integer n and k, return the kth (1-indexed) symbol in the nth row of a table of n rows.

//Example 1:
//Input: n = 1, k = 1
//Output: 0
//Explanation: row 1: 0

public class KthSymbolInGrammar {

    // Method to find the k-th symbol in the n-th row
    public static int findKthSymbol(int n, int k) {
        // Base case
        if (n == 1 && k == 1) return 0;

        // Recursively find the parent symbol
        int parent = findKthSymbol(n - 1, (k + 1) / 2);

        // Determine current symbol based on parent and whether k is odd or even
        if (k % 2 == 0) {
            return parent == 0 ? 1 : 0;
        } else {
            return parent;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int n = 4;
        int k = 5;
        int result = findKthSymbol(n, k);
        System.out.println("The " + k + "th symbol in row " + n + " is: " + result);
    }
}
