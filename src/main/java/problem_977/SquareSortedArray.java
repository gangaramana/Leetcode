package problem_977;
//question::


/*Given an array of integers A sorted in non-decreasing order,
        return an array of the squares of each number, also in sorted non-decreasing order.*/


import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        SquareSortedArray s=new SquareSortedArray();
        int []A={-4,-1,0,3,10};

        s.sortedSquares(A);
        int length=A.length;
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }


    }

    public int[] sortedSquares(int[] A) {
        int length = A.length;
        for (int i = 0; i < length; i++) {
            A[i] = A[i] * A[i];
        }
        Arrays.sort(A);

        return A;
    }
}
