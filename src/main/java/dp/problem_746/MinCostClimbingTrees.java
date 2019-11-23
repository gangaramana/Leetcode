package dp.problem_746;

public class MinCostClimbingTrees {
    public static void main(String[] args) {
        MinCostClimbingTrees minCostClimbingTrees = new MinCostClimbingTrees();
        int res = minCostClimbingTrees.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1});
        System.out.println(res);
    }

    public int minCostClimbingStairs(int[] cost) {
        int[] res = new int[cost.length + 1];
        if (cost.length == 2) {
            return Math.min(cost[1], cost[0]);
        } else {
            int i = 2;
            while (i < res.length) {
                res[i] = Math.min(res[i - 1] + cost[i - 1], res[i - 2] + cost[i - 2]);
                i++;
            }
            return res[res.length - 1];
        }

    }
}
