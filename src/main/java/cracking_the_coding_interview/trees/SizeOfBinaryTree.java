package cracking_the_coding_interview.trees;

public class SizeOfBinaryTree {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.right=new Tree(1234);
        System.out.println(sizeOfBinaryTree(tree));
    }

    public static int sizeOfBinaryTree(Tree tree) {
        if (tree != null) {
            return sizeOfBinaryTree(tree.left) + sizeOfBinaryTree(tree.right) + 1;
        }
        return 0;
    }
}
