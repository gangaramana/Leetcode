package google.cracking_the_coding.problem_1091;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Pair<Integer,int[]>> {


    @Override
    public int compare(Pair<Integer, int[]> o1, Pair<Integer, int[]> o2) {
        return Integer.compare(o1.getKey(),o2.getKey());
    }
}
public class MatrixPath {
    public static void main(String[] args) {
        MatrixPath matrixPath=new MatrixPath();
        System.out.println(matrixPath.shortestPathBinaryMatrix(new int[][]{{0,0,1},{1,1,0},{1,1,0}}));
    }

    public int shortestPathBinaryMatrix(int[][] grid){
        int n=grid.length;
        PriorityQueue<Pair<Integer,int[]>> queue=new PriorityQueue(new MyComparator());
        int[] distance=new int[grid.length*grid.length];
        Arrays.fill(distance,Integer.MAX_VALUE);
distance[n*(n-1)+n-1]=0;
        List<Pair<Integer,Integer>> validPoints= validPoints(new int[]{grid.length-1,grid.length-1},n,grid);
        for(Pair<Integer,Integer> p : validPoints){
            queue.add(new Pair(1,new int[]{p.getKey(),p.getValue()}));
            distance[n*p.getKey()+p.getValue()]=1;
        }

        while(!queue.isEmpty()){
            Pair<Integer,int[]> p=queue.remove();

            for(Pair<Integer,Integer> pair:validPoints(p.getValue(),n,grid)){
                int x=pair.getKey();
                int y=pair.getValue();
                if(p.getKey()+1<distance[x*n+y]){
                    distance[x*n+y]=p.getKey()+1;
                    queue.add(new Pair(p.getKey()+1,new int[]{x,y}));
                }
            }

        }
      return distance[0]==Integer.MAX_VALUE ?  -1: distance[0]+1;
    }




    private List<Pair<Integer,Integer>> validPoints(int[] point,int len,int[][] mat){
        int[][] points=new int[][]{{1,1},{1,-1},{-1,1},{0,1},{1,0},{0,-1},{-1,0},{-1,-1}};
        List<Pair<Integer,Integer>> list=new ArrayList<>();
        for(int[] p:points){
            int x= point[0]+p[0];
            int y=point[1]+p[1];
            if(x>=0 && x<len && y>=0 && y<len && mat[x][y] ==0 ){
                list.add(new Pair(x,y));
            }
        }

        return list;

    }
}
