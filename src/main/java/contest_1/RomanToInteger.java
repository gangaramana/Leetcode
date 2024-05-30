package contest_1;

import java.util.HashMap;
import java.util.Map;

public class RomanToInteger {
    public static void main(String[] args) {
RomanToInteger toInteger=new RomanToInteger();
int res= toInteger.romanToInt("LVIII");
        System.out.println(res);
    }
    public int romanToInt(String s) {
        Map<Character,Integer> hashmap=new HashMap<>();
        hashmap.put('I',1);
        hashmap.put('V',5);
        hashmap.put('X',10);
        hashmap.put('L',50);
        hashmap.put('C',100);
        hashmap.put('D',500);
        hashmap.put('M',1000);
        int previous=0;int present=0;int sum=0;
        for (char c:s.toCharArray()){
            if (hashmap.get(c)>previous){
                sum=sum+hashmap.get(c)- 2*previous;
                previous=hashmap.get(c);
            }
           else {
                sum = sum+hashmap.get(c);
                previous=hashmap.get(c);
            }
        }
        return sum;

    }
}
