package problem_948;

import java.util.Arrays;
import java.util.Collections;

public class BagOfTokens {
    public static void main(String[] args) {
BagOfTokens bagOfTokens=new BagOfTokens();
int res=bagOfTokens.bagOfTokensScore(new int[]{71,55,82},54);
        System.out.println(res);
    }
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int j= tokens.length-1;
        int i=0;
        int count=0;
        while (i<j){
            if (power>=tokens[i]){
                count++;
                power=power-tokens[i];
                i++;
            }
            else{
                if (count>0) {
                    power = power + tokens[j];
                    count--;
                }
               j--;
            }

        }
        if (i==j) {
            if (power >= tokens[i]) {
                count++;
            }
        }
        return count;
    }
}
