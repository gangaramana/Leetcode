package problem_15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three3Sum {
    public static void main(String[] args) {
        Three3Sum three3Sum = new Three3Sum();
        System.out.println(three3Sum.threeSum(new int[]{-1, 0, 1, 2 ,- 1, -4}));

    }

    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    List<Integer> l = new ArrayList<>();
                    l.add(nums[i]);
                    l.add(nums[left]);
                    l.add(nums[right]);
                    res.add(l);
                    int leftvalue = nums[left];
                    int rightvalue = nums[right];
                    while (left < nums.length && nums[left] == leftvalue) {
                        left++;
                    }
                    while (right > left && nums[right] == rightvalue) {
                        right--;
                    }

                } else if (sum < 0) {
                    left++;
                } else {
                    right--;
                }
            }
            while (i < nums.length - 2 && nums[i] == nums[i + 1]) {
                ++i;
            }
        }
        return res;
    }


    }
