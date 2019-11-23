package problem_485;

public class maxConsecutiveOnes {

    public static void main(String[] args) {
        maxConsecutiveOnes max = new maxConsecutiveOnes();
        int[] a = new int[]{1, 1, 1, 1, 1};
        int k=max.findMaxConsecutiveOnes(a);
        System.out.println(k);
    }

    public int findMaxConsecutiveOnes(int[] nums) {
        int result = 0;
        int consecuOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                consecuOnes++;
            }
            if (consecuOnes > result) {
                result = consecuOnes;
            }
            if (nums[i] == 0) {
                consecuOnes = 0;
            }
        }
        return result;

    }
}
