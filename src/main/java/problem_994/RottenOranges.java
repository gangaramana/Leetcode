package problem_994;

import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.Map;
import java.util.Queue;

public class RottenOranges {
    public static void main(String[] args) {
        RottenOranges rottenOranges = new RottenOranges();
        System.out.println(rottenOranges.orangesRotting(new int[][]{{2, 1, 1}, {0, 1, 1}, {1, 0, 1}}));

    }

    public int orangesRotting(int[][] grid) {
        int R = grid.length, C = grid[0].length;
        int[] br = new int[]{-1, 0, 1, 0};
        int[] bc = new int[]{0, -1, 0, 1};
        Queue<Integer> queue = new ArrayDeque<Integer>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int r = 0; r < R; r++) {
            for (int c = 0; c < C; c++) {
                if (grid[r][c] == 2) {
                    int code = r * C + c;
                    queue.add(code);
                    map.put(code, 0);

                }
            }
        }
        int result = 0;
        while (!queue.isEmpty()) {
            int code = queue.remove();
            for (int k = 0; k < 4; k++) {
                int rr = code / C + br[k];
                int rc = code % C + bc[k];
                if (0 <= rr && rr < R && 0 <= rc && rc < C && grid[rr][rc] == 1) {
                    grid[rr][rc] = 2;
                    int ncode = rr * C + rc;
                    queue.add(ncode);
                    map.put(ncode, map.get(code) + 1);
                    result = map.get(ncode);
                }
            }
        }

        for (int[] row : grid)
            for (int v : row)
                if (v == 1)
                    return -1;
        return result;

    }
}



