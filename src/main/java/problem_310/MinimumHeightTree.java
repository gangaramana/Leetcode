//package problem_310;
//
//import java.util.*;
//
//public class MinimumHeightTree {
//    public static void main(String[] args) {
//
//    }
//
//    public List<Integer> findMinHeightTrees(int n, int[][] edges) {
//        boolean[][] graph = new boolean[n][n];
//        for (int[] d : edges) {
//            graph[d[0]][d[1]] = true;
//            graph[d[1]][d[0]] = true;
//        }
//        Map<Integer, HashSet<Integer>> hashSetMap = new HashMap<>();
//        Queue<Integer> queue = new LinkedList<>();
//        HashSet<Integer> visited = new HashSet<>();
//        hashSetMap.put(0, new HashSet<>());
//        for (int i = 0; i < n; i++) {
//            if (!visited.contains(i)) {
//                int height = 0;
//                queue.add(i);
//                hashSetMap.get(0).add(i);
//                while (!queue.isEmpty()) {
//                    int k = queue.remove();
//
//                    for (int p = 0; p < n; p++) {
//                        if (graph[i][p] == true) {
//                            if (!visited.contains(k)) {
//                                queue.add(p);
//                                if ()
//
//                            }
//                            if (hashSetMap)
//                        }
//
//                    }
//
//
//                }
//
//
//            }
//
//        }
//    }
//}
