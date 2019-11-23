package problem_1137;

public class NthTribnacci {
    public static void main(String[] args) {
        NthTribnacci nthTribnacci = new NthTribnacci();
        System.out.println(nthTribnacci.tribonacci(25));
    }

    public int tribonacci(int n) {
        if (n <= 0) {
            return 0;
        } else if (n < 3) {
            return 1;
        }
        int first = 0, second = 1, third = 1;
        int sum = 0;
        for (int i = 3; i <= n; i++) {
            sum = first + second + third;
            first = second;
            second = third;
            third = sum;
        }
        return third;
    }
}
