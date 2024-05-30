package problem_300;

import java.util.Arrays;

public class LongestIncreasingSubsequence {
    public static void main(String[] args) {
        System.out.println(new LongestIncreasingSubsequence().lengthOfLIS(new int[]{10, 9, 2, 5, 3, 7, 101, 18, 11, 12}));


        //bottom up

        System.out.println(new LongestIncreasingSubsequence().lengthOfLISBottomUp(new int[]{10, 9, 2, 5, 3, 7, 101, 18, 11, 12}));
    }

    public int lengthOfLIS(int[] nums) {
        int[][] memoization = new int[nums.length][nums.length + 1];
        for (int i = 0; i < memoization.length; i++) {
            for (int j = 0; j < memoization.length; j++)
                memoization[i][j] = -1;
        }
        int ans = lengthOfLIS(nums, 0, -1, memoization);
        return ans;

    }

    public int lengthOfLIS(int[] nums, int index, int previousIndex, int[][] memo) {
        if (index >= nums.length) {
            return 0;
        }
        if (previousIndex != -1 && memo[index][previousIndex] != -1) {
            return memo[index][previousIndex];
        }
        int take = 0;
        int skip = lengthOfLIS(nums, index + 1, previousIndex, memo);

        if (previousIndex == -1 || nums[previousIndex] < nums[index]) {
            take = lengthOfLIS(nums, index + 1, index, memo) + 1;
        }
        if (previousIndex != -1) {
            memo[index][previousIndex] = Math.max(take, skip);
        }
        return Math.max(take, skip);

    }
    //bottom up

    public int lengthOfLISBottomUp(int[] nums) {
        int maxLIS = 0;
        int[] mem = new int[nums.length];
        Arrays.fill(mem, 1);
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[j] < nums[i]) {
                    mem[i] = Math.max(mem[i], 1 + mem[j]);
                    maxLIS = Math.max(mem[i], maxLIS);
                }
            }
        }
        return maxLIS;
    }


}
