package problem_3;

import java.util.HashMap;
import java.util.Map;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        LongestSubstringWithoutRepeating longestSubstringWithoutRepeating = new LongestSubstringWithoutRepeating();
        System.out.println(longestSubstringWithoutRepeating.lengthOfLongestSubstring("abcabcbbhhjhjfhjfhjhhhfhhhhhhfhjsjsjjsjsjsjsjfhf"));

    }

    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int[] lookup = new int[26];
        int sum = 0;
        int tempSum = 0;
        char[] c = s.toLowerCase().toCharArray();
        int i;
        for (i = 0; i < c.length; i++) {
            if (lookup[c[i] - 97] != 0) {
                tempSum = i - lookup[c[i] - 97] + 1;
                start = lookup[c[i] - 97];
                lookup[c[i] - 97] = i + 1;
                break;
            } else {
                lookup[c[i] - 97] = i + 1;
                sum++;
            }

        }
        for (i = i + 1; i < c.length; i++) {
            if (lookup[c[i] - 97] == 0 || lookup[c[i] - 97] < start && !(lookup[c[i] - 97] < i)) {
                lookup[c[i] - 97] = i + 1;
                tempSum++;
            } else {
                if (tempSum > sum) {
                    sum = tempSum;
                }
                tempSum = i - lookup[c[i] - 97] + 1;
                start = lookup[c[i] - 97];
                lookup[c[i] - 97] = i + 1;

            }
        }
        return sum > tempSum ? sum : tempSum;

    }

    public int lengthOfLongestSubstring_efficient(String s) {
        int maxSubstringLenght = 0;
        int[] charArray = new int[128];
        for (int i = 0, j = 0; j < s.length(); j++) {
            if (charArray[s.charAt(j)] > 0) {
                i = Math.max(charArray[s.charAt(j)], i);
            }
            maxSubstringLenght = Math.max(maxSubstringLenght, j - i + 1);
            charArray[s.charAt(j)] = j + 1;
        }
        return maxSubstringLenght;
    }


}
