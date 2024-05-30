package cracking_the_coding_interview.trees;

public class MirrorTree27 {
    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(10);
        MirrorTree27 mirrorTree27=new MirrorTree27();
        mirrorTree27.print(tree);
        mirrorTree27.mirrorTree(tree);
        System.out.println();
        mirrorTree27.print(tree);

    }

    public void mirrorTree(Tree tree) {
        if (tree == null) {
            return;
        }
        Tree temp = tree.left;
        tree.left = tree.right;
        tree.right = temp;
        mirrorTree(tree.left);
        mirrorTree(tree.right);

    }

    public void print(Tree tree){
        if (tree== null){
            return;
        }
        System.out.print(tree.data+" ");

        print(tree.left);
        print(tree.right);

    }
}
