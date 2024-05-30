package contest_1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class JobSchedule {
    public static void main(String[] args) {
JobSchedule jobSchedule=new JobSchedule();
int res=jobSchedule.minDifficulty(new int[]{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},10);
        System.out.println(res);
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length<d){
            return -1;
        }
        int[][] memo=new int[300][300];
        for (int i=0;i<memo.length;i++){
            Arrays.fill(memo[i],-1);
        }
      return   minDifficulty(jobDifficulty, 0, d, 0,memo);

    }

    public int minDifficulty(int[] jobDifficulty, int j, int d, int sum,int[][] memo) {
        if (memo[j][d]!=-1){
            return memo[j][d];
        }
        int max = Integer.MIN_VALUE;
        int res = Integer.MAX_VALUE;

        if (d == 1) {
            for (int i = j; i < jobDifficulty.length; i++) {
                if (max < jobDifficulty[i]) {
                    max = jobDifficulty[i];
                }
            }
            memo[j][d]=sum + max;
            return memo[j][d];


        }
        for (int i = j; i <= jobDifficulty.length - d; i++) {
            max = Math.max(max, jobDifficulty[i]);
            res = Math.min(res, max + minDifficulty(jobDifficulty, i + 1, d - 1, sum,memo));
            memo[j][d]=res;
        }
        return memo[j][d];


    }

}
