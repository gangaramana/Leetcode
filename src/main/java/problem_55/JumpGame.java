package problem_55;

public class JumpGame {
    public static void main(String[] args) {
        JumpGame j = new JumpGame();
        System.out.println(j.canJump(new int[]{3,0,0,0,4}));

    }

    public boolean canJump(int[] nums) {
        return helper(nums, 0);

    }

    private boolean helper(int[] nums, int presentIndex) {
        if (presentIndex+1 == nums.length) {
            return true;
        } else if (presentIndex+1 > nums.length) {
            return false;
        } else {
            for (int i = 1; i <= nums[presentIndex]; i++) {
                if (helper(nums, presentIndex + i)) {
                    return true;
                }
            }
        }

        return false;
    }
}
