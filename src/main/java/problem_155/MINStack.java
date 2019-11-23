package problem_155;

import java.util.Stack;

public class MINStack {
    Stack<Integer> stack;
    Stack<Integer> minStack;
    int min;

    public static void main(String[] args) {
        MINStack nn = new MINStack();
        nn.push(5);
        nn.push(7);
        nn.push(8);
        nn.push(2);
        nn.pop();
        nn.push(1);
        nn.pop();
        nn.push(1);
        nn.push(-3);
        nn.pop();
        nn.pop();
        System.out.println(nn.stack.size());
        System.out.println(nn.minStack.size());
        System.out.println(nn.getMin());


    }

    /**
     * initialize your data structure here.
     */
    public MINStack() {
        stack = new Stack<Integer>();
        minStack = new Stack<Integer>();
        min = Integer.MIN_VALUE;

    }

    public void push(int x) {
        stack.push(x);
        if (min == Integer.MIN_VALUE) {
            min = x;

        } else {
            if (min > x) {
                min = x;
            }
        }
        minStack.push(min);

    }

    public void pop() {
        stack.pop();
        minStack.pop();
        if (minStack.size()>0){
            min=minStack.peek();
        }
        else {
            min=Integer.MIN_VALUE;
        }


    }

    public int top() {
        return stack.peek();

    }

    public int getMin() {
        return minStack.peek();


    }

}
