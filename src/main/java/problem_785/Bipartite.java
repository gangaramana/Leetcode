package problem_785;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Bipartite {
    public static void main(String[] args) {
        Bipartite bipartite = new Bipartite();
        boolean bipartite1 = bipartite.isBipartite(new int[][]{{1,3}, {0, 2}, { 1,3},{0,2}});
        System.out.println(bipartite1);
    }

//    public boolean isBipartite(int[][] graph) {
//        List<List<Integer>> adj = adjList(graph);
//        int[] color = new int[adj.size()];
//        Arrays.fill(color, -1);
//        boolean[] visited = new boolean[adj.size()];
//        Arrays.fill(visited, false);
//        for (int i = 0; i < adj.size(); i++) {
//            if (!visited[i]) {
//                return bfs(adj, i, visited);
//
//            }
//        }
//        return true;
//    }
//
//    private boolean bfs(List<List<Integer>> adjList, int vertex, boolean[] visited) {
//        Queue<Integer> queue = new LinkedList<>();
//        queue.add(vertex);
//        int color = 0;
//        int[] colorarray = new int[adjList.size()];
//        Arrays.fill(colorarray, -1);
//        while (!queue.isEmpty()) {
//            int v = queue.remove();
//            visited[v] = true;
//            colorarray[v] = color;
//            for (Integer edge : adjList.get(v)) {
//
//                if (!visited[edge]) {
//                    if (colorarray[edge] == -1) {
//                        colorarray[edge] = 1 - colorarray[v];
//                    } else if (colorarray[edge] == colorarray[v]) {
//                        return false;
//                    }
//                    visited[edge] = true;
//                    queue.add(edge);
//                }
//
//            }
//            color = 1 - colorarray[v];
//        }
//        return true;
//    }
//
//    private List<List<Integer>> adjList(int[][] graph) {
//        List<List<Integer>> adjList = new ArrayList<>();
//        for (int i = 0; i < graph.length; i++) {
//            adjList.add(new ArrayList<>());
//            for (int k : graph[i]) {
//                adjList.get(i).add(k);
//            }
//        }
//        return adjList;
//    }

    public boolean isBipartite(int[][] graph) {
        boolean[] visited = new boolean[graph.length];
        Arrays.fill(visited,false);
        int[] colors=new int[graph.length];
        Arrays.fill(colors,-1);
        Queue<Integer> queue=new LinkedList();
        for(int k=0;k<graph.length;k++){
            if(visited[k]){
                continue;
            }
            queue.add(k);
            visited[k]=true;
            colors[k]=0;;
            while(!queue.isEmpty()){
                int N=queue.size();

                while(N>0){
                    N--;
                    int U=queue.remove();
                    int  color=colors[U];
                    for(int i=0;i<graph[U].length;i++){

                        if(!visited[graph[U][i]]){
                            visited[graph[U][i]]=true;
                            colors[graph[U][i]]=1-color;
                            queue.add(graph[U][i]);
                        }
                        else{
                            if(colors[graph[U][i]]==color){
                                return false;
                            }
                        }
                    }


                }
                //  color=1-color;

            }
        }
        return true;



    }
}


