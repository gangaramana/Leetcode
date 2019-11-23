package problem_890;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class FindAndReplace {
    public static void main(String[] args) {
        FindAndReplace findAndReplace = new FindAndReplace();
        System.out.println(findAndReplace.findAndReplacePattern(new String[]{"abc", "deq", "mee", "aqq", "dkd", "ccc"}, "abb"));
    }

    public List<String> findAndReplacePattern(String[] words, String pattern) {
        int[] noPattern = new int[pattern.length()];
        List<String> list = new ArrayList<>();
        int no = 0;
        HashMap<Character, Integer> hashMap = new HashMap<>();
        for (char c : pattern.toCharArray()) {
            if (!hashMap.containsKey(c)) {
                hashMap.put(c, no++);
            }
        }
        int i = 0;
        for (char c : pattern.toCharArray()) {
            noPattern[i++] = hashMap.get(c);
        }

        boolean flag = true;
        for (String word : words) {
            hashMap.clear();
            no = 0;
            int k = 0;
            for (char c : word.toCharArray()) {

                if (!hashMap.containsKey(c)) {
                    hashMap.put(c, no++);
                }
            }
            for (char c : word.toCharArray()) {
                if (noPattern[k++] != hashMap.get(c)) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                list.add(word);
            }
            flag = true;
        }
        return list;

    }
}
