package problem_1253;

import java.util.ArrayList;
import java.util.List;

public class TwoDBinaryMatrix {
    public static void main(String[] args) {
        TwoDBinaryMatrix twoDBinaryMatrix = new TwoDBinaryMatrix();
        List<List<Integer>> listList=twoDBinaryMatrix.reconstructMatrix(9, 2, new int[]{0, 1, 2, 0, 0, 0, 0, 0, 2, 1, 2, 1, 2});
        System.out.println(listList);

    }

    public List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum) {
        int sum = 0, noOftwos = 0;
        for (int k : colsum) {
            if (k == 2) {
                noOftwos++;
            }
            sum = sum + k;
        }
        if (sum != upper + lower||noOftwos>lower||noOftwos>upper) {
            return new ArrayList<>();
        }

        List<Integer> listUpper = new ArrayList<>();
        List<Integer> listlower = new ArrayList<>();
        List<List<Integer>> lists = new ArrayList<>();
        lists.add(listUpper);
        lists.add(listlower);
        upper = upper - noOftwos;
        lower = lower - noOftwos;
        for (int k : colsum) {
            if (k == 2) {
                listUpper.add(1);
                listlower.add(1);
            } else if (k == 1) {
                if (upper > 0) {
                    listUpper.add(1);
                    listlower.add(0);
                    upper--;
                } else if (lower > 0) {
                    listlower.add(1);
                    listUpper.add(0);
                    lower--;
                } else {
                    return new ArrayList<>();
                }

            } else {
                listlower.add(0);
                listUpper.add(0);

            }

        }

        return lists;

    }
}
