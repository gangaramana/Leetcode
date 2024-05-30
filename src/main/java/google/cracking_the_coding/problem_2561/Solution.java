package google.cracking_the_coding.problem_2561;

import javafx.util.Pair;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public static void main(String[] args) {
        Solution solution=new Solution();
        System.out.println( solution.minCost(new int[]{4,2,2,2},new int[]{1,4,1,2}));
    }
    public long minCost(int[] basket1, int[] basket2) {
        PriorityQueue<Pair<Long, Long>> posQueue = new PriorityQueue<Pair<Long, Long>>((pair1, pair2) -> (int)(pair1.getKey() - pair2.getKey()));
        PriorityQueue<Pair<Long,Long>> negQueue=new PriorityQueue<Pair<Long, Long>>((pair1, pair2) -> (int)(pair2.getKey() - pair1.getKey()));

        Map<Integer,Long> map=new HashMap();
        for(int i: basket1){
            map.put(i,map.getOrDefault(i,0L)+1);
        }
        for(int i: basket2){
            map.put(i,map.getOrDefault(i,0L)-1);
        }

        for(Map.Entry<Integer,Long> entry:map.entrySet()){
            if(entry.getValue()%2 !=0){
                return -1;
            }
            if(entry.getValue()==0){
                continue;
            }
            else if(entry.getValue()>0){
                posQueue.add(new Pair(entry.getKey(),entry.getValue()));
            }
            else{
                negQueue.add(new Pair(entry.getKey(),entry.getValue()));
            }

        }
        long pos=0,neg=0,sum=0;

        while(posQueue.size()>0 || negQueue.size()>0){
            if(posQueue.peek().getValue()>negQueue.peek().getValue()){
                pos=posQueue.peek().getValue()-negQueue.peek().getValue();
                Pair<Long,Long> pair= posQueue.remove();
                sum+=negQueue.peek().getValue()*(pair.getKey()>negQueue.poll().getKey()?negQueue.remove().getKey():pair.getKey());
                posQueue.add(new Pair(pair.getKey(),pos));
            }
            else  if(posQueue.peek().getValue()<negQueue.peek().getValue()){
                neg=negQueue.peek().getValue()-posQueue.peek().getValue();
                Pair<Long,Long> pair= negQueue.remove();
                sum+=posQueue.peek().getValue()*Math.min(pair.getKey(),posQueue.remove().getKey());
                negQueue.add(new Pair(pair.getKey(),neg));
            }
            else{
                Pair<Long,Long> pair= negQueue.remove();
                sum+=pair.getValue()*Math.min(pair.getKey(),posQueue.remove().getKey());
            }


        }
        return sum;

    }
}