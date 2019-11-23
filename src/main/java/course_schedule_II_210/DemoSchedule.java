package course_schedule_II_210;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;



public class DemoSchedule {
    public static void main(String[] args) {
        DemoSchedule schedule = new DemoSchedule();
        int[] res = schedule.findOrder(2, new int[][]{{1,0}});
        for (int c : res) {
            System.out.println(c);
        }
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph2 graph2 = new Graph2(numCourses);
        for (int[] c : prerequisites) {
            graph2.addEdge(c[0], c[1]);
        }

        return graph2.topologicalSort();


    }
}
class Graph2 {
    private int v;
    private LinkedList<Integer> adj[];

    Graph2(int size) {
        this.v = size;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<>();
        }
    }

    void addEdge(int v, int w) {
        adj[w].add(v);
    }

    int[] topologicalSort() {

        boolean[] visited = new boolean[v];
        boolean[] recStack = new boolean[v];
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < v; i++) {
            if (topolicalUtil(i, visited, recStack, stack)) {
                return new int[0];
            }
        }
        int[] res = new int[v];
        int k = 0;
        while (!stack.isEmpty()) {
            res[k++] = stack.pop();

        }
        return res;
    }

    private boolean topolicalUtil(int v, boolean[] visited, boolean[] recStack, Stack<Integer> stack) {
        if (recStack[v]) {
            return true;
        }
        if (visited[v]) {
            return false;
        }
        recStack[v] = true;
        visited[v] = true;
        Iterator<Integer> integerIterator = adj[v].listIterator();
        while (integerIterator.hasNext()) {
            if (topolicalUtil(integerIterator.next(), visited, recStack, stack)) {
                return true;
            }
        }
        recStack[v] = false;
        stack.push(v);

        return false;
    }
}
