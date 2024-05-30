package google.cracking_the_coding.problem_39;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Stack;

public class CombSum {
    public static void main(String[] args) {
        CombSum combSum=new CombSum();
        System.out.println(combSum.combinationSum(new int[]{2,3,6,7},7));
    }

    List<List<Integer>> list;

    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        list = new ArrayList();
        helper(candidates, target, new Stack(), 0,0);
        Arrays.sort(candidates);
        return list;
    }


    private void helper(int[] c, int target, Stack<Integer> s, int sum,int index) {
        for (int i = index; i < c.length; i++) {
            if (sum + c[i] == target) {
                s.push(c[i]);
                list.add(new ArrayList<>(s));
                s.pop();
            } else if (sum + c[i] < target) {
                s.push(c[i]);
                helper(c, target, s, sum + c[i],i);
                s.pop();
            }

        }

    }
}

