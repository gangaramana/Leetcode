package cracking_the_coding_interview.trees;

public class BinaryTreeSearching {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        System.out.println(new BinaryTreeSearching().isPresent(100, tree));
    }

    public boolean isPresent(int number, Tree tree) {
        if (tree != null) {
            if (tree.data == number) {
                return true;
            } else {
                return isPresent(number, tree.left) || isPresent(number, tree.right);
            }

        }
        return false;
    }
}
