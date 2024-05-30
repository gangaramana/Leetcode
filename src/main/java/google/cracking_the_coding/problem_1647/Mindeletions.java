package google.cracking_the_coding.problem_1647;

import java.util.HashMap;
import java.util.Map;

public class Mindeletions {
    public static void main(String[] args) {
        Mindeletions mindeletions=new Mindeletions();
        System.out.println( mindeletions.minDeletions("aaabbbcc"));
    }
        public int minDeletions(String s) {
            int[] counter=new int[26];
            for(int i=0;i<s.length();i++){
                counter[s.charAt(i)-'a']++;
            }
            Map<Integer,Integer> map=new HashMap();
            int maxCounter=0;
            for(int i=0;i<26;i++){
                if(counter[i]!=0){
                    map.put(counter[i],map.getOrDefault(counter[i],0)+1);
                    maxCounter=Math.max(counter[i],maxCounter);
                }
            }

            int prev=0,result=0;
            for(int i=maxCounter;i>0;i--){
                if(map.containsKey(i)){
                    prev=map.get(i)+prev-1;

                }
                else{
                    prev=Math.max(prev-1,0);
                }
                result+=prev;
            }
            return result;

        }
    }
