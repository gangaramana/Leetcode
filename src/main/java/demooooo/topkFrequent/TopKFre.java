package demooooo.topkFrequent;

import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class TopKFre {
    public static void main(String[] args) {
        TopKFre topKFre = new TopKFre();
        topKFre.topK(new int[]{5, 2, 1, 3, 2, 3, 5, 6, 7, 7, 7}, 3);
    }

    private void topK(int[] nums, int k) {
        Map<Integer, Integer> freq = new HashMap();
        Map<Integer, Set<Integer>> result = new TreeMap(Collections.reverseOrder());
        for (int n : nums) {
            freq.put(n, freq.getOrDefault(n, 0) + 1);
            populateMap(result, freq, n);
            printNums(result, k);
            System.out.println();
        }
    }

    private void printNums(Map<Integer, Set<Integer>> result, int k) {
        int count = 0;
        outer:
        for (Map.Entry<Integer, Set<Integer>> entry : result.entrySet()) {

            for (Integer i : entry.getValue()) {
                count++;
                System.out.print(i + " ");
                if (count == k) {
                    break outer;
                }
            }
        }
    }

    private void populateMap(Map<Integer, Set<Integer>> result, Map<Integer, Integer> freq, int n) {
        if (result.containsKey(freq.get(n) - 1)) {
            Set<Integer> set = result.get(freq.get(n) - 1);
            if (set.contains(n)) {
                set.remove(n);
                if (set.isEmpty()) {
                    result.remove(freq.get(n) - 1);
                }
            }
        }
        if (result.containsKey(freq.get(n))) {
            result.get(freq.get(n)).add(n);
        } else {

            Set<Integer> set = new TreeSet<>();
            set.add(n);
            result.put(freq.get(n), set);
        }
    }
}
