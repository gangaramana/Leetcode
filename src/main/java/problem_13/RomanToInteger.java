package problem_13;

import java.util.HashMap;

public class RomanToInteger {

    public static void main(String[] args) {
        RomanToInteger romanToInteger =new RomanToInteger();
        System.out.println(romanToInteger.romanToInt("III"));

//        "III"
//        "LVIII"
//        "MCMXCIV"

    }

    public int romanToInt(String s) {
        HashMap<Character,Integer> hashMap=new HashMap<>();
        hashMap.put('I',1);
        hashMap.put('V',5);
        hashMap.put('X',10);
        hashMap.put('L',50);
        hashMap.put('C',100);
        hashMap.put('D',500);
        hashMap.put('M',1000);
        int result = 0;
        char flag = ' ';

        for (char c : s.toCharArray()) {
            if (flag == ' ') {
                flag = c;
                result=hashMap.get(c);
                continue;
            }
            if (hashMap.get(flag)<hashMap.get(c)){
                result=result+hashMap.get(c)-2*hashMap.get(flag);
            }
            else {
                result=hashMap.get(c)+result;
            }
            flag=c;
        }
return result;
    }
}
