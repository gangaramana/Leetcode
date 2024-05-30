package cracking_the_coding_interview.strings;

import java.util.HashMap;
import java.util.Map;

public class AllButOne {
    public static void main(String[] args) {
        System.out.println( allButOne("pale","alek"));

    }

    static boolean allButOne(String str1, String str2) {
        if (Math.abs(str1.length() - str2.length()) > 1) {
            return false;
        }
        String bigger = str1.length() >= str2.length() ? str1:str2;
        String smaller =str1.length() < str2.length() ?str1: str2;
        int allButOne = 0;
        for (int i=0;i<bigger.length() && i< smaller.length();i++){
           if (allButOne<=1 && bigger.charAt(i)!= smaller.charAt(i)){
               allButOne++;
           }
        }

        if (allButOne > 1) {
            return false;
        }
        return true;
    }

}
