package problem_2279;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

class Mycomparator implements Comparator<Pair<Integer, Integer>> {

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        return Integer.compare((o1.getKey() - o1.getValue()), (o2.getKey() - o2.getValue()));
    }
}

public class Rocks {
    public static void main(String[] args) {
        Rocks rocks = new Rocks();
        int res = rocks.maximumBags(new int[]{2, 3, 4, 5}, new int[]{1, 2, 4, 4}, 2);
        System.out.println(res);
    }

    public int maximumBags(int[] capacity, int[] rocks, int additionalRocks) {
        PriorityQueue<Pair<Integer,Integer>> pairPriorityQueue = new PriorityQueue<>(new Mycomparator());
        int fullBags = 0;
        for (int i = 0; i < capacity.length; i++) {
            if (capacity[i] == rocks[i]) {
                fullBags++;
            } else {
                pairPriorityQueue.add(new Pair(capacity[i], rocks[i]));
            }

        }
        while (!pairPriorityQueue.isEmpty() && additionalRocks > 0) {
            Pair<Integer, Integer> pair = pairPriorityQueue.poll();
            int remCapacity = pair.getKey() - pair.getValue();
            if (remCapacity > additionalRocks) {
                break;
            } else {
                additionalRocks = additionalRocks - remCapacity;
                fullBags++;
            }
        }
        return fullBags;
    }
}
