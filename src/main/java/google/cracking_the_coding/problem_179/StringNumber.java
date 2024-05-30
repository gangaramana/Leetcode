package google.cracking_the_coding.problem_179;

import java.util.Arrays;

public class StringNumber {
    public String largestNumber(int[] nums) {
        String[] res=new String[nums.length];
        for(int i=0;i<nums.length;i++){
            res[i]=String.valueOf(nums[i]);
        }
        Arrays.sort(res,(a, b)->(b+a).compareTo(a+b));
        StringBuilder str=new StringBuilder();
        for(String s:res){
            str.append(s);
        }
        return str.charAt(0)=='0'? "0" :str.toString();

    }
}
