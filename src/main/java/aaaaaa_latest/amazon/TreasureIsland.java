package amazon;

import java.util.LinkedList;
import java.util.Queue;

class Point {
    int x;
    int y;

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }


}

public class TreasureIsland {
    public static void main(String[] args) {
        char[][] chars = new char[][]{{'o', 'o', 'o', 'o'}, {'D', 'o', 'D', 'o'}, {'o', 'o', 'o', 'o'}, {'x', 'D', 'D', 'o'}};
        TreasureIsland treasureIsland = new TreasureIsland();
        System.out.println(treasureIsland.distance(chars));
    }

    public int distance(char[][] chars) {
        int[][] no = new int[chars.length][chars[0].length];
        int[][] points = new int[][]{{1, 0}, {0, 1}, {-1, 0}, {0, -1}};
        Queue<Point> queue = new LinkedList<>();
        queue.add(new Point(0, 0));
        while (!queue.isEmpty()) {
            Point p = queue.remove();
            for (int[] k : points) {
                int newx = p.x + k[0];
                int newy = p.y + k[1];
                if (newx >= 0 && newx < chars.length && newy >= 0 && newy < chars[0].length && chars[newx][newy] != 'D') {
                    queue.add(new Point(newx, newy));
                    if (no[newx][newy] == 0 || no[newx][newy] < no[p.x][p.y] + 1) {
                        no[newx][newy] = no[p.x][p.y] + 1;
                    }
                    chars[p.x][p.y] = 'D';

                }
            }

        }

        for (int [] c:no){
            for (int ll:c){
                System.out.print(ll+" ");
            }
            System.out.println();
        }
        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < chars[0].length; j++) {
                if (chars[i][j] == 'x') {
                    return no[i][j];
                }

            }
        }
        return 0;
    }
}
