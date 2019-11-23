package problem_908;

import java.util.Arrays;

public class SmallestRange {
    public static void main(String[] args) {
        SmallestRange s = new SmallestRange();
        System.out.println(s.smallestRangeI(new int[]{1}, 0));

    }

    public int smallestRangeI(int[] A, int K) {
        Arrays.sort(A);
        int smallest = A[0], largest = A[A.length - 1], no = largest - smallest;
        if (no <= 2 * K) {
            return 0;
        }
        return (no - 2 * K);

    }
}
