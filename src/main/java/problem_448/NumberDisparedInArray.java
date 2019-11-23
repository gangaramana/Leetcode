package problem_448;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class NumberDisparedInArray {
    public static void main(String[] args) {
        NumberDisparedInArray numberDisparedInArray = new NumberDisparedInArray();

        System.out.println(numberDisparedInArray.findDisappearedNumbers(new int[]{7, 3, 2, 7, 8, 2, 3, 1}));

    }

    public List<Integer> findDisappearedNumbers(int[] nums) {
        int len = nums.length;
        ArrayList<Integer> x = new ArrayList<Integer>();
        for (int i = 1; i <= len; i++) {
            x.add(i);
        }

        for (Integer y : nums) {
            boolean b = x.remove(y);
        }


        return x;

    }
}
