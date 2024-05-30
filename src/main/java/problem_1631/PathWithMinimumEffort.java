package problem_1631;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Pair<Integer,Pair<Integer,Integer>>>{

    @Override
    public int compare(Pair<Integer, Pair<Integer, Integer>> o1, Pair<Integer, Pair<Integer, Integer>> o2) {
        return Integer.compare(o1.getKey(),o2.getKey());
    }
}
public class PathWithMinimumEffort {
    public static void main(String[] args) {
        PathWithMinimumEffort pathWithMinimumEffort=new PathWithMinimumEffort();
       int res= pathWithMinimumEffort.minimumEffortPath(new int[][]{{1,2,2},{3,8,2},{5,3,5}});
        System.out.println(res);

    }
    public int minimumEffortPath(int[][] heights) {
        int[][] directions=new int[][]{{0,1},{1,0},{1,1},{-1,-1},{1,-1},{-1,1},{-1,0},{0,-1}};
int[][] size=new int[heights.length][heights[0].length];
        PriorityQueue<Pair<Integer, Pair<Integer,Integer>>> priorityQueue=new PriorityQueue<>(new MyComparator());
       for (int[] k: size){
           Arrays.fill(k,Integer.MAX_VALUE);
       }
        size[0][0]=heights[0][0];
       priorityQueue.add(new Pair<>(size[0][0],new Pair<>(0,0)));

       while (!priorityQueue.isEmpty()){
           Pair<Integer,Pair<Integer,Integer>> pairPair=priorityQueue.poll();
           for (int[] dir:directions){
               int newX=pairPair.getValue().getKey()+dir[0];
               int newY=pairPair.getValue().getValue()+dir[1];
               if (valid(newX,newY,heights.length,heights[0].length)){
                   int distance=pairPair.getKey();
                   int newDistance=distance+heights[newX][newY];
                   if (newDistance<size[newX][newY]){
                       size[newX][newY]=newDistance;
                       priorityQueue.add(new Pair<>(newDistance,new Pair<>(newX,newY)));
                   }
               }
           }

       }
       return size[heights.length-1][heights[0].length-1];

    }

    public boolean valid(int x,int y,int X,int Y){
        if (x<X && x>=0 && y<Y && y>=0){
            return true;
        }
        return false;
    }
}
