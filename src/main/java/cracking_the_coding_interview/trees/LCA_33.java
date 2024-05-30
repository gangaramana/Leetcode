package cracking_the_coding_interview.trees;

public class LCA_33 {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(40);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(50);
        LCA_33 lca_33=new LCA_33();
        System.out.println(lca_33.lca(tree,40,50).data);
    }

    public Tree lca(Tree tree, int d1, int d2) {
        if (tree == null) {
            return null;
        }
        if (tree.data == d1 || tree.data == d2) {
            return tree;
        }
        Tree left = lca(tree.left, d1, d2);
        Tree right = lca(tree.right, d1, d2);
        if (left != null && right != null) {
            return tree;
        }
        return left != null ? left : right;

    }
}
