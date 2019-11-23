package problem_1144;

import java.util.Arrays;

public class DecreaseZigZag {
    public static void main(String[] args) {
        DecreaseZigZag decreaseZigZag = new DecreaseZigZag();
        int k = decreaseZigZag.movesToMakeZigzag(new int[]{9,6,1,6,2});
        System.out.println(k);
    }

    public int movesToMakeZigzag(int[] nums) {

        int[] nu = Arrays.copyOf(nums, nums.length);
        int sum = 0;
        for (int i = 0; i < nu.length; i = i + 2) {
            if (i - 1 >= 0 && nu[i] - nu[i - 1] <= 0) {
                sum = sum + nu[i - 1] - nu[i] + 1;
                nu[i - 1] = nu[i] - 1;
            }

            if (i + 1 < nu.length && nu[i] - nu[i + 1] <= 0) {
                sum = sum + nu[i + 1] - nu[i] + 1;
                nu[i + 1] = nu[i] - 1;
            }

        }
        int oddSum = 0;
        int [] nk= Arrays.copyOf(nums, nums.length);
        for (int i = 1; i < nk.length; i = i + 2) {
            if (i - 1 >= 0 && nk[i] - nk[i - 1] <= 0) {
                oddSum = oddSum + nk[i - 1] - nk[i] + 1;
                nk[i - 1] = nk[i] - 1;
            }

            if (i + 1 < nu.length && nk[i] - nk[i + 1] <= 0) {
                oddSum = oddSum + nk[i + 1] - nk[i] + 1;
                nk[i + 1] = nk[i] - 1;
            }

        }
        return Math.min(oddSum, sum);
    }
}
