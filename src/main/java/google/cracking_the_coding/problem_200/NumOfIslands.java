package google.cracking_the_coding.problem_200;

import javafx.util.Pair;

import java.util.LinkedList;
import java.util.Queue;

public class NumOfIslands {
    public static void main(String[] args) {
        NumOfIslands numOfIslands=new NumOfIslands();
        System.out.println( numOfIslands.numIslands(new char[][]{{'1','1','1','1','0'},{'1','1','0','1','0'},{'1','1','0','0','0'},{'0','0','0','0','0'}}));
    }

    public int numIslands(char[][] grid) {
        Queue<Pair<Integer,Integer>> queue=new LinkedList();
        int[][] points=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        int res=0;

        boolean [][]visited = new boolean[grid.length][grid[0].length];
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1' && !visited[i][j]){
                    res++;
                    visited[i][j]=true;
                    queue.add(new Pair(i,j));
                }
                while(!queue.isEmpty()){
                    Pair<Integer,Integer> pair=queue.remove();
                    for(int [] point:points){
                        int X=pair.getKey()+point[0];
                        int Y=pair.getValue()+point[1];
                        if(X<0 || X>=grid.length ||Y<0 || Y >= grid[0].length || visited[X][Y] || grid[X][Y]=='0'){
                            continue;
                        }
                        visited[X][Y]=true;
                        queue.add(new Pair(X,Y));
                    }

                }
            }


        }
        return res;
    }
}
