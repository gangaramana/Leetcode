package google.cracking_the_coding.problem_424;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

public class LongestReplacement {


    public static void main(String[] args) {
        System.out.println(new LongestReplacement().characterReplacement("BABB",0));
    }

    public int characterReplacement(String s, int k) {
        HashMap<Character,Integer> hashMap=new HashMap();
        int maxCounter=0,i=0,j=0;
        int result=0;
        while(j<s.length()){
            hashMap.put(s.charAt(j),hashMap.getOrDefault(s.charAt(j),0)+1);
            if(hashMap.get(s.charAt(j))>maxCounter){
                maxCounter=hashMap.get(s.charAt(j));
            }
            while(i<s.length() && j-i+1-maxCounter >k){

                hashMap.put(s.charAt(i),hashMap.get(s.charAt(i))-1);
                i++;
                List<Integer> list=new ArrayList(hashMap.values());
                Collections.sort(list);
                maxCounter=list.get(list.size()-1);
            }
            result=Math.max(result,j-i+1);
            j++;


        }
        return result;



    }
}
