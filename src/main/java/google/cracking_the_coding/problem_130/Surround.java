package google.cracking_the_coding.problem_130;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class Surround {
    public static void main(String[] args) {
      Surround surround=new Surround();
      char [][] board=new char[][]{{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},{'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
surround.solve(board);
        for (int i=0;i<board.length;i++){
            for (int j=0;j<board[0].length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }

    }

    public void solve(char[][] board) {
        List<Integer> list=new ArrayList();
        for(int i=0;i<board[0].length;i++){
            if(board[i][0]=='O'){
                list.add(board[0].length * i);
            }
            if(board[i][board.length-1]=='O'){
                list.add(board[0].length*i + board.length-1);
            }
        }

        for(int j=0;j<board.length;j++){
            if(board[0][j]=='O'){
                list.add(j);
            }
            if(board[board[0].length-1][j]=='O'){
                list.add((board[0].length-1)*board[0].length + j);
            }
        }

        Set<Integer> visited = bfs(board,list);
        for(int i=0;i<board[0].length;i++){
            for(int j=0;j<board.length;j++){
                if(visited.contains(i*board[0].length+j)){
                    board[i][j]='O';
                }
                else {
                    board[i][j] = 'X';
                }
            }
        }



    }


    private Set<Integer> bfs(char[][] board,List<Integer> list){
        int[][] points=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        Set<Integer> visited=new HashSet();
        Queue<Integer> queue=new LinkedList();
        for(int i: list){
            if(!visited.contains(i)){
                queue.add(i);
                visited.add(i);
                while(!queue.isEmpty()){
                    int vertex=queue.remove();

                    int x=vertex/board[0].length,y=vertex%board[0].length;
                    for(int[] p:points){
                        int X=x+p[0],Y=y+p[1];
                        if(X<0 || X>=board[0].length ||Y<0 ||Y>=board[0].length || board[X][Y] =='X'|| visited.contains(X*board.length+Y)){
                            continue;
                        }
                        queue.add(X*board.length+Y);
                        visited.add(X*board.length+Y);

                    }

                }
            }
        }
        return visited;
    }
}
