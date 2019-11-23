package problem_728;

import java.util.ArrayList;
import java.util.List;

public class SelfDividingNumber {
    public static void main(String[] args) {
        SelfDividingNumber s = new SelfDividingNumber();
        System.out.println(s.selfDividingNumbers(100,200));

    }

    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> integerList = new ArrayList<Integer>();
        if (right <= 10) {
            int i = left;
            while (i <= right) {
                if (i % 10 == 0) {
                    i++;
                    continue;
                }
                integerList.add(i);
                i++;
            }

        } else {
            labl:
            for (int k = left; k <= right; k++) {
                if (k % 10 == 0) {
                    continue;
                } else {
                    int p = k;

                    while (p != 0) {
                        int rem = p % 10;
                        p = p / 10;
                        if (rem == 0 || k % rem != 0) {
                            continue labl;

                        }


                    }
                    integerList.add(k);

                }
            }
        }
        return integerList;

    }
}
