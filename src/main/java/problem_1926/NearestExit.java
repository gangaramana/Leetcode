package problem_1926;

import javafx.util.Pair;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class NearestExit {
    public static void main(String[] args) {
        NearestExit nearestExit = new NearestExit();
        int result = nearestExit.nearestExit(new char[][]{{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}}, new int[]{1, 0});
        System.out.println(result);
    }

    public int nearestExit(char[][] maze, int[] entrance) {
        int result = Integer.MAX_VALUE;
        int[][] directions = new int[][]{{1, 0}, {0, 1}, {0, -1}, {-1, 0}};
        Queue<int[]> queue = new    LinkedList<>();
        boolean[][] visited = new boolean[maze.length][maze[0].length];
        for (boolean[] v : visited) {
            Arrays.fill(v, false);
        }
        queue.add(entrance);
        int depth = 0;
        while (!queue.isEmpty()) {
            int len = queue.size();
            depth++;
            while (len > 0) {
                visited[queue.peek()[0]][queue.peek()[1]] = true;


                for (int[] dir : directions) {
                    int newX = queue.peek()[0] + dir[0];
                    int newY = queue.peek()[1] + dir[1];
                    if ((newX >= 0 && newX < maze.length && newY >= 0 && newY < maze[0].length) && !visited[newX][newY] && maze[newX][newY] != '+') {
                        if (newX == 0 || newY == 0 || newX == maze.length - 1 || newY == maze[0].length - 1) {
                            result = Math.min(result, depth);

                        } else {
                            queue.add(new int[]{newX, newY});
                        }
                    }
                }
                queue.poll();
                len--;

            }
        }
        if (result == Integer.MAX_VALUE) {
            return -1;
        }
        return result;

    }
}
