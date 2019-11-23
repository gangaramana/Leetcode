package contest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TwocityScheduling {
    public static void main(String[] args) {
        TwocityScheduling twocityScheduling = new TwocityScheduling();
        twocityScheduling.twoCitySchedCost(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}});
    }

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> {

            return (Integer.valueOf(o1[0] + o1[1]).compareTo(Integer.valueOf(o2[0] + o2[1])));

        });

        int sum = 0, N = costs.length / 2, A = 0, B = 0;

        for (int[] x : costs) {
            if (Math.min(x[0], x[1]) == x[0]) {
                if (A < N) {
                    A++;
                    sum = sum + x[0];
                } else {
                    B++;
                    sum = sum + x[1];
                }
            } else {
                if (B < N) {
                    B++;
                    sum = sum + x[1];
                } else {
                    A++;
                    sum=sum+x[0];
                }
            }
        }
        System.out.println(sum + "     " + A + "    " + B);

        for (int[] cost : costs) {
            for (int k : cost) {
                System.out.print(k + "  ");
            }
            System.out.println();
        }
        return sum;
    }
}
