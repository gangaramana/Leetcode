package problem_1356;

import javafx.util.Pair;

import java.util.Comparator;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Pair<Integer, Integer>> {

    @Override
    public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
        if (o1.getValue() == o2.getValue()) {
            return Integer.compare(o1.getKey(), o2.getKey());
        }
        return Integer.compare(o1.getValue(), o2.getValue());
    }
}

public class SortIntegersBy1Bits {
    public static void main(String[] args) {
        SortIntegersBy1Bits sortIntegersBy1Bits=new SortIntegersBy1Bits();
        int[] res=sortIntegersBy1Bits.sortByBits(new int[]{0,1,2,3,4,5,6,7,8});
        for (int i: res){
            System.out.print(i+" ");
        }
    }

    public int[] sortByBits(int[] arr) {
        PriorityQueue<Pair<Integer, Integer>> pairPriorityQueue = new PriorityQueue<>(new MyComparator());
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i];
            int k = 0, ones = 0;

            while ( k < 32) {
                if ((a & (1 << k)) != 0) {
                    ones++;
                }
                k++;
            }
            pairPriorityQueue.add(new Pair<>(arr[i], ones));
        }
        int i = 0;
        while (!pairPriorityQueue.isEmpty()) {
            arr[i] = pairPriorityQueue.poll().getKey();
            i++;
        }
        return arr;
    }
}
