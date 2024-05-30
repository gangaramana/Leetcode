package cracking_the_coding_interview.premiun.lm_2068;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class AlmostEqual {
    public static void main(String[] args) {
        AlmostEqual almostEqual = new AlmostEqual();
        System.out.println(almostEqual.checkAlmostEquivalent("aaa", "bbbaaaaaaaa"));
    }

    public boolean checkAlmostEquivalent(String word1, String word2) {

/*   optimized solution
 int[] cnt = new int[26];

        for (int i = 0; i < word1.length(); i++) {
            cnt[word1.charAt(i) - 'a']++;
            cnt[word2.charAt(i) - 'a']--;
        }

        for (int i = 0; i < 26; i++) {
            if (Math.abs(cnt[i]) > 3) {
                return false;
            }
        }

        return true;
    }
 */
        HashMap<Character, Integer> map1 = loadToMap(word1);
        HashMap<Character, Integer> map2 = loadToMap(word2);
        Set<Character> characterSet = new HashSet<>();
        addToSet(characterSet, word1);
        addToSet(characterSet, word2);
        for (char c : characterSet) {
            if (Math.abs(map1.getOrDefault(c, 0) - map2.getOrDefault(c, 0)) <= 3) {
                map1.remove(c);
                map2.remove(c);
            } else {
                return false;
            }
        }
        return true;


    }

    private HashMap<Character, Integer> loadToMap(String word) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : word.toCharArray()) {
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }
        return hashMap;

    }

    private void addToSet(Set<Character> set, String word) {
        for (char c : word.toCharArray()) {
            set.add(c);
        }

    }

}
