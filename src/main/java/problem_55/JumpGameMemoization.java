package problem_55;

public class JumpGameMemoization {
    enum Index {
        Good, Bad, DontKnow
    }

    Index[] memo;

    public static void main(String[] args) {
        JumpGameMemoization jumpGameMemoization = new JumpGameMemoization();
        boolean b = jumpGameMemoization.canJump(new int[]{3,2, 1,1 , 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        memo = new Index[nums.length];
        for (int i = 0; i < nums.length - 1; i++) {
            memo[i] = Index.DontKnow;
        }
        memo[nums.length - 1] = Index.Good;
        return helper(nums, 0);

    }

    private boolean helper(int[] nums, int presentIndex) {
        if (memo[presentIndex] != Index.DontKnow) {
            return memo[presentIndex] == Index.Good ? true : false;
        }
        int ind = Math.min(presentIndex + nums[presentIndex], nums.length - 1);
        for (int i = presentIndex + 1; i <= ind; i++) {
            if (helper(nums, i)) {
                memo[i] = Index.Good;
                return true;
            }
        }
        memo[presentIndex] = Index.Bad;
        return  false;
    }


}
