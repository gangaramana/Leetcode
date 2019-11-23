package problem_997;

import java.util.HashMap;
import java.util.HashSet;

public class Judge {
    public static void main(String[] args) {
        int[][] a = new int[][]{{1, 3}, {2, 3},{3,1}};
//        System.out.println(a.length);

        Judge judge = new Judge();
        judge.findJudge(3, a);
    }

    public int findJudge(int N, int[][] trust) {
        int count = 0;
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int[] x : trust) {
            if (hashMap.containsKey(x[1])) {
                hashMap.put(x[1], hashMap.get(x[1]) + 1);
            } else {
                hashMap.put(x[1], 1);
            }
        }
        System.out.println(hashMap);
        System.out.println(hashMap.containsValue(N-2));

        return N;
    }
}

