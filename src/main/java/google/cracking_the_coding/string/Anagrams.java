package google.cracking_the_coding.string;

import java.util.Arrays;

class Anagrams {

    public static void main(String[] arg) {
Anagrams anagrams=new Anagrams();
        System.out.println(anagrams.validate("abcd","bcda"));
        System.out.println(anagrams.validate("abvf","abcd"));
    }

    public boolean validate(String s1, String s2) {

        if (s1 == null || s2 == null || (s1.length() != s2.length())) {
            return false;
        }
        return encode(s1).compareTo(encode(s2)) == 0 ? true : false;


    }

    private String encode(String str) {
        int[] res = new int[26];
        Arrays.fill(res, 0);
        for (int i = 0; i < str.length(); i++) {
            res[str.charAt(i) - 'a']++;
        }
        StringBuffer buffer = new StringBuffer(26);
        for (int i = 0; i < 26; i++) {
            buffer.append(res[i]);
        }
        return buffer.toString();
    }
}
