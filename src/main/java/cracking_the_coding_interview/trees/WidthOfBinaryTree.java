package cracking_the_coding_interview.trees;

import java.util.HashMap;
import java.util.Map;

public class WidthOfBinaryTree {
    private static Map<Integer, Integer> map = new HashMap<>();

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.right = new Tree(1234);
        tree.right.right.left = new Tree(1234);
        tree.right.right.left.right = new Tree(1234);

        System.out.println(new WidthOfBinaryTree().height(tree));
        new WidthOfBinaryTree().diameter(tree);
        System.out.println(map);
    }

    public void diameter(Tree tree) {
        diameter(tree, 0);
    }

    private void diameter(Tree tree, int level) {
        if (tree == null) {
            return;
        }
        map.put(level, map.getOrDefault(level, 0) + 1);
        diameter(tree.left, level + 1);
        diameter(tree.right, level + 1);
    }

    public int height(Tree tree) {
        if (tree == null) {
            return 0;
        }
        int left = height(tree.left);
        int right = height(tree.right);
        return right > left ? right + 1 : left + 1;

    }

}
