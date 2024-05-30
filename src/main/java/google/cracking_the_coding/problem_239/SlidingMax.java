package google.cracking_the_coding.problem_239;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class SlidingMax {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
//        stack.remove()
        SlidingMax slidingMax=new SlidingMax();
        int result[]= slidingMax.maxSlidingWindow(new int[]{1,3,1,2,0,5},3);
        for (int i: result){
            System.out.println(i);
        }
    }

    public int[] maxSlidingWindow(int[] nums, int k) {

        int i = 0;
        int[] res = new int[nums.length - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();
        while ( i < nums.length) {

            while (!deque.isEmpty()) {
                if (nums[deque.getLast()] < nums[i]) {
                    deque.removeLast();

                } else {
                    deque.add(i);
                    break;
                }
            }
            if (deque.isEmpty()) {
                deque.add(i);
            }

            if (i - k+1 >= 0) {
                res[i - k+1] = nums[deque.getFirst()];
                while (!deque.isEmpty() && deque.getFirst() <= i - k + 1) {
                    deque.removeFirst();
                }
            }
            i++;
        }
        return res;
    }

}



