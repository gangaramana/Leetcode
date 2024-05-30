package problem_1335;

import java.util.PriorityQueue;

public class MinimumDifficulty {
    public static void main(String[] args) {
MinimumDifficulty minimumDifficulty=new MinimumDifficulty();
int res=minimumDifficulty.minDifficulty(new int[]{7,1,7,1,7,1},3);
        System.out.println(res);
    }

    public int minDifficulty(int[] jobDifficulty, int d) {
        if (jobDifficulty.length<d){
            return -1;
        }
        int res=0;
        PriorityQueue<Integer> integers=new PriorityQueue<>();
        for (int i=0;i<jobDifficulty.length;i++){
            integers.add(jobDifficulty[i]);
        }
        while (d!=1){
            res=res+integers.poll();
            d--;
        }
        while (integers.size()!=1){
            integers.poll();
        }
        return res+integers.poll();

    }
}
