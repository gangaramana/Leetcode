package google.cracking_the_coding.path;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution {

    public static void main(String[] args) {
        List<String> path=findPath(new int[][]{{1,1},{1,1}},2);
        for(String p:path){
            System.out.println(p);
        }
    }
    public static ArrayList<String> findPath(int[][] m, int n) {
        Map<Character, Pair<Integer,Integer>> points=new HashMap();
        points.put('D',new Pair(1,0));
        points.put('R',new Pair(0,1));
        points.put('U',new Pair(-1,0));
        points.put('L',new Pair(0,-1));
        ArrayList<String> result=new ArrayList<>();
        if(m[0][0]==0 || m[n-1][n-1]==0){
            result.add("-1");
            return result;

        }
        boolean[][] visited=new boolean[n][n];
        findPath(m,n,result,0,0,points,"",visited);
        return result;



    }

    private static void findPath(int[][]m,int n,ArrayList<String> result,int x,int y,Map<Character,Pair<Integer,Integer>> points,String path,boolean [][] visited){
        if(x==n-1 && y==n-1){
            result.add(path);
            return;
        }
        visited[x][y]=true;
        for(Map.Entry<Character,Pair<Integer,Integer>> entry:points.entrySet()){
            int x1=x+entry.getValue().getKey();
            int y1=y+entry.getValue().getValue();
            if(x1>=0 && x1<n && y1>=0 && y1<n && m[x1][y1]!=0 && !visited[x1][y1]){
                findPath(m,n,result,x1,y1,points,path+entry.getKey(),visited);
            }
        }

    }
}
