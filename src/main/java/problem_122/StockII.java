package problem_122;

public class StockII {
    public static void main(String[] args) {
        StockII stockII = new StockII();
        int k = stockII.maxProfit(new int[]{1, 2, 3, 0,2});
        System.out.println(k);
    }

    public int maxProfit(int[] prices) {
        if (prices.length <= 0) {
            return 0;
        }
        int[] k = new int[prices.length];
        k[0] = 0;
        for (int p = 1; p < prices.length; p++) {
            k[p] = k[p - 1] + Math.max(0, prices[p] - prices[p - 1]);
        }
        return k[prices.length - 1];
    }
}
