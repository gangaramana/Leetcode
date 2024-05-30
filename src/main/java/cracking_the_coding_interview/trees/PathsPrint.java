package cracking_the_coding_interview.trees;

import java.util.ArrayList;
import java.util.List;

public class PathsPrint {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(10);
        new PathsPrint().paths(tree, new ArrayList<Integer>());
    }

    public void paths(Tree tree, List<Integer> list) {
        if (tree == null) {
            return;
        }
        list.add(tree.data);
        paths(tree.left, list);
        paths(tree.right, list);
        if (tree.left == null && tree.right == null) {
            System.out.println(list);
        }
        list.remove(list.size() - 1);
    }
}
