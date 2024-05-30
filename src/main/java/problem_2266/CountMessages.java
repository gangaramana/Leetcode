package problem_2266;

import java.util.Arrays;

public class CountMessages {
    public static void main(String[] args) {
      CountMessages countMessages=new CountMessages();
      int res=countMessages.countTexts("44449999");
        System.out.println(res);
    }
    int[] memo;
    public int countTexts(String pressedKeys) {
        memo=new int[pressedKeys.length()];
        Arrays.fill(memo,-1);
return countTextsRec(0,pressedKeys);
    }
    private int countTextsRec(int i,String pressedKeys){
        if (pressedKeys.length()==i){
            return 1;
        }
        if (memo[i]!=-1){
            return memo[i];
        }
        int res=countTextsRec(i+1,pressedKeys);
        if (i+1<pressedKeys.length() && pressedKeys.charAt(i)==pressedKeys.charAt(i+1)){
            res+=countTextsRec(i+2,pressedKeys);
            if (i+2<pressedKeys.length() && pressedKeys.charAt(i+1)==pressedKeys.charAt(i+2)){
                res+=countTextsRec(i+3,pressedKeys);
            }
        }
        memo[i]=res;// (int) ( res%(Math.pow(10,9)+7));
        return memo[i];

    }
}
