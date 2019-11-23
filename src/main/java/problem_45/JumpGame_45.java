package problem_45;

public class JumpGame_45 {
    public static void main(String[] args) {
        JumpGame_45 jumpGame_45 = new JumpGame_45();
//        System.out.println(Integer.MAX_VALUE + 1);

        int x = jumpGame_45.jump(new int[]{4, 1, 1, 3, 1, 1, 1});
        System.out.println(x);

    }

    public int jump(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        int[] memo = new int[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            memo[i] = nums.length;

        }
        memo[nums.length - 1] = 0;

        for (int j = nums.length - 2; j >= 0; j--) {
            if (j + nums[j] >= nums.length - 1) {
                memo[j] = 1;
                continue;
            } else if (nums[j] == 0) {
                memo[j] = nums.length;
            } else {
                for (int k = j; k <= j + nums[j]; k++)
                    memo[j] = Math.min(memo[k] + 1, memo[j]);
            }

        }
        return memo[0];

    }
}
