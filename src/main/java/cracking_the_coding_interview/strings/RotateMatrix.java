package cracking_the_coding_interview.strings;

public class RotateMatrix {
    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        rotateMatrix(matrix);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void rotateMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length - i - 1; i++) {
            rotate(i, i, matrix);

        }
    }

    static void rotate(int i, int j, int[][] matrix) {
        int pivot = 0;
        int intermediatePivot = 0;
        do {
            pivot = matrix[i][matrix.length - i - 1];
            matrix[i][matrix.length - i - 1] = matrix[i][j];
            intermediatePivot = j;
            j = matrix.length - i - 1;
            i = intermediatePivot;
            matrix[i][j] = pivot;
        } while (!(i == i && j == j));

    }
}
