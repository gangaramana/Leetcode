package problem_279;

public class PerfectSquares {
    public static void main(String[] args) {
        PerfectSquares perfectSquares = new PerfectSquares();
        int k = perfectSquares.numSquares(12);
        System.out.println(k);
    }

    public int numSquares(int n) {
        int[] dp = new int[n];
        dp[0] = 1;

        for (int i = 1; i < n; i++) {
            int k = 0;
            int min = Integer.MAX_VALUE;
            double x = Math.sqrt(i + 1);
            if (Math.ceil(x) == Math.floor(x)) {
                dp[i] = 1;
                continue;
            }

            while (k <= i - k) {
                min = Math.min(min, dp[i - k - 1] + dp[k]);
                k++;
            }
            dp[i] = min;
        }
        return dp[n - 1];
    }
}
