package problem_1162;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class AsFarFromLand {
    public static void main(String[] args) {
        AsFarFromLand asFarFromLand = new AsFarFromLand();
        int distance = asFarFromLand.maxDistance(new int[][]{{1, 0, 0}, {0, 0, 0}, {0, 0, 0}});
        System.out.println("distance    "+distance);
    }

    public int maxDistance(int[][] grid) {
        Queue<Point> pointList = new LinkedList<>();
        int[][] res = new int[grid.length][grid.length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    res[i][j] = 0;
                    pointList.add(new Point(i, j));
                } else {
                    res[i][j] = Integer.MAX_VALUE;
                }
            }
        }
        int result = -1;
        if (pointList.size() == 0 || pointList.size() == res.length * res.length) {
            return result;
        }

        int[][] itr = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        while (pointList.size() > 0) {
            Point c = pointList.poll();
            for (int[] d : itr) {
                int newx = c.x + d[0];
                int newy = c.y + d[1];
                if (newx >= 0 && newx < grid.length && newy >= 0 && newy < grid.length && res[newx][newy] > res[c.x][c.y] + 1) {
                    res[newx][newy] = res[c.x][c.y] + 1;
                    pointList.add(new Point(newx, newy));
                }
            }
        }

        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res.length; j++) {
                System.out.print(res[i][j]+"  ");
                if (result < res[i][j]) {
                    result = res[i][j];
                }
            }
            System.out.println();
        }
        return result;
    }
}

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
