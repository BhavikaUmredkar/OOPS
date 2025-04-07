//Given a string array words, return the maximum value of length(word[i]) * length(word[j]) where the two words do not share common letters. If no such two words exist, return 0.

//Example 1:
//Input: words = ["abcw","baz","foo","bar","xtfn","abcdef"]
//Output: 16
//Explanation: The two words can be "abcw", "xtfn".

//Example 3:
//Input: words = ["a","aa","aaa","aaaa"]
//Output: 0
//Explanation: No such pair of words.

public class MaxProductWordLengths {

    public int maxProduct(String[] words) {
        int n = words.length;
        int[] masks = new int[n];
        int[] lens = new int[n];
        
        // Build bit masks and store word lengths
        for (int i = 0; i < n; i++) {
            int mask = 0;
            for (char c : words[i].toCharArray()) {
                mask |= 1 << (c - 'a');
            }
            masks[i] = mask;
            lens[i] = words[i].length();
        }

        int max = 0;
        // Compare every pair of words
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if ((masks[i] & masks[j]) == 0) {
                    max = Math.max(max, lens[i] * lens[j]);
                }
            }
        }

        return max;
    }

    // Sample usage
    public static void main(String[] args) {
        MaxProductWordLengths obj = new MaxProductWordLengths();

        String[] words1 = {"car", "bike", "road", "map"};
        String[] words2 = {"hi", "hello", "bye", "good"};
        String[] words3 = {"aa", "aa", "aa"};

        System.out.println(obj.maxProduct(words1)); // Expected: 12 ("bike", "road")
        System.out.println(obj.maxProduct(words2)); // Expected: 16 ("hello", "good")
        System.out.println(obj.maxProduct(words3)); // Expected: 0
    }
}
