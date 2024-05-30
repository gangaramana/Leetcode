package problem_724;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(new int[]{1, 2, 3}));
    }

    public int pivotIndex(int[] nums) {
        int[] prefixSum = new int[nums.length];
        int[] suffixSum = new int[nums.length];
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            prefixSum[i] = sum;
            sum += nums[i];
        }
        sum = 0;
        for (int i = nums.length - 1; i >= 0; i--) {
            suffixSum[i] = sum;
            sum += nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            if (suffixSum[i] == prefixSum[i]) {
                return i;
            }

        }
        return -1;

    }

}
