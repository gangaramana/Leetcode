package package_807;


//[[59,88,44],[3,18,38],[21,26,51]]
public class CitySkyline {
    public static void main(String[] args) {
        CitySkyline citySkyline = new CitySkyline();
        int result = citySkyline.maxIncreaseKeepingSkyline(new int[][]{{3,0,8,4},{2,4,5,7},{9,2,6,3},{0,3,1,0}});
        System.out.println("resultt    " + result);

    }

    public int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] leftRight = new int[grid[0].length];
        int[] topBottom = new int[grid.length];
        for (int i = 0; i < grid.length; i++) {
            int max = grid[i][0];
            for (int j = 0; j < grid[0].length; j++) {
                if (max < grid[i][j]) {
                    max = grid[i][j];
                }
                leftRight[i] = max;
            }
        }
        for (int i = 0; i < grid[0].length; i++) {
            int max2 = grid[0][i];
            for (int j = 0; j < grid.length; j++) {
                if (max2 < grid[j][i]) {
                    max2 = grid[j][i];
                }
                topBottom[i] = max2;
            }
        }
        int sum = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum = sum + (Math.min(leftRight[i], topBottom[j]) - grid[i][j]);
            }

        }

        return sum;
    }
}
