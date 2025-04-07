public class DivisibleDifference {

    public int differenceOfSums(int n, int m) {
        int num1 = 0; // sum of numbers not divisible by m
        int num2 = 0; // sum of numbers divisible by m

        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                num2 += i;
            } else {
                num1 += i;
            }
        }

        return num1 - num2;
    }

    // Example test method
    public static void main(String[] args) {
        DivisibleDifference obj = new DivisibleDifference();
        int result = obj.differenceOfSums(8, 2); // Custom input: n = 8, m = 2
        System.out.println("Result: " + result); // Expected: (1+3+5+7) - (2+4+6+8) = 16 - 20 = -4
    }
}
