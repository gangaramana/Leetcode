package google.cracking_the_coding.problem_169;

import google.cracking_the_coding.problem_1838.MaxFrequency;

public class MajorityElement {
    public static void main(String[] args) {
        MajorityElement majorityElement=new MajorityElement();
        int res=majorityElement.majorityElement(new int[]{6,5,5});
        System.out.println(res);
    }
    public int majorityElement(int[] nums) {
        int count=0,candidate=nums[0];
        for(int i=0;i<nums.length;i++){
            if(count ==0){
                candidate=nums[i];
                count=1;
            }
            else if (nums[i]==candidate){
                count++;
            }
            else{
                count--;
            }


        }
        return candidate;

    }
}
