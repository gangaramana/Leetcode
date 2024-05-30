package cracking_the_coding_interview.trees;

import java.util.List;

public class HeightDepthTree {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(2);
        tree.right = new Tree(3);
        tree.left.left = new Tree(4);
        tree.left.right = new Tree(5);
        tree.right.left = new Tree(6);
        tree.right.right = new Tree(7);
        tree.right.right.right = new Tree(8);
        tree.right.right.right.right = new Tree(8);
        tree.right.right.right.left = new Tree(8);

        tree.right.right.right.right.right = new Tree(8);

        System.out.println(new HeightDepthTree().heightDepth(tree));
        System.out.println(new HeightDepthTree().minDepth(tree));
    }


    private int heightDepth(Tree tree) {
        if (tree == null) {
            return 0;
        }
        int leftHeight = heightDepth(tree.left);
        int rightHeight = heightDepth(tree.right);
        return leftHeight > rightHeight ? leftHeight + 1 : rightHeight + 1;
    }


    private int minDepth(Tree tree) {
        if (tree == null) {
            return 0;
        }
        int leftHeight = heightDepth(tree.left);
        int rightHeight = heightDepth(tree.right);
        return leftHeight > rightHeight ? rightHeight + 1 : leftHeight + 1;
    }
}
