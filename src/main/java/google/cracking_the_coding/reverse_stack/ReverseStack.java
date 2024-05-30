package google.cracking_the_coding.reverse_stack;

import java.util.Stack;

public class ReverseStack {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<>();
for(int I:new int[]{4,5,7}){
    stack.push(I);
}
        reverse(stack);
        System.out.println("----------------------");
        while(!stack.isEmpty()){
            System.out.print(stack.pop()+", ");
        }
    }

    static void reverse(Stack<Integer> s)
    {
        reverse(s,0,s.size());

    }
    static void reverse(Stack<Integer> s,int i,int size){
        if(i==size){
            return;
        }
        for(int j: s){
            s.push(j);
            break;
        }
        reverse(s,i+1,size);
        s.pop();
    }
}
