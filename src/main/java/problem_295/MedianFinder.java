package problem_295;

import java.util.Collections;
import java.util.PriorityQueue;

public class MedianFinder {
    public static void main(String[] args) {
        MedianFinder medianFinder = new MedianFinder();
        for (int i=0;i<10;i++){
            medianFinder.addNum(i);
            System.out.println(medianFinder.findMedian());

        }


    }

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public MedianFinder() {
        minHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap = new PriorityQueue<>();
    }

    public void addNum(int num) {
        if (maxHeap.size() == 0 || maxHeap.peek() < num) {
            maxHeap.add(num);
        } else {
            minHeap.add(num);
        }
        if (Math.abs(minHeap.size() - maxHeap.size()) == 2) {
            //perform fixing
            if (minHeap.size() > maxHeap.size()) {
                maxHeap.add(minHeap.remove());
            }
            else {
                minHeap.add(maxHeap.remove());
            }
        }

    }

    public double findMedian() {
        if (minHeap.size()==maxHeap.size()){
            return ((double)minHeap.peek()+maxHeap.peek())/2;
        }
        else if (maxHeap.size()> minHeap.size()){
            return maxHeap.peek();
        }
        return minHeap.peek();

    }
}
