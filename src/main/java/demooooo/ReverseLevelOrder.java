package demooooo;

import google.cracking_the_coding.problem_151.Reverse;

import java.util.ArrayList;
import java.util.List;

class Tree{
    Tree left;
    Tree right;
    int val;
    public Tree(int val){
        this.val=val;
        left=null;
        right=null;
    }
}
public class ReverseLevelOrder {
    static List<List<Integer>> list=new ArrayList<>();

    public static void main(String[] args) {
        Tree tree=new Tree(1);
        tree.left=new Tree(2);
        tree.left.left=new Tree(4);
        tree.right=new Tree(3);
        tree.left.right=new Tree(5);

        ReverseLevelOrder reverseLevelOrder=new ReverseLevelOrder();
        reverseLevelOrder.levelOrder(tree,0);
        for (int i=list.size()-1;i>=0;i--){
            for (int k:list.get(i)){
                System.out.print(k+" ");
            }
        }
    }
    private void levelOrder(Tree tree,int level){
        if(tree!=null){
            if(list.size()<level+1){
                while (list.size()!=level+1){
                    list.add(new ArrayList<>());
                }
            }
            list.get(level).add(tree.val);
            levelOrder(tree.left,level+1);
            levelOrder(tree.right,level+1);

        }
    }
}
