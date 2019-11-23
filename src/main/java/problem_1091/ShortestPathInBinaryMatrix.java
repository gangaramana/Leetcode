package problem_1091;

import java.util.LinkedList;
import java.util.Queue;

public class ShortestPathInBinaryMatrix {
    public static void main(String[] args) {
        ShortestPathInBinaryMatrix shortestPathInBinaryMatrix = new ShortestPathInBinaryMatrix();
        System.out.println(shortestPathInBinaryMatrix.shortestPathBinaryMatrix(new int[][]{{1,0,0}, {1, 1, 0}, {1, 1, 0}}));
    }

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] res = new int[grid.length][grid[0].length];
        int[] br = new int[]{-1, 0, 1, 0, -1, -1, 1, 1};
        int[] bc = new int[]{0, -1, 0, 1, -1, 1, -1, 1};
        Queue<Point> queue = new LinkedList<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 0) {
                    queue.add(new Point(i, j));
                }
            }
        }
        int rr, rc;
        res[0][0] = 1;
        while (queue.size() > 1) {
            Point p = queue.remove();
            if (res[p.x][p.y]==0){
                continue;
            }
            for (int k = 0; k < 8; k++) {
                rr = p.x + br[k];
                rc = p.y + bc[k];

                if (0 <= rr && rr < grid.length && 0 <= rc && rc < grid[0].length && grid[rr][rc] == 0) {
                    if (res[rr][rc] == 0) {
                        res[rr][rc] = res[p.x][p.y] + 1;
                    } else {
                        res[rr][rc] = Math.min(res[rr][rc], res[p.x][p.y] + 1);

                    }
                }

            }

        }
        return res[grid.length - 1][grid[0].length - 1]==0?-1:res[grid.length - 1][grid[0].length - 1];

    }

}

class Point {
    int x, y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
