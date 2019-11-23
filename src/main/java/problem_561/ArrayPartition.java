package problem_561;

import java.util.Arrays;

public class ArrayPartition {
    public static void main(String[] args) {
        ArrayPartition a = new ArrayPartition();
        System.out.println(a.arrayPairSum(new int[]{1, 4, 3, 2,10,15}));

    }

    public int arrayPairSum(int[] nums) {
        int sum = 0;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i = i + 2) {
            sum = sum + nums[i];
        }
        return sum;
    }
}
