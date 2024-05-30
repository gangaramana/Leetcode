package google.cracking_the_coding.problem_2963;

import java.util.HashMap;
import java.util.Map;

public class CountPartitions {
    public static void main(String[] args) {
        CountPartitions countPartitions=new CountPartitions();
       int result= countPartitions.numberOfGoodPartitions(new int[]{13,17,76,63,98,99,88,49,17,87,21,76,5,95,23,27,71,34,61,30,51,44,84,74,81,42,16,32,26,55,16,66,7,98,55,77,83,85,80,24,40,88,5,7,4,52,64,22,21,38,28,1,5,20,42,84,5,95,14,18,75,53,57,59,34,75,10,82,65,55,20,28,9,21,28,80,7,50,52,48,86,77,80,65,48,64,9,59,41,38,69,81,63,71,51,64,26,94,77,82});
        System.out.println(result);
    }

        public int numberOfGoodPartitions(int[] nums) {
            int j=nums.length-1,sum=0,res=1;
            Map<Integer,Integer> map=new HashMap();
            for(int i=0;i<nums.length;i++){
                if(!map.containsKey(nums[i])){
                    map.put(nums[i],i);
                }
            }

            while(j>=0){
                if(j!=map.get(nums[j])){
                    int minJ=map.get(nums[j]),tempJ=map.get(nums[j]);
                    while(j>=minJ){
                        minJ=Math.min(minJ,map.get(nums[j]));
                        j--;

                    }
                    j=minJ;
                }
                j--;
                sum++;
            }
            for(int k=1;k<sum;k++){
                res=(res *2)%(int)(Math.pow(10,9)+7);
            }

            return res;
        }

    }
