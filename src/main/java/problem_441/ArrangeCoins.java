package problem_441;


public class ArrangeCoins {
    public static void main(String[] args) {
        ArrangeCoins arrangeCoins = new ArrangeCoins();
        int x = arrangeCoins.arrangeCoins(1804289383);
        System.out.println(x);
    }

    public int arrangeCoins(int n) {
         int k = n * 2;
        double ans = (int) (Math.sqrt(0.25 + k) - 0.5);
        return (int)ans;
    }
}
