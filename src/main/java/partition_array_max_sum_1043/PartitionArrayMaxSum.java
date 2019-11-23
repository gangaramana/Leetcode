package partition_array_max_sum_1043;

import java.util.Collections;
import java.util.PriorityQueue;

public class PartitionArrayMaxSum {
    public static void main(String[] args) {
        PartitionArrayMaxSum partitionArrayMaxSum = new PartitionArrayMaxSum();
        int result = partitionArrayMaxSum.maxSumAfterPartitioning(new int[]{1,4,1,5,7,3,6,1,9,9,3}, 4);
        System.out.println(result);
    }

    public int maxSumAfterPartitioning(int[] A, int K) {
        if (K == 0) {
            return 0;
        }
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
        for (int l : A) {
            priorityQueue.add(l);
        }
        int sum = 0;
        int length = A.length;
        while (length - K >= 0) {
            length = length - K;
            sum = sum + priorityQueue.remove() * K;
        }
        if (length != 0) {
            sum = sum + priorityQueue.remove() * length;
        }
        return sum;

    }
}
