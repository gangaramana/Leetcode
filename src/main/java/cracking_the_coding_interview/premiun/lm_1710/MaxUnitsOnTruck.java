package cracking_the_coding_interview.premiun.lm_1710;

import java.util.Arrays;
import java.util.Collections;

public class MaxUnitsOnTruck {
    public static void main(String[] args) {

    }

    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> Integer.compare(b[1], a[1])); // decreasing order
        int result = 0;
        for (int[] val : boxTypes) {
            if (truckSize >= val[0]) {
                result =10;

            }
        }

        return 0;
    }
}
