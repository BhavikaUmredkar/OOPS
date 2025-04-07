//You are given two integers, n and k.
//An array of distinct positive integers is called a k-avoiding array if there does not exist any pair of distinct elements that sum to k.
//Return the minimum possible sum of a k-avoiding array of length n.

//Example 1:
//Input: n = 5, k = 4
//Output: 18
//Explanation: Consider the k-avoiding array [1,2,4,5,6], which has a sum of 18.
//It can be proven that there is no k-avoiding array with a sum less than 18.

import java.util.HashSet;
import java.util.Set;

public class KAvoidingArray {
    
    public static int minimumSum(int n, int k) {
        Set<Integer> used = new HashSet<>();
        int sum = 0;
        int num = 1;

        while (used.size() < n) {
            if (!used.contains(k - num)) {
                used.add(num);
                sum += num;
            }
            num++;
        }

        return sum;
    }

    public static void main(String[] args) {
        // Custom example: n = 4, k = 7
        int n = 4;
        int k = 7;
        int result = minimumSum(n, k);
        System.out.println("Minimum sum of k-avoiding array: " + result);
    }
}
