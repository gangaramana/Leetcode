package cracking_the_coding_interview.premiun.lm_543;

class Tree {
    int data;
    Tree left;
    Tree right;

    public Tree(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class DiameterOfTree {
    public static void main(String[] args) {
       Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.left.right = new Tree(20);
        tree.left.left = new Tree(290);
        System.out.println(new DiameterOfTree().diameterOfBinaryTree(tree));
    }

    private int diameter;

    public int diameterOfBinaryTree(Tree root) {
        diameter = 0;
        longestPath(root);
        return diameter;
    }

    private int longestPath(Tree node) {
        if (node == null) return 0;
        // recursively find the longest path in
        // both left child and right child
        int leftPath = longestPath(node.left);
        int rightPath = longestPath(node.right);

        // update the diameter if left_path plus right_path is larger
        diameter = Math.max(diameter, leftPath + rightPath);

        // return the longest one between left_path and right_path;
        // remember to add 1 for the path connecting the node and its parent
        return Math.max(leftPath, rightPath) + 1;
    }
}
