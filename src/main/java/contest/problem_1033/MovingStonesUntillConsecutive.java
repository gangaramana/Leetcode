package contest.problem_1033;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MovingStonesUntillConsecutive {
    public static void main(String[] args) {
        MovingStonesUntillConsecutive movingStonesUntillConsecutive = new MovingStonesUntillConsecutive();
        int[] x = movingStonesUntillConsecutive.numMovesStones(1, 5, 2);
        for (int l : x) {
            System.out.println(l);
        }

    }

    public int[] numMovesStones(int a, int b, int c) {
        int[] arr = new int[3];
        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        Arrays.sort(arr);
        int min = minimumMoves(arr[0], arr[1], arr[2]);
        int max = maximumMoves(arr[0], arr[1], arr[2]);
        return new int[]{min, max};

    }

    public int minimumMoves(int a, int b, int c) {
        if (a + 1 == b && b + 1 == c) {
            return 0;
        }
        if (b - a <= 2 || c - b <= 2) {
            return 1;
        }
        return 2;
    }

    public int maximumMoves(int a, int b, int c) {
        return c - a - 2;
    }
}
