package problem_2542;

import javafx.util.Pair;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class Mycomparator implements Comparator<Pair<Integer,Integer>> {

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return Integer.compare(o2.getValue(),o1.getValue());
    }
}
public class MaxSubsequenceScore {
    public static void main(String[] args) {
        MaxSubsequenceScore maxSubsequenceScore = new MaxSubsequenceScore();
     long res=   maxSubsequenceScore.maxScore(new int[]{2,1,14,12}, new int[]{11,7,13,6}, 3);
        System.out.println(res);
    }

    public long maxScore(int[] nums1, int[] nums2, int k) {
        PriorityQueue<Pair<Integer, Integer>> pairPriorityQueue = new PriorityQueue<>(new Mycomparator());
        for (int i = 0; i < nums2.length; i++) {
            pairPriorityQueue.add(new Pair<>(i, nums2[i]));
        }
        PriorityQueue<Integer> integerPriorityQueue = new PriorityQueue<>();
        long sum = 0;
        int j = 0;
        long result = 0;
        while (j < k-1) {
            Pair<Integer, Integer> p = pairPriorityQueue.poll();
            sum = sum + nums1[p.getKey()];
            integerPriorityQueue.add(nums1[p.getKey()]);
            j++;
        }
        while (!pairPriorityQueue.isEmpty()) {
            int multiplier = pairPriorityQueue.peek().getValue();
            sum=sum+nums1[pairPriorityQueue.peek().getKey()];
            result = Math.max(result, sum * multiplier);
            integerPriorityQueue.add(nums1[pairPriorityQueue.poll().getKey()]);
            sum = sum  - integerPriorityQueue.poll();
        }
        return result;
    }
}
