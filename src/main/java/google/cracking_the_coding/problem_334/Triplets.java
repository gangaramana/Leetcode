package google.cracking_the_coding.problem_334;

public class Triplets {

    public boolean increasingTriplet(int[] nums){

        boolean[] prefix=new boolean[nums.length];
        boolean[] suffix=new boolean[nums.length];
        int min=nums[0];
        prefix[0]=false;
        for(int i=1;i<nums.length;i++) {
            if (min < nums[i]) {
                prefix[i] = true;
            } else {
                prefix[i] = false;
                min = nums[i];
            }
        }
            int max=nums[nums.length-1];
            suffix[nums.length-1]=false;
            for(int i=nums.length-2;i>=0;i--){
                if(max>nums[i]){
                    suffix[i]=true;
                }
                else{
                    suffix[i]=false;
                    max=nums[i];}
            }

        for(int i=0;i<prefix.length;i++){

            if(prefix[i] && suffix[i]){
                return true;
            }
        }
        return false;
    }
}
