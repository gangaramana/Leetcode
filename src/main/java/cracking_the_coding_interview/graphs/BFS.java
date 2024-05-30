package cracking_the_coding_interview.graphs;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class BFS {
    public static void main(String[] args) {
        Graph graph = new Graph(5);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 3);
        graph.addEdge(3, 4);
        graph.addEdge(0, 4);
        graph.bfs(0);
        System.out.println("-------------------------------");
        graph.dfs(0);
    }
}


class Graph {
    private int vertices;
    private ArrayList<ArrayList<Integer>> adjList;

    public Graph(int vertices) {
        this.vertices = vertices;
        adjList = new ArrayList<ArrayList<Integer>>(this.vertices);
        for (int i = 0; i < vertices; i++) {
            adjList.add(new ArrayList<>());
        }
    }

    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
        adjList.get(destination).add(source);

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
}
