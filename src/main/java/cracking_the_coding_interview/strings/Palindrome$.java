package cracking_the_coding_interview.strings;

import java.util.HashMap;
import java.util.Map;

public class Palindrome$ {
    public static void main(String[] args) {
        String s="saippuakivika  aba  uppias";
        System.out.println(palindromePermutations(s));

    }

    static boolean palindromePermutations(String str) {
        int odd = 0;
        str=str.toLowerCase();
        HashMap<Character, Integer> hashMap = new HashMap<>();
        int lengthWithOutSpaces = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != ' ') {
                lengthWithOutSpaces++;
                hashMap.put(str.charAt(i), hashMap.getOrDefault(str.charAt(i), 0) + 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
            if (entry.getValue()%2 !=0){
                odd++;
            }
        }
        if ((lengthWithOutSpaces%2!=0 && odd ==1) || (lengthWithOutSpaces%2 ==0 && odd ==0)) {
            return true;
        }
        return false;

    }
}
