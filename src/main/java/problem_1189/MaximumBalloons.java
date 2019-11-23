package problem_1189;

import java.util.HashMap;
import java.util.Map;

public class MaximumBalloons {
    public static void main(String[] args) {
        MaximumBalloons maximumBalloons = new MaximumBalloons();
        int res = maximumBalloons.maxNumberOfBalloons("loonbalxballpoon");
        System.out.println(res);
    }

    public int maxNumberOfBalloons(String text) {
        int[] ha = new int[26];
        String bal = "balloon";
        for (char c : text.toLowerCase().toCharArray()) {
            ha[c - 97] = ha[c - 97] + 1;
        }

        HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
        for (char c : bal.toCharArray()) {
            if (characterIntegerHashMap.containsKey(c)) {
                characterIntegerHashMap.put(c, characterIntegerHashMap.get(c) + 1);
            } else {
                characterIntegerHashMap.put(c, 1);
            }
        }
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Character, Integer> entry : characterIntegerHashMap.entrySet()) {
            if (ha[entry.getKey() - 97] == 0) {
                return 0;
            }
            min = Math.min(min, ha[entry.getKey()-97] / entry.getValue());

        }

        return min;

    }
}
