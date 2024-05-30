package google.cracking_the_coding.problem_209;

public class MinSum {
    public static void main(String[] args) {
MinSum minSum=new MinSum();
        System.out.println(minSum.minSubArrayLen(7, new int[]{2,3,1,2,4,3}));
    }

    public int minSubArrayLen(int target, int[] nums) {
        int i=0,j=0,sum=0,res=Integer.MAX_VALUE;
        while(j<nums.length) {
            sum=sum+nums[j];
            while (sum >= target) {
                res = Math.min(j - i + 1,res);

                sum -= nums[i];
                i++;

            }
            j++;
        }
        return res==Integer.MAX_VALUE ? 0:res;
    }
}
