package problem_2244;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class MinRoundsTocomplete {
    public static void main(String[] args) {
MinRoundsTocomplete minRoundsTocomplete=new MinRoundsTocomplete();
int res=minRoundsTocomplete.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4});
//        System.out.println(res);
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("3");
        linkedList.add("3");
        linkedList.add("3");
        linkedList.add("3");

        System.out.println(linkedList.element());

        linkedList.remove("3");
        System.out.println(linkedList.element());
    }
    public int minimumRounds(int[] tasks) {
        int result=0;
        Map<Integer,Integer> map=new HashMap<>();
        for (int task:tasks){
           map.put(task, map.getOrDefault(task,0)+1);
        }
        for (Map.Entry<Integer,Integer> entry:map.entrySet()){
            if (entry.getValue()==1){
                return -1;
            }
            int k=entry.getValue()%3;
            if (k==0){
                result=result+entry.getValue() /3;
            }
            else if (k==2){
                result=result+ (entry.getValue()/3)+1;
            }
            else {
                result = result+2+((entry.getValue()-4)/3);
            }

        }
        return result;
    }
}
