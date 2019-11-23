package course_schedule_207;

import java.util.ArrayList;

public class CycleCourseSchedule {
    public static void main(String[] args) {
        CycleCourseSchedule cycleCourseSchedule = new CycleCourseSchedule();
        System.out.println(cycleCourseSchedule.canFinish(4, new int[][]{{0, 1}, {0, 2}, {2, 3}, {1, 3}}));

    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Grap grap = new Grap(numCourses);
        for (int[] k : prerequisites) {
            grap.addEdge(k[0], k[1]);
        }
        return grap.hasCycle();
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
        boolean[] visited = new boolean[len];
        boolean[] recStack = new boolean[len];
        for (int i = 0; i < len; i++) {
            if (hasCycleUtil(i, visited, recStack)) {
                return false;
            }
        }
        return true;
    }


    private boolean hasCycleUtil(int k, boolean[] visited, boolean[] recStack) {

        if (recStack[k]) {
            return true;
        }
        if (visited[k]) {
            return false;
        }
        visited[k] = true;
        recStack[k] = true;

        ArrayList<Integer> a = adjList.get(k);
        for (int l : a) {
            if (hasCycleUtil(l, visited, recStack)) {
                return true;
            }
        }
        recStack[k] = false;
        return false;
    }

}
