package cracking_the_coding_interview.trees;

import java.util.Stack;

public class SumInBinary25 {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.right=new Tree(1234);
        System.out.println(new SumInBinary25().sum(tree));
        System.out.println(new SumInBinary25().sumStack(tree));
    }

    public int sum(Tree tree) {
        if (tree == null) {
            return 0;
        }
        int left = sum(tree.left);
        int right = sum(tree.right);
        return left + right + tree.data;
    }

    public int sumStack(Tree tree) {
        int sum = 0;
        if (tree == null) {
            return sum;
        }
        Stack<Tree> stack = new Stack();
        stack.add(tree);
        while (!stack.isEmpty()) {
            Tree tree1 = stack.pop();
            if (tree1.left != null) {
                stack.add(tree1.left);
            }
            if (tree1.right != null) {
                stack.add(tree1.right);
            }
            sum = sum + tree1.data;

        }
        return sum;
    }
}
