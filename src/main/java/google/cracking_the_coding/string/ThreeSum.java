package google.cracking_the_coding.string;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Threesome {
    public static void main(String[] args){
        Threesome threesome=new Threesome();
       List<List<Integer>> res= threesome.getValues(new int[]{0,0,0});
        System.out.println(res);
    }

    public List<List<Integer>> getValues(int[] nums) {

        List<List<Integer>> result = new ArrayList<>();

        Arrays.sort(nums); //nlogn
        for (int i = 0; i < nums.length - 2; i++) {
            if (i!=0 && nums[i] == nums[i - 1]) {
                continue;

            }
            int j = i + 1, k = nums.length - 1;
            int sum = nums[i] * -1;
            while (j < k) {

                if (nums[j] + nums[k] == sum) {
                    List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    result.add(list);
                    j++;

                }
                else if(nums[j]+nums[k]>sum){
                    k--;
                }
                else{
                    j++;}

            }
            if (nums[j] == nums[j + 1]) {
                j++;
                continue;
            }
            if (nums[k] == nums[k - 1]) {
                k--;
                continue;
            }

        }
        return result;
    }
}
