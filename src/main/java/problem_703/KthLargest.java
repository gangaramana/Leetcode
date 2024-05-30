package problem_703;

import java.util.PriorityQueue;

public class KthLargest {
    public static void main(String[] args) {
KthLargest kthLargest=new KthLargest(3,new int[]{4,5,8,2,7,8,9});
        System.out.println(kthLargest.add(3));
    }
    PriorityQueue<Integer> integers;
    int k;

    public KthLargest(int k, int[] nums) {
        this.k=k;
        integers=new PriorityQueue<>(k+1);
        for (int i:nums){
            integers.add(i);
        }

    }

    public int add(int val) {
        integers.add(val);
        while (integers.size()!=k){
            integers.poll();
        }
        return integers.peek();

    }
}
