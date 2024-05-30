package contest_1;

import java.util.HashSet;
import java.util.Set;

public class NoRepeatedCharacters {
    public static void main(String[] args) {
NoRepeatedCharacters noRepeatedCharacters=new NoRepeatedCharacters();
int resu=noRepeatedCharacters.numKLenSubstrNoRepeats("havefunonleetcode",5);
        System.out.println(resu);
    }

    public int numKLenSubstrNoRepeats(String s, int k) {
        int[] indices=new int[26];
        int result = 0;
        if (s.length() < k) {
            return result;
        }
        for (int i = 0; i <= s.length() - k; ) {
            Set<Character> set = new HashSet<>();
            int j = i;
            while (j - i < k) {
                if (!set.add(s.charAt(j))) {
                    break;
                }
                indices[s.charAt(j)-'a']=j;
                j++;
            }
            if (j - i == k) {
                result++;
                i++;
            } else {
                i = indices[s.charAt(j)-'a']+1;
            }
        }
        return result;
    }
}
