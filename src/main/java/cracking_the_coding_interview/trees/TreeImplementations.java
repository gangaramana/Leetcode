package cracking_the_coding_interview.trees;

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

public class TreeImplementations {
     Tree tree;

    public void insertBinary(int data) {
        if (tree == null) {
            this.tree = new Tree(data);
        } else {
            Tree temporary = tree;
            while (true) {
                if (temporary.data >= data) {
                    if (temporary.left == null) {
                        temporary.left = new Tree(data);
                        break;
                    } else {
                        temporary = temporary.left;
                    }
                } else {
                    if (temporary.right == null) {
                        temporary.right = new Tree(data);
                        break;
                    } else {
                        temporary = temporary.right;
                    }
                }
            }
        }
    }

    public void printTree(Tree tree) {
        if (tree != null) {
            System.out.println(tree.data);

            printTree(tree.left);
            printTree(tree.right);


        }
    }
}

class Client {
    public static void main(String[] args) {
        TreeImplementations treeImplementations = new TreeImplementations();
        treeImplementations.insertBinary(9);
        treeImplementations.insertBinary(4);
        treeImplementations.insertBinary(10);
        treeImplementations.insertBinary(5);
        treeImplementations.insertBinary(6);
        treeImplementations.printTree(treeImplementations.tree);
    }
}

