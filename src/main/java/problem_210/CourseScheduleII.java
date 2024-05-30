package problem_210;

import java.util.ArrayList;
import java.util.Stack;

public class CourseScheduleII {
    public static void main(String[] args) {
CourseScheduleII courseScheduleII=new CourseScheduleII();
int [] res=courseScheduleII.findOrder(4, new int[][]{{1,0},{2,0},{3,1},{3,2}});
for (int i:res){
    System.out.println(i);
}
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        Graph graph = new Graph(numCourses);
        for (int[] edges : prerequisites) {
            graph.addEdge(edges[0], edges[1]);
        }
        return graph.graphCycle();
    }
}

class Graph {
    int len;
    ArrayList<ArrayList<Integer>> adjList;

    Graph(int len) {
        this.len = len;
        adjList = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            adjList.add(new ArrayList<Integer>());
        }
    }


    public void addEdge(int source, int destination) {
        adjList.get(destination).add(source);
    }

    public int[] graphCycle(){
        Stack<Integer> course=new Stack<>();
        boolean[] visited=new boolean[len];
        boolean[] inStack=new boolean[len];
        for (int i=0;i<len;i++){
            if (cycleUtil(visited,inStack,course,i)){
                int [] a=new int[]{};
                return a;
            }
        }
        int [] a=new int[course.size()];
        int i=0;
        while (!course.isEmpty()){
            a[i++]=course.pop();
        }
        return a;
    }

    public boolean cycleUtil(boolean[] visited, boolean[] inStack,Stack<Integer> course,int vertex){
        if (inStack[vertex]){
            return true;
        }
        if (visited[vertex]){
            return false;
        }
        visited[vertex]=true;
        inStack[vertex]=true;
        for (int i=0;i<adjList.get(vertex).size();i++){
            if (cycleUtil(visited,inStack,course,adjList.get(vertex).get(i))){
                return true;
            }
        }
        inStack[vertex]=false;
        course.push(vertex);
        return false;
    }
}
