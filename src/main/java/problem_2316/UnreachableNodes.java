package problem_2316;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class UnreachableNodes {
    public static void main(String[] args) {
        UnreachableNodes unreachableNodes = new UnreachableNodes();
        System.out.println(unreachableNodes.countPairs(7, new int[][]{{0, 5}, {0, 2}, {2, 4},{1,6},{5,4}}));
    }

    public long countPairs(int n, int[][] edges) {
        List<List<Integer>> adjList = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            adjList.add(new ArrayList<>());
        }
        for (int[] edg : edges) {
            adjList.get(edg[0]).add(edg[1]);
            adjList.get(edg[1]).add(edg[0]);
        }
        boolean[] visited = new boolean[n];
        int nofVertices = 1;
        Arrays.fill(visited, false);
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                res.add(bfs(adjList, i, visited));
            }

        }
        int sum = 0;
        for (int i = 0; i < res.size() - 1; i++) {
            for (int j = i + 1; j < res.size(); j++) {
                sum = sum + res.get(i) * res.get(j);
            }
        }
        return sum;

    }

    private int bfs(List<List<Integer>> adjList, int vertex, boolean[] visited) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        int nofVertices = 0;
        while (!queue.isEmpty()) {
            int u = queue.remove();
            nofVertices++;
            for (int v : adjList.get(u)) {
                if (!visited[v]) {
                    visited[v] = true;
                    queue.add(v);
                }
            }

        }
        return nofVertices;
    }

}
