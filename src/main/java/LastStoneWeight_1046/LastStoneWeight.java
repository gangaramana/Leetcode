package LastStoneWeight_1046;

import problem_877.StoneGame;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class LastStoneWeight {
    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        int resu = lastStoneWeight.lastStoneWeight(new int[]{2, 4, 1, 1, 1, 1});
        System.out.println(resu);

    }

    public int lastStoneWeight(int[] stones) {

        Queue<Integer> priorityQueue = new PriorityQueue<>(stones.length, Collections.reverseOrder());
        for (int s : stones) {
            priorityQueue.add(s);
        }
        int res = priorityQueue.peek();
        while (priorityQueue.size() > 1) {
            res = Math.abs(priorityQueue.remove() - priorityQueue.remove());
            if (res != 0) {
                priorityQueue.add(res);
            }
        }
        if (priorityQueue.size() > 0) {
            return priorityQueue.remove();
        }
        return res;
    }
}
