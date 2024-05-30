package problem_207;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Stack;

public class CourseSchedule {
    public static void main(String[] args) {
CourseSchedule courseSchedule=new CourseSchedule();
boolean b=courseSchedule.canFinish(2, new int[][]{{0,1}});
        System.out.println(b);
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Grap grap = new Grap(numCourses);
        for (int[] k : prerequisites) {
            grap.addEdge(k[0], k[1]);
        }
        return !grap.hasCycle();
    }
}


class Grap {
    int len;
    ArrayList<ArrayList<Integer>> adjList;

    Grap(int len) {
        this.len = len;
        adjList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }


    public void addEdge(int source, int destination) {
        adjList.get(source).add(destination);
    }

    public boolean hasCycle() {
        boolean[] visited = new boolean[adjList.size()];
        boolean[] inStack = new boolean[adjList.size()];

        for (int i = 0; i < adjList.size(); i++) {
            if (hasCycleUtil(visited, inStack, i)) {
                return true;
            }
        }
        return false;
    }

    private boolean hasCycleUtil(boolean[] visited, boolean[] inStack, int vertex) {

        if (inStack[vertex]){
            return true;
        }
        if (visited[vertex]){
            return false;
        }
        visited[vertex] = true;
        inStack[vertex] = true;

        for (int i = 0; i < adjList.get(vertex).size(); i++) {
            if (hasCycleUtil(visited, inStack, adjList.get(vertex).get(i))) {
             return true;
            }
        }
        inStack[vertex] = false;
        return false;
    }
}
