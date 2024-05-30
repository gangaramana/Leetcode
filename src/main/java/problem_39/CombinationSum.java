package problem_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class CombinationSum {
    public static void main(String[] args) {
        CombinationSum combinationSum = new CombinationSum();
        System.out.println(combinationSum.combinationSum(new int[]{2, 3,  7}, 18));
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<Integer> choosen = new HashSet<>();
        List<List<Integer>> result = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        for (int i : candidates) {
            set.add(i);
        }
        for (int i : candidates) {
            int multiple = target / i;
            while (multiple > 0) {
                int rem = target - i * multiple;
                if (set.contains(rem)) {
//                    if (multiple > 1) {
                        result.add(generateArray(multiple, i, rem));
//                    }
//                    if (multiple ==1 ){
//                        if (!choosen.contains(rem)){
//                            result.add(generateArray(multiple, i, rem));
//                            choosen.add(i);
//                            choosen.add(rem);
//                        }
//                    }
                }
                multiple--;
            }
        }
        if (set.contains(target)) {
            result.add(generateArray(0, 0, target));
        }
        return result;
    }

    private List<Integer> generateArray(int multiple, int number1, int number2) {
        List<Integer> res = new ArrayList<>();
        while (multiple > 0) {
            res.add(number1);
            multiple--;
        }
        res.add(number2);
        return res;
    }
}
