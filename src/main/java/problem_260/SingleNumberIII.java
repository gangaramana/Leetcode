package problem_260;

public class SingleNumberIII {
    public static void main(String[] args) {
        SingleNumberIII singleNumberIII=new SingleNumberIII();
        singleNumberIII.singleNumber(new int[]{1,2,1,3,2,5});
    }
    public int[] singleNumber(int[] nums) {
        int result=nums[0];
        for (int i=1;i< nums.length;i++){
            result =result^ nums[i];
        }
        System.out.println(3^5);
        return nums;
    }
}
