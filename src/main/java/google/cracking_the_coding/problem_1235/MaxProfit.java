package google.cracking_the_coding.problem_1235;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxProfit {
    public static void main(String[] args) {
        MaxProfit maxProfit=new MaxProfit();
        System.out.println(maxProfit.jobScheduling(new int[]{2,1,3,3},new int[]{3,4,5,6},new int[]{50,10,40,70}));
    }
        public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
           int[][] arr=new int[profit.length][3];
            for (int i=0;i<profit.length;i++){
                arr[i][0]=startTime[i];
                arr[i][1]= endTime[i];
                arr[i][2]=profit[i];

            }
//            Arrays.sort(arr,(a,b)->a[0]-b[0]);
            return helper(arr,1,0);

        }
        public int helper(int[][] arr,int start,int i){
            int include=0,exclude;
            if(i>=arr.length){
                return 0;
            }
                if(arr[i][0]>=start){
                    include= arr[i][2]+helper(arr,arr[i][1],i+1);
                }
                exclude= helper(arr,start,i+1);

            return Math.max(include,exclude);

        }
    }

