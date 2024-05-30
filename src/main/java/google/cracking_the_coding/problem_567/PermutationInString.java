package google.cracking_the_coding.problem_567;

import java.util.Arrays;

public class PermutationInString {
    public static void main(String[] args) {
PermutationInString permutationInString=new PermutationInString();
        System.out.println(permutationInString.checkInclusion("ab","eidboaoo"));
    }

    public boolean checkInclusion(String s1, String s2) {
        int [] c1=new int[26];
        int[] c2=new int[26];
        for(int i=0;i<s1.length();i++){
            c1[s1.charAt(i)-'a']++;
        }
                System.out.println(s1);
        int i=0,j=0;
        while(j<s2.length()){
            c2[s2.charAt(j)-'a']++;
            if(j-i+1 == s1.length()){
                //validate
                if(Arrays.toString(c2).equals( Arrays.toString(c1))){
                    return true;
                }
                c2[s2.charAt(i)-'a']--;
                i++;
            }

            j++;

        }
        return false;
    }}
