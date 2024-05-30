package google.cracking_the_coding.problme_853;

import javafx.util.Pair;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;



class MyComparator implements Comparator<Pair<Integer,Integer>> {

    // Overriding compare()method of Comparator
    // for descending order of cgpa
    public int compare(Pair<Integer,Integer> s1, Pair<Integer,Integer> s2) {
       return Integer.compare(s1.getKey(),s2.getKey());
    }
}
public class CarProblme {
    public static void main(String[] args) {
        CarProblme carProblme=new CarProblme();
       int res= carProblme.carFleet(10,new int[]{0,4,2},new int[]{2,1,3});
        System.out.println(res);
    }


    public int carFleet(int target, int[] position, int[] speed) {
        List<Pair<Integer,Integer>> list= new ArrayList();
        for(int i=0;i<position.length;i++){
            list.add(new Pair(position[i],speed[i]));
        }
        list.sort(new MyComparator());


        Stack<Float> stack=new Stack();
        Pair<Integer,Integer> p=list.remove(list.size()-1);
        stack.add((float)(target-p.getKey())/p.getValue());

        while(!list.isEmpty()){
            p=list.remove(list.size()-1);
            float s=(float)(target-p.getKey())/p.getValue() ;
            if(s >stack.peek()){
                stack.add(s);

            }


        }
        return stack.size();
    }
}
