package cracking_the_coding_interview.trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class ReverseOrder {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.left = new Tree(6);
        tree.right.right = new Tree(7);
        tree.right.right.right = new Tree(8);
        List<Integer> integers = printReverseOrder(tree);
        for (int i : integers) {
//            System.out.println(i);
        }
    }

    public static List<Integer> printReverseOrder(Tree tree) {
        List<Integer> integers = new ArrayList<>();
        Queue<Tree> queue;
        if (tree == null) {
            return integers;
        } else {
            queue = new LinkedList<>();
            queue.add(tree);
                while (!queue.isEmpty()) {
                    Tree tree1 = queue.remove();
//                    System.out.println(tree1.data);
                    integers.add(tree1.data);
                    if (tree1.right != null) {
                        queue.offer(tree1.right);
                    }
                    if (tree1.left != null) {
                        queue.offer(tree1.left);
                    }
                    System.out.println(tree1.data);
                }

            }

        return integers;

    }
}
