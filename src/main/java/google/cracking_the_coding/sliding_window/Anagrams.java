package google.cracking_the_coding.sliding_window;

import java.util.HashMap;
import java.util.Map;

public class Anagrams {
    public static void main(String[] args) {
        Anagrams anagrams = new Anagrams();
        System.out.println(anagrams.search("for", "forxxorfxdofr"));

    }


    int search(String pat, String txt) {

        Map<Character, Integer> patMap = new HashMap();
        for (char c : pat.toCharArray()) {
            patMap.put(c, patMap.getOrDefault(c, 0) + 1);
        }

        int i = 0, j = 0, res = 0;

        while (j < txt.length() ) {

            if (j - i + 1 == pat.length()) {
                if (patMap.containsKey(txt.charAt(j))) {
                    patMap.put(txt.charAt(j), patMap.get(txt.charAt(j)) - 1);

                }

                if (validate(patMap)) {
                    res++;
                }

                if (patMap.containsKey(txt.charAt(i))) {
                    patMap.put(txt.charAt(i), patMap.get(txt.charAt(i)) + 1);
                }
                i++;
                j++;
            }
            else{
                if (patMap.containsKey(txt.charAt(j))) {
                    patMap.put(txt.charAt(j), patMap.get(txt.charAt(j)) - 1);

                }
                j++;
            }


        }
        return res;
    }

    boolean validate(Map<Character, Integer> map) {

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {

            if (entry.getValue() != 0) {
                return false;
            }

        }
        return true;

    }


}

