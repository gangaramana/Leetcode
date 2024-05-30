package cracking_the_coding_interview.heaps;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;
class some{
    public static void main(String[] args) {
        System.out.println("this is great");
    }
}

public class MedianInStream {
    public static void main(String[] args) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        minHeap.add(1);
        minHeap.add(2);
        minHeap.add(3);
        maxHeap.add(1);
        maxHeap.add(2);
        maxHeap.add(3);
        System.out.println(minHeap.peek());
        System.out.println(maxHeap.peek());
        some.main(new String[]{"1"});

    }

//    public int median(PriorityQueue<Integer> minHeap, PriorityQueue<Integer> maxheap, int number) {
//        if (maxheap.size() == 0 || minHeap.size() == 0) {
//            maxheap.add(number);
//            return number;
//        }
//        if (Math.abs(maxheap.size() -minHeap.size()) )
//
//        return maxheap.peek();
//    }
}
