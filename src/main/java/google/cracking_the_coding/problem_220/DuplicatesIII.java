package google.cracking_the_coding.problem_220;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class DuplicatesIII {
    public static void main(String[] args) {
DuplicatesIII duplicatesIII=new DuplicatesIII();
duplicatesIII.containsNearbyAlmostDuplicate(new int[]{0,5,0},2,4);
    }
    public boolean containsNearbyAlmostDuplicate(int[] nums, int indexDiff, int valueDiff) {

        TreeMap<Integer, List<Integer>> map=new TreeMap();
        int i=0,j=0;
        while(j<nums.length){

            if(j-i==indexDiff){
                if(map.get(nums[i]).size()>1){
                    map.get(nums[i]).remove(0);
                }
                else{
                    map.remove(nums[i]);
                }
                i++;
            }

            map.put(nums[j],map.getOrDefault(nums[j],new ArrayList<Integer>()));
            map.get(nums[j]).add(j);
            if(valueDiff==0 && map.get(nums[j]).size()>1){
                return true;

            }
            if(map.subMap(nums[j]-valueDiff,true,nums[j],false).size()>0){
                return true;}
            if(map.subMap(nums[j],false,nums[j]+valueDiff,true).size()>0){
                return true;
            }
            j++;
        }

        return false;
    }
}
