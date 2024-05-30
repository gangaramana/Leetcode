package problem_373;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;

class MyComp implements Comparator<KPair> {

    @Override
    public int compare(KPair o1, KPair o2) {
        return Integer.compare(o1.sum, o2.sum);
    }


}

class KPair {
    int sum;
    Pair<Integer, Integer> pair;

    public KPair(int sum, Pair<Integer, Integer> pair) {
        this.sum = sum;
        this.pair = pair;

    }
}

public class FindKpairsWithSmallestSum {
    public static void main(String[] args) {
        FindKpairsWithSmallestSum kpairsWithSmallestSum = new FindKpairsWithSmallestSum();
        List<List<Integer>> result = kpairsWithSmallestSum.kSmallestPairs(new int[]{1, 2}, new int[]{3}, 3);
        System.out.println(result);
    }

    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        PriorityQueue<KPair> pairPriorityQueue = new PriorityQueue<>(new MyComp());
        List<List<Integer>> result = new ArrayList<>();
        if (!(nums1.length > 0 && nums2.length > 0)) {
            return result;
        }
        Pair<Integer, Integer> p0 = new Pair<>(0, 0);
        pairPriorityQueue.add(new KPair(nums1[0] + nums2[0], p0));
        int i, j;
        HashSet<Pair<Integer, Integer>> visited = new HashSet<>();
        visited.add(p0);

        while (k > 0 && !pairPriorityQueue.isEmpty()) {
            List<Integer> l = new ArrayList();
            KPair kPair=pairPriorityQueue.poll();
            i = kPair.pair.getKey();
            j = kPair.pair.getValue();
            l.add(nums1[i]);
            l.add(nums2[j]);
            result.add(l);
            k--;
            Pair<Integer, Integer> p2 = new Pair<>(i, j + 1);
            Pair<Integer, Integer> p3 = new Pair<>(i + 1, j);
            if (j + 1 < nums2.length && !visited.contains(p2)) {
                pairPriorityQueue.add(new KPair(nums1[p2.getKey()] + nums2[p2.getValue()], p2));
                visited.add(p2);
            }
            if (i + 1 < nums1.length && !visited.contains(p3)) {
                pairPriorityQueue.add(new KPair(nums1[p3.getKey()] + nums2[p3.getValue()], p3));
                visited.add(p3);
            }
        }

        return result;
    }
}
