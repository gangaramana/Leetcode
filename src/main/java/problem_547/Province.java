package problem_547;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Province {
    public static void main(String[] args) {
Province province=new Province();
int res=province.findCircleNum(new int[][]{{1,0,0,1},{0,1,1,0},{0,1,1,1},{1,0,1,1}});
        System.out.println(res);
    }

    public int findCircleNum(int[][] isConnected) {
        boolean[] visited = new boolean[isConnected.length];
        Arrays.fill(visited, false);
        int nofProvinces = 0;
        for (int i = 0; i < isConnected.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                nofProvinces++;
//                bfs(isConnected, visited, i);
                dfs(isConnected,visited,i);
            }


        }
        return nofProvinces;

    }

    private void bfs(int[][] isConnected, boolean[] visited, int vertex) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        while (!queue.isEmpty()) {
            vertex=queue.poll();
            for (int i = 0; i < isConnected[0].length; i++) {
                if ( isConnected[vertex][i]==1) {
                    if (!visited[i]) {
                        visited[i] = true;
                        queue.add(i);
                    }
                }
            }
        }


    }

    private void dfs(int[][] isConnected, boolean[] visited, int vertex){
        Stack<Integer> stack = new Stack<>();
        stack.add(vertex);
        while (!stack.isEmpty()) {
            vertex=stack.pop();
            for (int i = 0; i < isConnected[0].length; i++) {
                if ( isConnected[vertex][i]==1) {
                    if (!visited[i]) {
                        visited[i] = true;
                        stack.add(i);
                    }
                }
            }
        }

    }

}
