package google.cracking_the_coding.problem_1631;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class MInWork {
    public static void main(String[] args) {
        MInWork m=new MInWork();
        int res=m.minimumEffortPath(new int[][]{{1,2,2},{3,8,2},{5,3,5}});
        System.out.println(res);
    }


        public int minimumEffortPath(int[][] heights){
            int row=heights.length;
            int col=heights[0].length;

            int[] [] points =new int[][]{{1,0},{0,1},{0,-1},{-1,0}};

            PriorityQueue<Pair<Integer,int[]>> queue=new PriorityQueue(new Comparator<Pair<Integer,int[]>>() {

                @Override
                public int compare(Pair<Integer, int[]> o1, Pair<Integer, int[]> o2) {
                    return o1.getKey()-o2.getKey();
                }
            });
            int [][] distance=new int[row][col];
            for(int[] i:distance){
                Arrays.fill(i,Integer.MAX_VALUE);
            }

            queue.add(new Pair(heights[0][0],new int[]{0,0}));
            distance[0][0]=heights[0][0];

            while(queue.size()>0){
                Pair<Integer,int[]> pair=queue.remove();

                for(int[] p:points){
                    int x=pair.getValue()[0]+p[0];
                    int y=pair.getValue()[1]+p[1];
                    if(x>=0 && x<row && y>=0 && y<col){
                        int x1=pair.getValue()[0];
                        int y1=pair.getValue()[1];
                        int d1= Math.max(pair.getKey(),Math.abs(heights[x1][y1]-heights[x][y]));
                        if(distance[x][y] >d1){
                            distance[x][y]=d1;
                        }
                        if(x!=row-1 && y!=col-1){
                            queue.add(new Pair(d1,new int[]{x,y}));
                        }
                    }
                }

            }
            return distance[row-1][col-1];
        }
    }

