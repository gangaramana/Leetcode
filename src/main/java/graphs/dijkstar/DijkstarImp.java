package graphs.dijkstar;

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

public class DijkstarImp {
    public static void main(String[] args) {
        ArrayList<ArrayList<ArrayList<Integer>>> list = new ArrayList<>();
        list.add(new ArrayList<>());
        list.add(new ArrayList<>());

        ArrayList<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(9);
        ArrayList<Integer> l2 = new ArrayList<>();
        l2.add(0);
        l2.add(9);
        list.get(0).add(l);
        list.get(1).add(l2);

        int[] res = DijkstarImp.dijkstra(2, list, 1);
        for (int i : res) {
            System.out.println(i);
        }
    }

    static int[] dijkstra(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj, int S) {
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Mycomparator());

        priorityQueue.add(new int[]{0, S});
        int[] size = new int[V];
        Arrays.fill(size, Integer.MAX_VALUE);
        size[S] = 0;
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
        return size;
    }
}
