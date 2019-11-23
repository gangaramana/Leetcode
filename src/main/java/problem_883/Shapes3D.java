package problem_883;

public class Shapes3D {
    public static void main(String[] args) {
        Shapes3D s=new Shapes3D();
        System.out.println( s.projectionArea(new int[][]{{1,1,1},{1,0,1},{1,1,1}}));

    }

    public int projectionArea(int[][] grid) {
        int N = grid.length;
        int ans = 0;

        for (int i = 0; i < N;  ++i) {
            int bestRow = 0;  // largest of grid[i][j]
            int bestCol = 0;  // largest of grid[j][i]
            for (int j = 0; j < N; ++j) {
                if (grid[i][j] > 0) ans++;  // top shadow
                bestRow = Math.max(bestRow, grid[i][j]);
                bestCol = Math.max(bestCol, grid[j][i]);
            }
            ans += bestRow + bestCol;
        }

        return ans;
    }
}
