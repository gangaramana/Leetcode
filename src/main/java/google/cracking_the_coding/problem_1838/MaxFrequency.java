package google.cracking_the_coding.problem_1838;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MaxFrequency {
    public static void main(String[] args) {
        MaxFrequency maxFrequency=new MaxFrequency();
        System.out.println( maxFrequency.maxFrequency(new int[]{40,95,44,37,41,52,07,52,87,64,40,14,41,33,12,34,80,07,80,44,10,9},7295));
    }
    public int maxFrequency(int[] nums, int k) {

        Arrays.sort(nums);
        int i=0,j=0,res=0;
        long sum=0,s=0;;
        while(j<nums.length){
            long target=nums[j];
            sum=sum+nums[j];
            while((target*(j-i+1))-sum >k){
                sum=sum-nums[i];
                i++;

            }
            res=Math.max(j-i+1,res);
            j++;


        }
        return res;
    }
}
