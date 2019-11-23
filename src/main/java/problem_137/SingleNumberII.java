package problem_137;

import problem_136.SingleNumber;

public class SingleNumberII {
    public static void main(String[] args) {
        SingleNumberII singleNumberII = new SingleNumberII();
        int x = singleNumberII.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99,99,99,12,12,12,13});
//        System.out.println(x);


    }

    public int singleNumber(int[] nums) {
        int sum = 0, no = 0;

        for (int x : nums) {
            sum = sum ^ x;
            no = no - x;

        }
        System.out.println(sum + "  no  " + no);
        return sum;
    }

}
