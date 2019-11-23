package problem_985;

public class EvenSumAfterQueries {
    public static void main(String[] args) {
        EvenSumAfterQueries e = new EvenSumAfterQueries();
        int[] g = e.sumEvenAfterQueries(new int[]{1, 2, 3, 4}, new int[][]{{1, 0}, {-3, 1}, {-4, 0}, {1,3}});
        for (int d : g) {
            System.out.println(d);
        }


    }

    public int[] sumEvenAfterQueries(int[] A, int[][] queries) {
        int value, i = 0;
        int[] sum = new int[A.length];
        for (int[] x : queries) {
            A[x[1]] = A[x[1]] + x[0];
            value = 0;
            for (int c : A) {
                if (c % 2 == 0) {
                    value = value + c;
                }
            }
            sum[i++] = value;
        }
        return sum;
    }
}
