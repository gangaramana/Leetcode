package contest.MinimumScoreTriangulation;

import java.util.Arrays;

public class ScoreTriangulation {
    public static void main(String[] args) {
        ScoreTriangulation scoreTriangulation = new ScoreTriangulation();
        int[] p = new int[]{2,1,4,4};
        int res=scoreTriangulation.minScoreTriangulation(p);
        System.out.println(res);
    }

    public int minScoreTriangulation(int[] A) {
        Arrays.sort(A);
        int sum = 0;
        for (int i = 2; i < A.length; i++) {
            sum = sum + A[0] * A[1] * A[i];

        }

        return sum;
    }
}
