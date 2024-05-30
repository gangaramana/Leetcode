package google.cracking_the_coding.problem_475;

import java.util.Arrays;

public class Heaters {
    public static void main(String[] args) {
        Heaters heaters=new Heaters();
        System.out.println(heaters.findRadius(new int[]{1,2,3,4},new int[]{1,4}));

    }
    public int findRadius(int[] houses, int[] heaters) {

        int L = 0;
        int R = houses[houses.length-1];
                while (L < R) {
            int pivot = L + (R - L) / 2;
            if (condition(houses, heaters, pivot)) {
                R = pivot;
            } else {
                L = pivot + 1;
            }

        }
        return L;
    }


    public boolean condition(int[] houses, int[] heaters, int radius) {
        int count = houses.length;
        boolean[] b = new boolean[count];
        Arrays.fill(b, false);
        for (int h : heaters) {
            for (int i = 0; i < houses.length; i++) {
                if (houses[i] <= radius + h && houses[i] >= h - radius) {
                    if (!b[i]) {
                        b[i] = true;
                        count--;
                    }
                } else {
                    continue;
                }
            }
        }
        if (count == 0) {
            return true;
        }
        return false;
    }
}
