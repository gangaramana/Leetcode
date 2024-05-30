package problem_1048;

import java.util.Arrays;

public class LongestStringChain {
    public static void main(String[] args) {
        LongestStringChain longestStringChain = new LongestStringChain();
        System.out.println(longestStringChain.longestStrChain(new String[]{"a", "b", "ba", "bca", "bda", "bdca"}));
    }

    public int longestStrChain(String[] words) {
        return longestStrChainDP(words);
    }


    private int longestStrChainDP(String[] words) {
        int solution = 0;
        int[] dp = new int[words.length + 1];
        Arrays.fill(dp, 1);
        for (int i = 0; i < words.length; i++) {
            for (int j = 0; j < i; j++) {
                if (validateString(words[j], words[i])) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            solution = Math.max(dp[i], solution);
        }
        return solution;
    }

    private boolean validateString(String str1, String str2) {
        if (str1.length() + 1 != str2.length()) {
            return false;
        }
        int diff = 0;
        return true;
    }
}
