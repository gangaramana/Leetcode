package contest_1;

import java.util.Arrays;

public class KeyPress {
    public static void main(String[] args) {
        KeyPress keyPress = new KeyPress();
        char c = keyPress.slowestKey(new int[]{1, 2}, "ba");
        System.out.println(c);
    }

    public char slowestKey(int[] releaseTimes, String keysPressed) {
        if (keysPressed.length() == 0) {
            return ' ';
        }
        int[] duration = new int[26];
        char maxKey = ' ';
        int maxDuration = Integer.MIN_VALUE;
        Arrays.fill(duration, 0);
        for (int i = 0; i < keysPressed.length(); i++) {
            if (i == 0) {
                maxKey = keysPressed.charAt(i);
                duration[keysPressed.charAt(i) - 'a'] = duration[keysPressed.charAt(i) - 'a'] + releaseTimes[0];
                maxDuration = releaseTimes[i];
            } else {
                duration[keysPressed.charAt(i) - 'a'] = duration[keysPressed.charAt(i) - 'a'] + releaseTimes[i] - releaseTimes[i - 1];
                if (maxDuration < duration[keysPressed.charAt(i) - 'a']) {
                    maxDuration = duration[keysPressed.charAt(i) - 'a'];
                    maxKey = keysPressed.charAt(i);
                } else if (maxDuration == duration[keysPressed.charAt(i) - 'a'] && keysPressed.charAt(i) > maxKey) {
                    maxKey = keysPressed.charAt(i);
                }
            }
        }

        return maxKey;
    }
}
