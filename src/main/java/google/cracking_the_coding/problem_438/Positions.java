package google.cracking_the_coding.problem_438;

import javafx.geometry.Pos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Positions {
    public static void main(String[] args) {
        Positions positions=new Positions();
        System.out.println(positions.findAnagrams("cbaebabacd","abc"));
    }
    public List<Integer> findAnagrams(String s, String p) {
        int i=0,j=0;
        Map<Character,Integer> map=new HashMap();
        for(char c: p.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        List<Integer> res=new ArrayList();
        while(j<s.length()){
            if(j-i+1 == p.length()){

                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.get(s.charAt(j))-1);
                    if(validate(map)){
                        res.add(i);
                    }
                }

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i),map.get(s.charAt(i))+1);
                }
                i++;
                j++;


            }
            else{

                if(map.containsKey(s.charAt(j))){
                    map.put(s.charAt(j),map.get(s.charAt(j))-1);
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
