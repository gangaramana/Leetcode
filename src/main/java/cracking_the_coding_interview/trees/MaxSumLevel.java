package cracking_the_coding_interview.trees;

import java.util.HashMap;
import java.util.Map;

public class MaxSumLevel {

    static private Map<Integer, Integer> integerMap = new HashMap<>();

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(10);

        new MaxSumLevel().maxSumLeve(tree);
        System.out.println(integerMap);
    }

    public void maxSumLeve(Tree tree) {
        maxSumLeve(tree, 0);

    }

    private void maxSumLeve(Tree tree, int height) {
        if (tree == null) {
            return;
        }
        integerMap.put(height, integerMap.getOrDefault(height, 0) + tree.data);
        maxSumLeve(tree.left, height + 1);
        maxSumLeve(tree.right, height + 1);
    }
}
