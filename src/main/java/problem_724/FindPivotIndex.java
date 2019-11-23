package problem_724;

public class FindPivotIndex {
    public static void main(String[] args) {
        FindPivotIndex findPivotIndex = new FindPivotIndex();
        System.out.println(findPivotIndex.pivotIndex(new int[]{1, 2, 3}));
    }

    public int pivotIndex(int[] nums) {
        int sum = 0, prevsum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
        }
        for (int j = 0; j < nums.length; j++) {
            sum = sum - nums[j];
            if (sum == prevsum) {
                return j;
            }
            prevsum = prevsum + nums[j];
        }
        return -1;
    }
}
