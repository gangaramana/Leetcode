package google.cracking_the_coding.problem_78;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Subsets {
    public static void main(String[] args) {
Subsets subsets=new Subsets();
        System.out.println(subsets.subsets(new int[]{1,2}));
    }
    List<List<Integer>> list;
    public List<List<Integer>> subsets(int[] nums) {
        list=new ArrayList();
        helper(nums,0,new Stack());
        return list;

    }

    private void helper(int[] nums, int i, Stack<Integer> s) {
        if (i < nums.length) {
            s.push(nums[i]);
            helper(nums, i + 1, s);
            s.pop();
            helper(nums, i + 1, s);
        } else {
            list.add(new ArrayList(s));
        }
    }
}
