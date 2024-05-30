package google.cracking_the_coding.problem_2444;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.PriorityQueue;
import java.util.Queue;

public class CountSubarrays {
    public static void main(String[] args) {
CountSubarrays subarrays=new CountSubarrays();
        System.out.println(subarrays.countSubarrays(new int[]{1,3,5,2,7,5},1,5));
    }

    public long countSubarrays(int[] nums, int minK, int maxK) {
        int k=-1,j=-1,culPritIndex=-1;long res=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==minK){
                k=i;
            }
            if(nums[i]==maxK){
                j=i;
            }
            if(nums[i]<minK || nums[i]>maxK){
                culPritIndex=i;
            }

            int val=Math.min(k,j)-culPritIndex;
            res= res+ (val>0?val:0);
        }
        return res;
    }}
