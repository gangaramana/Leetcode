package google.cracking_the_coding.problem_2131;

import java.util.HashMap;
import java.util.Map;

public class PalindromeLongest {
    public static void main(String[] args) {
        PalindromeLongest pl=new PalindromeLongest();
        System.out.println(pl.longestPalindrome(new String[]{"cc","ll","xx"}));


        System.out.println("aa"==String.valueOf(String.valueOf('a')+'a'));
        System.out.println("aa".equalsIgnoreCase("aa"));
    }
        public int longestPalindrome(String[] words) {
            Map<String,Integer> map=new HashMap();
            for(String w: words){
                map.put(w,map.getOrDefault(w,0)+1);
            }
            int result=0;
            boolean centre=false;
            for(String w: words){
                String rev= String.valueOf(w.charAt(1)) + w.charAt(0);
                if(map.containsKey(rev) && map.get(rev)>0 && map.get(w)>0){
                    if(w.equals(rev)){
                        if(map.get(w)>=2){
                            result+=4;
                            map.put(w,map.get(w)-2);
                        }
                        else if(map.get(w)>0 && centre ==false){
                            map.put(w,map.get(w)-1);
                            result+=2;
                            centre=true;

                        }
                    }
                    else{

                        result+=4;
                        map.put(w,map.get(w)-1);
                        map.put(rev,map.get(rev)-1);



                    }


                }
            }
            return result;
        }
    }
