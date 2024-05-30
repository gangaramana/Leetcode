package google.cracking_the_coding.problem_76;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.minWindow("ADOBECODEBANC", "ABC"));
    }

    public String minWindow(String s, String t) {

        int I = 0, j = 0, count = t.length();
        String res = "";

        Map<Character, Integer> map = new HashMap();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        while (j < s.length()) {
            if (map.containsKey(s.charAt(j))) {
                if (map.get(s.charAt(j)) > 0) {
                    count--;
                }
                map.put(s.charAt(j), map.get(s.charAt(j) ) - 1);

            }

            while (count==0) {
                    if (res == "" || res.length() > j - I + 1) {
                        res = s.substring(I, j + 1);
                    }


                if (map.containsKey(s.charAt(I))) {
                    map.put(s.charAt(I), map.get(s.charAt(I) ) + 1);
                    if(map.get(s.charAt(I))>0)
                    count++;

                }

                    I++;
            }

            j++;
        }
        return res;
    }


}