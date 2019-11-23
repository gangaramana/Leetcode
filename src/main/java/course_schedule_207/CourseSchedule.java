package course_schedule_207;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class CourseSchedule {
    public static void main(String[] args) {
        CourseSchedule courseSchedule = new CourseSchedule();
        System.out.println(courseSchedule.canFinish(4, new int[][]{{0, 1},{0,2},{2,3},{1,3}}));
    }


    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Graph g = new Graph();
        for (int i = 0; i < numCourses; i++) {
            g.addVertex(i);
        }
        for (int[] l : prerequisites) {
            g.addEdge(l[0], l[1]);
        }
        return g.topologicalSort();

    }
}


class Graph {
    protected ArrayList<Integer> vertexList;
    //    private int noOfVertices;
    private HashMap<Integer, ArrayList<Integer>> hashMap;

    Graph() {
        vertexList = new ArrayList<>();
//        noOfVertices = size;
        hashMap = new HashMap<Integer, ArrayList<Integer>>();
    }

    public boolean addVertex(int label) {
        if (hashMap.containsKey(label)) {
            System.out.println("label already exists");
            return false;
        }
        hashMap.put(label, new ArrayList<Integer>());
        vertexList.add(label);
        return true;
    }

    public void addEdge(int source, int destination) {


//        ListObj l2 = new ListObj(destination, source, weight);
        hashMap.get(source).add(destination);
//        hashMap.get(destination).add(l2);
    }


    public boolean topologicalSort() {
        ArrayList<Integer> destinationList = new ArrayList<>();

        for (Map.Entry<Integer, ArrayList<Integer>> entry : hashMap.entrySet()) {
            for (int p : entry.getValue()) {
                destinationList.add(p);
            }

        }
        if (destinationList.size() == vertexList.size()) {
            return false;
        }
        ArrayList<Integer> result = new ArrayList<>();
//        int index_count = 0;
        while (result.size() < vertexList.size()) {
            ArrayList<Integer> lookup = new ArrayList<>();
            HashSet<Integer> unique = new HashSet<>(destinationList);
            if (unique.size() == vertexList.size()) {
                return false;
            } else {
                for (int k : vertexList) {
                    if (!unique.contains(k) && !result.contains(k)) {
                        result.add(k);
                        lookup.add(k);

                    }
                }
//                if (lookup.size() == 0) {
//                    break;
//                }

                for (int l : lookup) {
                    for (Integer p : hashMap.get(l)) {
                        destinationList.remove(p);
                    }
                }


            }
//            index_count++;
        }
        if (result.size() != vertexList.size()) {
            System.out.println(result);
            return false;
        }
        return true;
    }
}

