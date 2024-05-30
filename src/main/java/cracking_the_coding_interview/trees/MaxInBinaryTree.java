package cracking_the_coding_interview.trees;

public class MaxInBinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        System.out.println(maxBinaryTree(tree));

    }

    public static int maxBinaryTree(Tree tree) {
        int max = Integer.MIN_VALUE;
        if (tree != null) {
            int leftMax = maxBinaryTree(tree.left);
            int rightMax = maxBinaryTree(tree.right);
            max = leftMax > rightMax ? leftMax : rightMax;
            max = max > tree.data ? max : tree.data;
            return max;
        }
        return max;

    }
}
