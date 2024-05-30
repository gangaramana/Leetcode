package problem_347;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKElements {
    public static void main(String[] args) {
        TopKElements topKElements = new TopKElements();
       int[] res= topKElements.topKFrequent(new int[]{1}, 1);
       for (int k:res){
           System.out.println(k);
       }
    }

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hashmap = new HashMap<>();
        for (int i : nums) {
            hashmap.put(i, hashmap.getOrDefault(i, 0) + 1);
        }
        List<List<Integer>> res = new ArrayList<>(nums.length+1);
        for (int i = 0; i <= nums.length; i++) {
            res.add(new ArrayList<>());
        }
        for (Map.Entry<Integer, Integer> entry : hashmap.entrySet()) {
            res.get(entry.getValue()).add(entry.getKey());
        }
        int[] result = new int[k];
        int j = 0;
        for (int i = res.size() - 1; i >= 0 && j < k; i--) {
            if (res.get(i).size() != 0) {
                for (int g = 0; j < k && g < res.get(i).size(); j++, g++) {
                    result[j] = res.get(i).get(g);
                }
            }

        }
        return result;
    }
}
