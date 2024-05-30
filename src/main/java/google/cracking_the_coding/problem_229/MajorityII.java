package google.cracking_the_coding.problem_229;

import java.util.ArrayList;
import java.util.List;

public class MajorityII {
    public static void main(String[] args) {

    }

    public List<Integer> majorityElement(int[] nums) {
        int count1 = 0, candidate1 = Integer.MIN_VALUE, count2 = 0, candidate2 = Integer.MIN_VALUE;
        List<Integer> result = new ArrayList();

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == candidate1) {
                count1++;
            } else if (nums[i] == candidate2) {
                count2++;
            } else if (count1 == 0) {
                candidate1 = nums[i];
                count1 = 1;
            } else if (count2 == 0) {
                candidate2 = nums[i];
                count2 = 1;
            } else {
                count1--;
                count2--;
            }
        }

        count1 = 0;
        count2 = 0;
        for (int i : nums) {
            if (i == candidate1) {
                count1++;
            }
            if (i == candidate2) {
                count2++;
            }

        }
        if (count1 > nums.length / 3) {
            result.add(candidate1);
        }
        if (count2 > nums.length / 3) {
            result.add(candidate2);
        }

        return result;
    }
}
