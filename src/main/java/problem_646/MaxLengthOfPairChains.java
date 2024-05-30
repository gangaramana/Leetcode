package problem_646;

import java.util.Arrays;
import java.util.Comparator;

public class MaxLengthOfPairChains {
    public static void main(String[] args) {
//        System.out.println(new MaxLengthOfPairChains().findLongestChain(new int[][]{{3, 4}, {2, 3}, {1, 2}}));
        System.out.println(new MaxLengthOfPairChains().findLongestChain(new int[][]{{1, 2}, {3, 4}, {2, 3}}));

    }

    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[0]));
        int memo[][] = new int[pairs.length + 1][pairs.length + 1];
        for (int[] k : memo) {
            Arrays.fill(k, -1);
        }
        int solution = findLongestChain(pairs, 0, -1, memo);

        return solution;

    }

    public int findLongestChain(int[][] pairs, int start, int previous, int[][] memo) {
        if (start >= pairs.length) {
            return 0;
        }

        int skip = findLongestChain(pairs, start + 1, previous, memo);
        int take = 0;
        if (previous != -1 && memo[start][previous] != -1) {
            return memo[start][previous];
        }
        if (start == 0 || previous == -1 || pairs[previous][1] < pairs[start][0]) {
            take = findLongestChain(pairs, start + 1, start, memo) + 1;
        }
        if (previous != -1) {
            memo[start][previous] = Math.max(skip, take);
            return memo[start][previous];
        }
        return Math.max(skip, take);

    }

    //DPPPP
    public int findLongestChainDP(int[][] pairs) {
        int solution = 0;
        Arrays.sort(pairs, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return Integer.compare(o1[0], o2[0]);
            }
        });
        Arrays.sort(pairs, (a, b) -> Integer.compare(a[1], b[0]));
        int memo[] = new int[pairs.length + 1];
            Arrays.fill(memo, 1);

        for (int i = 0; i < pairs.length; i++) {
            for (int j = 0; j < i; j++) {
               if (pairs[j][1]<pairs[i][0]){
                   memo[i]= Math.max(memo[i],memo[j]+1);
               }


            }
            solution=Math.max(memo[i],solution);
        }


        return solution;
    }

}
