package problem_2976;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MinDistance {
    public static void main(String[] args) {
        MinDistance minDistance = new MinDistance();
        long res = minDistance.minimumCost("aaaa", "bbbb", new char[]{'a', 'c'}, new char[]{'c', 'b',}, new int[]{ 1, 2});
        System.out.println(res);
    }

    public long minimumCost(String source, String target, char[] original, char[] changed, int[] cost) {

        int[][] distance = new int[original.length][original.length];
        for (int[] d : distance) {
            Arrays.fill(d, Integer.MAX_VALUE);
        }
        Map<Character, Integer> map = new HashMap();
        int i = 0;
        for (char c : original) {
            map.put(c, i++);
        }
        for (int j = 0; j < original.length; j++) {
            distance[map.get(original[j])][map.get(changed[j])] = cost[j];
            distance[j][j] = 0;
        }


        for (int via = 0; via < original.length; via++) {
            for (i = 0; i < original.length; i++) {
                for (int j = 0; j < original.length; j++) {
                    if (distance[i][via] != Integer.MAX_VALUE && distance[via][j] != Integer.MAX_VALUE) {
                        distance[i][j] = Math.min(distance[i][j], distance[i][via] + distance[via][j]);
                    }
                }
            }

        }
        long sum = 0;
        for (int k = 0; k < source.length(); k++) {
            if (distance[map.get(source.charAt(k))][map.get(target.charAt(k))] == Integer.MAX_VALUE) {
                return -1;
            }
            sum = sum + distance[map.get(source.charAt(k))][map.get(target.charAt(k))];

        }
        return sum;
    }
}
