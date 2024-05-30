package google.cracking_the_coding.problem_875;

public class MonekeyEating {
    public static void main(String[] args) {
        MonekeyEating monekeyEating=new MonekeyEating();
        int res=monekeyEating.minEatingSpeed(new int[]{1000000000},2);
        System.out.println(res);
    }
    public int minEatingSpeed(int[] piles, int h) {

        int L = 1, R = piles[0];
        for (int I : piles) {
            if (L > I) {
                L = I;
            }
            else if (R < I) {
                R = I;
            }
        }

        int pivot ;
        while (L < R) {
            pivot = L + (R - L) / 2;

            if (condition(piles, h, pivot)) {
                R = pivot;
            } else {
                L = pivot + 1;
            }

        }
        return L;


    }


    private boolean condition(int[] nums, int k, int currentSum) {

        int  length = 0;

        for (int I : nums) {
            if (I <= currentSum) {
                length++;
            } else {
                int hour = (int) Math.ceil((double) I / currentSum);
                length += hour;
            }
        }

        return length <= k ? true : false;

    }
}
