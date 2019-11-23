package problem_766;

public class toplitzMatrix {
    public static void main(String[] args) {
        toplitzMatrix x = new toplitzMatrix();
        System.out.println(x.isToeplitzMatrix(new int[][]{{36, 59, 71, 15, 26, 82, 87}, {56, 36, 59, 71, 15, 26, 82}, {15, 56, 36, 59, 71, 15, 26},{7 ,15 ,56,36,59,71,15}}));

    }

    public boolean isToeplitzMatrix(int[][] matrix) {
        int rowCount = matrix.length, columnCount = matrix[0].length;
        int i = 0;
        while (i < columnCount) {
            int j = 0, k = i;
            int no = matrix[j][k];
            while (j < rowCount - 1 && k < columnCount - 1) {
                if (no != matrix[++j][++k]) {
                    return false;
                }
            }
            i++;
        }
        i = 1;
        while (i < rowCount) {
            int j = i, k = 0;
            int no = matrix[j][k];
            while (j < rowCount - 1 && k < columnCount - 1) {
                if (no != matrix[++j][++k]) {
                    return false;
                }
            }
            i++;

        }
        return true;

    }
}
