package cracking_the_coding_interview.trees;

import java.util.ArrayList;
import java.util.List;

public class Ancestors {
    List<Integer> list = new ArrayList<>();

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(10);
        tree.right.right.left.right = new Tree(2);


        Ancestors ancestors = new Ancestors();
        System.out.println(ancestors.ancestor(tree,2));
    }

    public boolean ancestor(Tree tree, int number) {

        if (tree == null) {
            return false;
        }
        list.add(tree.data);
        if (number == tree.data) {
            System.out.println(list);
            return true;
        }
        boolean b=  ancestor(tree.left, number) ||ancestor(tree.right, number);
         list.remove(Integer.valueOf(tree.data));
         return b;

    }
}
