package problem_55;

public class JumpGameGreedy {
    enum Index {
        Good, Bad, DontKnow
    }

    public static void main(String[] args) {
        JumpGameGreedy jumpGameGreedy = new JumpGameGreedy();
        boolean b = jumpGameGreedy.canJump(new int[]{3, 2, 1, 1, 4});
        System.out.println(b);
    }

    public boolean canJump(int[] nums) {
        int j = nums.length - 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            if (i + nums[i] >= j) {
                j = i;
            }
        }
        return j == 0;

    }
}
