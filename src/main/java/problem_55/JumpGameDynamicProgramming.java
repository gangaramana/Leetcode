package problem_55;

public class JumpGameDynamicProgramming {
    enum Index {
        Good, Bad, DontKnow
    }

    public static void main(String[] args) {
        JumpGameDynamicProgramming jumpGameDynamicProgramming = new JumpGameDynamicProgramming();
        boolean b = jumpGameDynamicProgramming.canJump(new int[]{3, 2, 1, 0, 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        Index[] memo = new Index[nums.length];
        for (int i = 0; i < memo.length - 1; i++) {
            memo[i] = Index.DontKnow;
        }
        memo[nums.length - 1] = Index.Good;
        for (int i = nums.length-2; i >=0;i--) {
            int maxJump = Math.min(i + nums[i], nums.length - 1);
            for (int j = i+1 ; j <= maxJump; j++) {
                if (memo[j] == Index.Good) {
                    memo[i] = Index.Good;
                    break;
                }

            }


        }
        return memo[0] == Index.Good ? true : false;
    }

}
