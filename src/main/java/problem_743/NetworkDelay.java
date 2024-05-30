package problem_743;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class Mycomparator implements Comparator<int[]> {

    @Override
    public int compare(int[] o1, int[] o2) {
        return Integer.compare(o1[0], o2[0]);
    }
}

public class NetworkDelay {
    public static void main(String[] args) {
        NetworkDelay networkDelay = new NetworkDelay();
        int res = networkDelay.networkDelayTime(new int[][]{{1,2,1}}, 2, 2);
        System.out.println(res);
    }

    public int networkDelayTime(int[][] times, int n, int k) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Mycomparator());
        List<List<List<Integer>>> adj = new ArrayList<>();
        for (int i = 0; i < n+1; i++) {
            adj.add(new ArrayList<>());
        }
        for (int[] dis : times) {
            List<Integer> l = new ArrayList<>();
            l.add(dis[1]);
            l.add(dis[2]);

            adj.get(dis[0]).add(l);
//            List<Integer> l2 = new ArrayList<>();
//            l2.add(dis[0]);
//            l2.add(dis[2]);
//
//            adj.get(dis[1]).add(l2);
        }

        priorityQueue.add(new int[]{0, k});
        int[] size = new int[n+1];
        Arrays.fill(size, Integer.MAX_VALUE);
        size[k] = 0;
        while (!priorityQueue.isEmpty()) {
            int[] distanceVertex = priorityQueue.poll();
            for (List<Integer> vertice : adj.get(distanceVertex[1])) {
                int weight = vertice.get(1);
                int vertex = vertice.get(0);
                if (distanceVertex[0] + weight < size[vertex]) {
                    size[vertex] = distanceVertex[0] + weight;
                    priorityQueue.add(new int[]{size[vertex], vertex});
                }
            }
        }
        int delay = Integer.MIN_VALUE;
        for (int i=1;i<size.length ;i++) {
            if (size[i] == Integer.MAX_VALUE) {
                return -1;
            }
            delay = Math.max(delay , size[i]);
        }
        return delay;
    }
}
