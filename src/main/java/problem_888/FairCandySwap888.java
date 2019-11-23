package problem_888;

import java.util.Arrays;
import java.util.stream.IntStream;


//[35,17,4,24,10]
//        [63,21]
public class FairCandySwap888 {
    public static void main(String[] args) {
//        int[] x = new int[]{1, 2, 3, 4, 5, 6};
//        boolean contains = IntStream.of(x).anyMatch(y -> y == 4);
//        System.out.println(contains);
        FairCandySwap888 fairCandySwap888 = new FairCandySwap888();
        int[] jj = fairCandySwap888.fairCandySwap(new int[]{35,17,4,24,10}, new int[]{63,21});
        for (int kk : jj) {
            System.out.println(kk);
        }

    }

    public int[] fairCandySwap(int[] A, int[] B) {
        int difference = sum(A) - sum(B);
//        System.out.println(sum(A)+"     "+sum(B));
//        System.out.println(difference);
        int[] v = retArray(A, B, difference);
        return v;
    }

    public int sum(int[] A) {
        int sum = 0;
        for (int x : A) {
            sum = sum + x;
        }
        return sum;
    }

    public int[] retArray(int[] a, int[] b, int difference) {
        if (difference > 0) {
            difference = difference - (difference/2);
        } else {
            difference = difference -  (difference/2);
        }
        for (int q : a) {
            for (int w : b) {
                if ((q - w) == difference) {
                    return new int[]{q, w};
                }
            }
        }
        return null;
    }
}
