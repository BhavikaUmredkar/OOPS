//Given an integer n represented as a string, return the smallest good base of n.
//We call k >= 2 a good base of n, if all digits of n base k are 1's.

//Example 1:
//Input: n = "13"
//Output: "3"
//Explanation: 13 base 3 is 111.

public class GoodBaseFinder {
    public String smallestGoodBase(String n) {
        long num = Long.parseLong(n);
        int maxM = (int)(Math.log(num + 1) / Math.log(2));  // Max number of digits (all 1s)

        for (int m = maxM; m >= 1; m--) {
            long left = 2, right = (long)Math.pow(num, 1.0 / m) + 1;

            while (left <= right) {
                long k = left + (right - left) / 2;
                long sum = 1, curr = 1;

                for (int i = 1; i <= m; i++) {
                    curr *= k;
                    sum += curr;
                    if (sum > num) break;
                }

                if (sum == num) return String.valueOf(k);
                else if (sum < num) left = k + 1;
                else right = k - 1;
            }
        }

        return String.valueOf(num - 1);
    }

    // Main method for testing
    public static void main(String[] args) {
        GoodBaseFinder finder = new GoodBaseFinder();

        String input = "121";  // You can change this input
        String result = finder.smallestGoodBase(input);

        System.out.println("Smallest good base for " + input + " is: " + result);
    }
}
