package problem_70;

public class ClimbingStairs {
    public static void main(String[] args) {
        ClimbingStairs climbingStairs = new ClimbingStairs();
        int x = climbingStairs.climbStairs(12);
        System.out.println(x);
    }

    public int climbStairs(int n) {
        int first = 1, second = 1;
        if (n <= 1) {
            return first;
        }
        int sum = 0;
        for (int i = 1; i < n; i++) {
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;


    }
}
