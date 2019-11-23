package problem_532;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class KDiffPairs {
    public static void main(String[] args) {
        KDiffPairs kDiffPairs = new KDiffPairs();
        int x = kDiffPairs.findPairs(new int[]{1,1,1,2,1}, 1);
        System.out.println(x);

    }

    public int findPairs(int[] nums, int k) {
        HashMap<Integer, HashSet<Integer>> listHashMap = new HashMap<>();
        int count = 0, len = nums.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (Math.abs(nums[i] - nums[j]) == k) {
                    if (nums[i] > nums[j]) {
                        count = send(listHashMap, nums[j], nums[i], count);
                    } else {
                        count = send(listHashMap, nums[i], nums[j], count);
                    }
                }
            }
        }
        return count;
    }


    public int send(HashMap<Integer, HashSet<Integer>> hashSetHashMap, int key, int value, int count) {
        if (hashSetHashMap.containsKey(key)) {
            if (hashSetHashMap.get(key).add(value)) {
                count++;
            }

        } else {
            HashSet<Integer> set = new HashSet<>();
            set.add(value);
            hashSetHashMap.put(key, set);
            count++;
        }
        return count;

    }
}
