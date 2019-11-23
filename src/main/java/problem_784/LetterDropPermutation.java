package problem_784;

import java.util.ArrayList;
import java.util.List;
import java.lang.*;

import static java.lang.Character.isDigit;
import static java.lang.Character.toLowerCase;

public class LetterDropPermutation {
    public static void main(String[] args) {
        LetterDropPermutation letterDropPermutation = new LetterDropPermutation();
        letterDropPermutation.letterCasePermutation("a1b2");


    }

    public List<String> letterCasePermutation(String S) {
        char[] c = S.toCharArray();
//        System.out.println(isDigit(c[0]));
//        System.out.println(Character.toLowerCase(c[1]));
//        System.out.println(S.toLowerCase());
        List<String> list = new ArrayList<>();
        helper("", 0, c, list);
        System.out.println(list);
        return null;


    }

    public void helper(String s, int i, char[] c, List<String> list) {

        if (i > c.length) {
            list.add(s);
            return;
        }
        while (i < c.length && (c[i] <= 57 && c[i] >= 47)) {
            s = s + c[i];
            i++;
        }
        if (i < c.length) {
            helper(s + Character.toLowerCase(c[i]), i + 1, c, list);
            helper(s + Character.toUpperCase(c[i]), i + 1, c, list);
        } else {
            list.add(s);
        }
    }

}
