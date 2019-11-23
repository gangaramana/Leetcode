package problem_566;

public class ReshapeTheMatrix {
    public static void main(String[] args) {
        ReshapeTheMatrix reshapeTheMatrix = new ReshapeTheMatrix();
        int[][] x = reshapeTheMatrix.matrixReshape(new int[][]{{1, 2, 3}, {4, 5, 6}}, 6, 1);
        System.out.println("rows  " + x.length + "   colu   " + x[0].length);
        for (int[] p : x) {
            for (int i : p) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        int rows = nums.length, columns = nums[0].length, rr = 0, rc = 0;
//        System.out.println("colunss   " + columns + "  rows   " + rows);
        if (columns * rows == r * c) {
            int[][] result = new int[r][c];
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    if (rr >= r || rc >= c) {
                        rc = 0;
                        rr++;
                    }
                    result[rr][rc++] = nums[i][j];

                }
            }
            return result;

        }

        return nums;

    }
}
