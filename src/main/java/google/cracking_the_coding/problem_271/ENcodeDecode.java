package google.cracking_the_coding.problem_271;

import java.util.ArrayList;
import java.util.List;

public class ENcodeDecode {
    public static void main(String[] args) {
ENcodeDecode eNcodeDecode=new ENcodeDecode();
        System.out.println(eNcodeDecode.decode());
    }

    public List<String> decode() {
        String s="5Hello5world";
        System.out.println(s);

        List<String> res=new ArrayList<String>();
        for(int i=0;i<s.length();){
            System.out.println(i);
            int length=Character.getNumericValue(s.charAt(i));
            StringBuffer buf=new StringBuffer(length);
            int j=0;
            i++;
            while(j<length){
                buf.append(s.charAt(i));
                j++;
                i++;
            }
            res.add(buf.toString());


        }
        return res;

    }
}
