package google.cracking_the_coding.problem_40;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class CombinationSumII {



        List<List<Integer>> res;
        public List<List<Integer>> combinationSum2(int[] candidates, int target) {
            Arrays.sort(candidates);
            res=new ArrayList();
            helper(candidates,target,new Stack(),0,0);
            return res;
        }

        void helper(int[] candidates,int target,Stack<Integer> stack,int index,int sum){

            for(int i=index;i<candidates.length;i++){
                if(sum+candidates[index] == target){
                    stack.push(candidates[index]);
                    res.add(new ArrayList(stack));
                    stack.pop();
                    return;
                }
                else if (sum+candidates[i] <target){
                    stack.push(candidates[i]);
                    helper(candidates,target,stack,i+1,sum+candidates[i]);
                    stack.pop();
                    while(i+1<candidates.length && candidates[i]==candidates[i+1]){
                        i++;
                    }
                    helper(candidates,target,stack,i+1,sum);
                }
            }
        }

    public static void main(String[] args) {
            CombinationSumII combinationSumII=new CombinationSumII();
        System.out.println(combinationSumII.combinationSum2(new int[]{6,2,1},8));

    }
    }
