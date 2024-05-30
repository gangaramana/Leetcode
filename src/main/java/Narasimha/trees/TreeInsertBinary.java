package Narasimha.trees;


class Tree {
    Tree left;
    Tree right;
    int value;

     Tree(int value) {
        this.value = value;
    }
}

public class TreeInsertBinary {
    public static void main(String[] args) {
        Tree t=new Tree(4);
        t.left=new Tree(2);
        t.left.left=new Tree(1);
        t.left.right=new Tree(3);
        t.right=new Tree(6);
        t.right.left=new Tree(5);
        t.right.right=new Tree(7);


    }

    public void insert(){

    }

}
