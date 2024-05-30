package problem_1911;

public class MaxAlternatingSubsequence {
    public static void main(String[] args) {
//        System.out.println(new MaxAlternatingSubsequence().maxAlternatingSum(new int[]{4, 2, 5, 3}));
        System.out.println(new MaxAlternatingSubsequence().maxDpSum(new int[]{4,2,5,3}));

    }

    public long maxAlternatingSum(int[] nums) {
        long memoziation[][] = new long[nums.length + 1][2];
        long answer = maxSubsequnece(0, nums, true, memoziation);
        return answer;

    }

    public long maxSubsequnece(int index, int[] nums, boolean flag, long memo[][]) {

        if (index >= nums.length) {
            return 0;
        }
        if (memo[index][flag ? 1 : 0] != 0) {
            return memo[index][flag ? 1 : 0];
        }
        long skip = maxSubsequnece(index + 1, nums, flag, memo);
        int no = nums[index];
        if (flag == false) {
            no = -1 * no;
        }
        long take = maxSubsequnece(index + 1, nums, !flag, memo) + no;
        memo[index][flag ? 1 : 0] = Math.max(skip, take);
        return memo[index][flag ? 1 : 0];
    }


    public long maxDpSum(int[] nums) {
        long memo[][] = new long[nums.length + 1][2];
        for (int i = 1; i < nums.length + 1; i++) {
            memo[i][0] = Math.max(memo[i - 1][1] - nums[i - 1], memo[i - 1][0]);
            memo[i][1] = Math.max(memo[i - 1][0] + nums[i - 1], memo[i - 1][1]);

        }
        return Math.max(memo[nums.length][0], memo[nums.length][1]);
    }
}
