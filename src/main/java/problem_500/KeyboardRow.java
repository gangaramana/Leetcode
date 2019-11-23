package problem_500;

import com.sun.org.apache.bcel.internal.generic.ARRAYLENGTH;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class KeyboardRow {
    public static void main(String[] args) {
        KeyboardRow k = new KeyboardRow();
        String[] vv = k.findWords(new String[]{"Hello", "Alaska", "Dad", "Peace"});
        for (String we : vv) {
            System.out.println(we);
        }
//        HashMap<String, String> hashMap1 = new HashMap<String, String>();
//        hashMap1.put("1", "qwertyuiop");
//        System.out.println(hashMap1.get("1").indexOf("x"));


    }

    public String[] findWords(String[] words) {
        ArrayList<String> stringArrayList = new ArrayList<String>();

        HashMap<Integer, String> hashMap1 = new HashMap<Integer, String>();
        hashMap1.put(1, "qwertyuiop");

        hashMap1.put(2, "asdfghjkl");

        hashMap1.put(3, "zxcvbnm");

        for (String s : words) {
            char[] chars = s.toLowerCase().toCharArray();
            boolean b;
            if (hashMap1.get(1).indexOf(chars[0]) != -1) {
                b = search1(hashMap1, chars, 1);
            } else if (hashMap1.get(2).indexOf(chars[0]) != -1) {
                b = search1(hashMap1, chars, 2);

            } else {
                b = search1(hashMap1, chars, 3);
            }
            if (b == true) {
                stringArrayList.add(s);
            }


        }
        String[] resultString = new String[stringArrayList.size()];
        int i = 0;
        for (String d : stringArrayList) {
            resultString[i++] = d;
        }

        return resultString;


    }

    public boolean search1(HashMap<Integer, String> stringHashMap, char[] chars, int key) {
        boolean b = true;
        for (char c : chars) {
            if (stringHashMap.get(key).indexOf(c) != -1) ;
            else {
                return false;
            }

        }
        return true;

    }
}
