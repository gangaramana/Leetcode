package cracking_the_coding_interview.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class TopologicalSort {
    public static void main(String[] args) {
        DirectedGraph directedGraph = new DirectedGraph(10);
        directedGraph.addEdge(0, 5);
        directedGraph.addEdge(0, 1);
        directedGraph.addEdge(1, 7);
        directedGraph.addEdge(3, 2);
        directedGraph.addEdge(3, 8);
        directedGraph.addEdge(3, 4);
        directedGraph.addEdge(4, 8);
        directedGraph.addEdge(6, 0);
        directedGraph.addEdge(6, 1);
        directedGraph.addEdge(6, 2);
        directedGraph.addEdge(8, 2);
        directedGraph.addEdge(9, 4);
        directedGraph.topologicalSort();
    }

}

class DirectedGraph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public DirectedGraph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<ArrayList<Integer>>(this.vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);

    }

    public void bfs(int vertex) {
        boolean[] visited = new boolean[this.vertices];

        Queue<Integer> queue = new LinkedList<>();
        queue.add(vertex);
        while (!queue.isEmpty()) {
            int visitedVertex = queue.remove();
            if (visited[visitedVertex]) {
                continue;
            }
            visited[visitedVertex] = true;
            for (int v : adjList.get(visitedVertex)) {
                if (!visited[v]) {
                    queue.add(v);
                }
            }
            System.out.println(visitedVertex);
        }
    }

    public void dfs(int vertex) {
        Stack<Integer> stack = new Stack<>();
        stack.add(vertex);
        boolean[] visited = new boolean[this.vertices];

        while (!stack.isEmpty()) {
            int visitedVertex = stack.pop();
            if (visited[visitedVertex]) {
                continue;
            }
            visited[visitedVertex] = true;
            for (int v : adjList.get(visitedVertex)) {
                if (!visited[v]) {
                    stack.add(v);
                }
            }
            System.out.println(visitedVertex);
        }
    }

    public void topologicalSort() {
        boolean[] visited = new boolean[this.vertices];
        Stack<Integer> result = new Stack<>();
        for (int i = 0; i < this.vertices; i++) {
            if (visited[i]) {
                continue;
            }
            topologicalUtil(i, result, visited);
        }
        while (!result.isEmpty()) {
            System.out.println(result.pop());
        }
    }

    private void topologicalUtil(int vertex, Stack<Integer> result, boolean[] visited) {
        visited[vertex] = true;
        for (int v : adjList.get(vertex)) {
            if (!visited[v]) {
                topologicalUtil(v, result, visited);
            }
        }
        result.add(vertex);
    }
}