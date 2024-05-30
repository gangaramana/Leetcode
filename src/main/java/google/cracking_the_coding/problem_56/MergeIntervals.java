package google.cracking_the_coding.problem_56;

import cracking_the_coding_interview.sorting.MergeSort;
import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class MergeIntervals {
    public static void main(String[] args) {
        MergeIntervals mergeIntervals=new MergeIntervals();
       int[][] res= mergeIntervals.merge(new int[][]{{1,4},{0,4}});
       for(int [] l:res){
           System.out.println(l[0]+"  "+l[1]);
       }
    }

    public int[][] merge(int[][] intervals) {
        PriorityQueue<Pair<Integer, Integer>> queue = new PriorityQueue(new Comparator<Pair<Integer, Integer>>() {
            @Override
            public int compare(Pair<Integer, Integer> o1, Pair<Integer, Integer> o2) {
                return Integer.compare(o1.getKey(), o2.getKey());
            }
        });

        for (int[] i : intervals) {
            queue.add(new Pair<>(i[0], i[1]));

        }
        List<Pair<Integer, Integer>> list = new ArrayList<>();
        while (!queue.isEmpty()) {

            Pair<Integer, Integer> p = queue.poll();

            while (queue.size() > 0 && queue.peek().getKey() <= p.getValue()) {
                if (p.getValue() >= queue.peek().getValue()) {
                    p = new Pair<>(p.getKey(), p.getValue());
                } else {
                    p = new Pair<>(p.getKey(), queue.peek().getValue());
                }
                queue.poll();

            }
            list.add(p);


        }
        int[][] res = new int[list.size()][2];
        for (int i = 0; i < list.size(); i++) {
            res[i] = new int[]{list.get(i).getKey(), list.get(i).getValue()};
        }
        return res;
    }
}
