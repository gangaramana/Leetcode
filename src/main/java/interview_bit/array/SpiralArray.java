package interview_bit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SpiralArray {
    public static void main(String[] args) {
        List<List<Integer>> l = new ArrayList<>();
        List<Integer> l2 = Arrays.asList(1,2,3,12);
        List<Integer> l3 = Arrays.asList(4,6,7,8);
        List<Integer> l4 = Arrays.asList(7,9,8,7);
        List<Integer> l5 = Arrays.asList(14, 15, 16, 17);
        l.add(l2);
        l.add(l3);
        l.add(l4);
        l.add(l5);
        SpiralArray spiralArray = new SpiralArray();
        spiralArray.spiralOrder(l);

    }


    public ArrayList<Integer> spiralOrder(List<List<Integer>> A) {
        ArrayList<Integer> result = new ArrayList<>();
        if (A.size() == 0) {
            return result;
        }
        int d = 0;
        int maxRow = A.get(0).size() - 1, maxColumn = A.size() - 1, minRow = 0, minColumn = 0;
        while (minRow <= maxRow && minColumn <= maxColumn) {
            if (d == 0) {
                for (int r = minRow; r <= maxRow; r++) {
                    result.add(A.get(minColumn).get(r));

                }
                minColumn = minColumn + 1;
                d = 1;
            }
            if (d == 1) {
                for (int c = minColumn; c <= maxColumn; c++) {
                    result.add(A.get(c).get(maxRow));

                }
                maxRow = maxRow - 1;
                d = 2;
            }
            if (d == 2) {
                for (int r = maxRow; r > minRow; r--) {
                    result.add(A.get(maxColumn).get(r));

                }
                maxColumn = maxColumn - 1;
                d = 3;
            }
            if (d == 3) {
                for (int c = maxColumn; c > minColumn; c--) {
                    result.add(A.get(c).get(minRow));
                }
                minRow = minRow + 1;
                d = 0;
            }

        }
        System.out.println(result);
        return result;
    }
}
