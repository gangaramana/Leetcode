package google.cracking_the_coding.problem_1642.Ladders;

import java.util.Collections;
import java.util.PriorityQueue;

public class Ladders {

    public int furthestBuilding(int[] heights, int bricks, int ladders) {
        PriorityQueue<Integer> pq = new PriorityQueue(Collections.reverseOrder());
        for (int i = 0; i < heights.length - 1; i++) {
            if (heights[i] >= heights[i + 1]) {
                continue;
            } else {
                int diff = heights[i + 1] - heights[i];
                if (bricks >= heights[i + 1] - heights[i]) {

                    bricks = bricks - diff;
                    pq.add(diff);
                } else if (ladders > 0) {
                    if (!pq.isEmpty() && pq.peek() >= diff) {

                        bricks += pq.remove();
                        pq.add(diff);
                    }
                    ladders--;
                } else {
                    return i;
                }

            }


        }
        return -1;


    }
}
