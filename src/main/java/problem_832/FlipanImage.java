/*

Given a binary matrix A, we want to flip the image horizontally, then invert it, and return the resulting image.

To flip an image horizontally means that each row of the image is reversed.  For example, flipping [1, 1, 0] horizontally results in [0, 1, 1].

To invert an image means that each 0 is replaced by 1, and each 1 is replaced by 0. For example, inverting [0, 1, 1] results in [1, 0, 0].
*/


package problem_832;

public class FlipanImage {
    public static void main(String[] args) {
        int[][] A = {{1,1,0,0},{1,0,0,1},{0,1,1,1},{1,0,1,0}};//{{1, 1,0}, {1,0,1},{0,0,0}};
        System.out.println(A[1].length);
        FlipanImage f=new FlipanImage();
        int [][]b=f.flipAndInvertImage(A);

//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//
//                System.out.print(b[i][j]+",");
//
//            }
//            System.out.println();
//            }

            }




    public int[][] flipAndInvertImage(int[][] A) {
        int len = A.length;
        int[][] b = new int[len][len];


        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (A[i][j]==0){
                    b[i][len-1-j]=1;
                }
                else {
                    b[i][len-1-j]=0;
                }
            }
        }
        return b;

    }
}
