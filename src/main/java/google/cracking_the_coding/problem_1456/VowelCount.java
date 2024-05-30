package google.cracking_the_coding.problem_1456;

import java.util.HashSet;
import java.util.Set;

class VowelCount{

    public int maxVowels(String s, int k){
        int i=0,j=0,vowelCount=0,vowelsTillNow=0;
        Set<Character> set=new HashSet();
        set.add('a');
        set.add('e');set.add('i');set.add('o');set.add('u');


        while(j<s.length()){
            if(set.contains(s.charAt(j))){
                vowelsTillNow++;
            }
            while(j-i+1 == k){
                vowelCount =Math.max(vowelCount, vowelsTillNow);

                if(set.contains(s.charAt(i))){
                    vowelsTillNow--;
                }
                i++;

            }
            j++;



        }
        return vowelCount;
    }

}
