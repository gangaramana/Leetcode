package leetcode_2610;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;

public class Array2D {
    public static void main(String[] args) {
Array2D array2D=new Array2D();
        System.out.println(array2D.findMatrix(new int []{1,3,4,1,2,3,1}));
    }
    public List<List<Integer>> findMatrix(int[] nums) {

        PriorityQueue<Integer> priorityQueue=new PriorityQueue<>();
        for (int i:nums){
            priorityQueue.add(i);
        }
int prev=0,i=0;

        List<List<Integer>> list=new ArrayList<>();
        while (!priorityQueue.isEmpty()){
            int current=priorityQueue.poll();
           if (prev==current){
              i++;

              insert(list,i, current);
           }
           else {
               i=0;
               insert(list,i,current);
           }
           prev=current;
        }
        return list;
    }

    private void insert(List<List<Integer>> res,int i,int value){
        if (i==res.size()){
            res.add(new ArrayList<>());
        }
        res.get(i).add(value);
    }
}
