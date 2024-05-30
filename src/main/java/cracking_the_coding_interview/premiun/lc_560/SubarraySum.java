package cracking_the_coding_interview.premiun.lc_560;

import java.util.HashMap;
import java.util.Map;

public class SubarraySum {
    public static void main(String[] args) {
        SubarraySum subarraySum = new SubarraySum();
       int res= subarraySum.subarraySum(new int[]{3, 4, 1, 6, 1}, 7);
        System.out.println(res);
    }

    public int subarraySum(int[] nums, int k) {

        int sum = 0;
        int count = 0;
        Map<Integer, Integer> sumMap = new HashMap<>();
        for (int i : nums) {

            sum += i;
            if (sum == k) {
                count++;
            }
            count += sumMap.getOrDefault(sum - k, 0);
            sumMap.put(sum, sumMap.getOrDefault(sum, 0) + 1);
        }
        return count;
    }
}
