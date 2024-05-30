package cracking_the_coding_interview.stacks;

import java.util.Stack;

public class SortOfStacks {
    public static void main(String[] args) {
        StackMin minStack = new StackMin();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);
        minStack.push(5);
        minStack.push(6);
        minStack.push(3);
        minStack.printStack(minStack.getStack());
    }


}

class StackMin {
    private Stack<Integer> stack;
    private Stack<Integer> tempStack;

    public StackMin() {
        tempStack = new Stack<>();
        stack = new Stack<>();
    }

    public Stack<Integer> getStack() {
        return stack;
    }

    public boolean push(int number) {
        if (stack.isEmpty() || stack.peek() >= number) {
            stack.push(number);
            return true;
        } else {
            do {
                tempStack.push(stack.pop());
            } while (!stack.isEmpty() && stack.peek() <= number);
            stack.push(number);
            copyStack(tempStack, stack);
        }
        return true;
    }

    public Integer pop() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        throw new NullPointerException("Stack is Empty");

    }


    private void copyStack(Stack<Integer> copyFrom, Stack<Integer> copyTo) {
        while (!copyFrom.isEmpty()) {
            copyTo.push(copyFrom.pop());
        }
    }

    public void printStack(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
