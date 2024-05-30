package problem_2462;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;


public class TotalCostForKworkers {
    public static void main(String[] args) {
        TotalCostForKworkers totalCostForKworkers = new TotalCostForKworkers();
        long res = totalCostForKworkers.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4);
        System.out.println(res);
    }

    public long totalCost(int[] costs, int k, int candidates) {
        PriorityQueue<Integer> p1 = new PriorityQueue();
        PriorityQueue<Integer> p2 = new PriorityQueue();
        int i = 0, j = costs.length - 1, hired = 0;
        long result = 0;
        while (hired < k) {
            while (p1.size() < candidates && i <= j) {
                p1.add(costs[i]);
                i++;
            }
            while (p2.size() < candidates && j >= i) {
                p2.add(costs[j]);
                j--;
            }
            int minP1 = p1.isEmpty() ? Integer.MAX_VALUE : p1.peek();
            int minP2 = p2.isEmpty() ? Integer.MAX_VALUE : p2.peek();
            if (minP1 <= minP2) {
                result = result + p1.poll();
            } else {
                result = result + p2.poll();
            }
            hired++;

        }

        return result;
    }
}

//    public long totalCostOneQueue(int[] costs, int k, int candidates) {
//        PriorityQueue<Integer> p1 = new PriorityQueue();
//        int i = 0, j = costs.length - 1, hired = 0;
//        long result=0;
//        while (hired < k) {
//            while (p1.size() < candidates && i <= j) {
//                p1.add(costs[i]);
//                i++;
//            }
//            while (p1.size() < candidates && j >= i) {
//                p1.add(costs[j]);
//                j--;
//            }
//            int minP1 = p1.isEmpty() ? Integer.MAX_VALUE : p1.peek();
//            if (minP1 <= minP2) {
//                result = result + p1.poll();
//            } else {
//                result = result + p2.poll();
//            }
//            hired++;
//
//        }
//        return result;
//    }
