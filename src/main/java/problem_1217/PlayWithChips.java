package problem_1217;

public class PlayWithChips {
    public static void main(String[] args) {
        PlayWithChips playWithChips = new PlayWithChips();
        int p=playWithChips.minCostToMoveChips(new int[]{2,2,3,3, 2});
        System.out.println(p);
    }

    public int minCostToMoveChips(int[] chips) {
        int sum = Integer.MAX_VALUE;
        for (int i = 0; i < chips.length; i++) {
            int tempsum = 0;
            for (int k = 0; k < chips.length; k++) {
                if (k == i) {
                    continue;
                }
                tempsum = tempsum + Math.abs(chips[i] - chips[k]) % 2;

            }
            if (tempsum < sum) {
                sum = tempsum;
            }
        }
        return sum;
    }



    //this is simplest another solution
//    public int minCostToMoveChips(int[] chips) {
//        int odd = 0, even = 0;
//        for (int val : chips) {
//            if (val % 2 == 0)
//                ++even;
//            else
//                ++odd;
//        }
//        return Math.min(odd, even);
//    }
}
