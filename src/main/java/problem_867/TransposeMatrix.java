package problem_867;

public class TransposeMatrix {
    public static void main(String[] args) {
        int[][] c = new int[3][4];
//        System.out.println(c[0].length);
        TransposeMatrix t = new TransposeMatrix();
        c = t.transpose(new int[][]{{1, 2, 3}, {4, 5, 6},{7,8,9}});
        for (int f[]:c){
            for (int l:f){

                System.out.println(l);
            }

        }

    }

    public int[][] transpose(int[][] A) {
        int r = A[0].length, c = A.length;
        int[][] B = new int[r][c];
        for (int i = 0, nr = 0; i < r; i++, nr++) {
            for (int j = 0, nc = 0; j < c; j++, nc++) {

                B[nr][nc] = A[j][i];
            }
        }
        return B;
    }
}
