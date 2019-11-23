package problem_136;

public class SingleNumber {
    public static void main(String[] args) {
        SingleNumber singleNumber=new SingleNumber();
        int x=singleNumber.singleNumber(new int []{2,2,1});
        System.out.println(x);
    }

    public int singleNumber(int[] nums) {
        int length = nums.length;
        int result = nums[0];
        ;
        for (int i = 1; i < length; i++) {
            result = result ^ nums[i];
        }

        return result;

    }
}
