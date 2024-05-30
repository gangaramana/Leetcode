package problem_137;

import problem_136.SingleNumber;


// know each bit 0 or 1 then add the respective in the result
public class SingleNumberII {
    public static void main(String[] args) {
        SingleNumberII singleNumberII = new SingleNumberII();
        int x = singleNumberII.singleNumber(new int[]{0, 1, 0, 1, 0, 1, 99, 99, 99, 12, 12, 12, 13});
        System.out.println(x);


    }

    public int singleNumber(int[] nums) {
        int result = 0;

        int i = 0;
        while (i < 32) {
            int zeros = 0;
            int ones = 0;
            for (int k = 0; k < nums.length; k++) {
                if ((nums[k] &(1<<i)) == 0) {
                    zeros++;
                } else {
                    ones++;
                }
            }
            if (ones % 3 != 0) {
                result = result | 1 << i;
            }

            i++;

        }
//        System.out.println(sum + "  no  " + no);
        return result;
    }

}
