package problem_216;

import java.util.ArrayList;
import java.util.List;

public class CombinationSumIII {
    public static void main(String[] args) {
CombinationSumIII combinationSumIII=new CombinationSumIII();
        System.out.println(combinationSumIII.combinationSum3(2,7));
    }

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> result=new ArrayList<>();
        List<Integer> list=new ArrayList<>();
        combinationSum3(1,0,list,n,result,k);
return result;
    }
    private void combinationSum3(int start,int currentSum,List<Integer> currentList, int target,List<List<Integer>> resultList,int limit){
        if (currentList.size()==limit && currentSum == target){
            List<Integer> res=new ArrayList<>(currentList);
            resultList.add(res);
            return;
        }
        if(start>9 || currentList.size()==limit ||currentSum>target ){
            return;
        }

            currentSum+=start;
            if (currentSum> target){
                return;
            }
            currentList.add(start);
            combinationSum3(start+1,currentSum,currentList,target,resultList,limit);
           currentList.remove(currentList.size()-1);
            currentSum-=start;
            combinationSum3(start+1,currentSum,currentList,target,resultList,limit);
        }

    }

