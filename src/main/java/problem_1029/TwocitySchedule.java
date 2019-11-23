package problem_1029;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TwocitySchedule {
    public static void main(String[] args) {
        TwocitySchedule twocityScheduling = new TwocitySchedule();
        twocityScheduling.twoCitySchedCost(new int[][]{{259, 770}, {448, 54}, {926, 667}, {184, 139}, {840, 118}, {577, 469}});
    }

    public int twoCitySchedCost(int[][] costs) {
        Arrays.sort(costs, (o1, o2) -> {

//            return (Integer.valueOf(o2[0] + o2[1]).compareTo(Integer.valueOf(o1[0] + o1[1])));
            return (Integer.valueOf(Math.abs(o2[0] - o2[1])).compareTo(Integer.valueOf(Math.abs(o1[0] - o1[1]))));

        });

        int sum = 0, N = costs.length / 2, A = 0, B = 0;

        for (int[] x : costs) {
            if (Math.min(x[0], x[1]) == x[0]) {
                if (A < N) {
                    A++;
                    System.out.println("A      "+x[0]);
                    sum = sum + x[0];
                } else {
                    B++;
                    System.out.println("B      "+x[1]);
                    sum = sum + x[1];
                }
            } else {
                if (B < N) {
                    B++;
                    sum = sum + x[1];
                    System.out.println("B      "+x[1]);
                } else {
                    A++;
                    System.out.println("A      "+x[0]);
                    sum=sum+x[0];
                }
            }
        }

        System.out.println("-----------------------------------------------");
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
