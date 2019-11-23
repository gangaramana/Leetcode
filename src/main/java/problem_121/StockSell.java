package problem_121;

public class StockSell {
    public static void main(String[] args) {

    }

    public int maxProfit(int[] prices) {
        int res = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                if (res < prices[j] - prices[i]) {
                    res = prices[j] - prices[i];
                }
            }
        }
        return res;
    }
}
