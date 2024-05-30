package problem_46;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutations {
    public static void main(String[] args) {
Permutations permutations=new Permutations();
        System.out.println(permutations.permute(new int[]{1,2}));
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> result=new ArrayList<>();
        permute(new ArrayList<Integer>(),nums,result,nums.length);
       return result;
    }
   private void permute(List<Integer> permuteList,int[] nums,List<List<Integer>> result,int limit){

        if (permuteList.size()==limit){
            List<Integer> list=new ArrayList<>(permuteList);
            result.add(list);
            return;
        }
        for (int i=0;i<nums.length;i++){
            permuteList.add(nums[i]);
            int[] array1 = Arrays.copyOfRange(nums, 0, i);
            int[] array2 = Arrays.copyOfRange(nums,i+1,nums.length);
            int[] res=new int[array1.length+array2.length];
            int len1 = array1.length;
            int len2 = array2.length;
            System.arraycopy(array1, 0, res, 0, len1);
            System.arraycopy(array2, 0, res, len1, len2);
            permute(permuteList,res,result,limit);
            permuteList.remove(permuteList.size()-1);

        }
   }
}
