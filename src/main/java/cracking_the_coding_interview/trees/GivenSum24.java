package cracking_the_coding_interview.trees;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GivenSum24 {
    static List<List<Integer>> listList = new ArrayList<>();

    public static void main(String[] args) {
        Tree tree = new Tree(1);
        tree.left = new Tree(10);
        tree.right = new Tree(20);
        tree.left.left = new Tree(290);
        tree.left.right = new Tree(233);
        tree.right.left = new Tree(10);
        tree.right.right = new Tree(1000);
        tree.right.right.left = new Tree(10);
//        System.out.println(new GivenSum24().pathSum(tree, 31));


        Tree k = new Tree(5);
        k.left = new Tree(4);
        k.left.left = new Tree(11);
        k.left.left.left = new Tree(7);
        k.left.left.right = new Tree(2);
        k.right = new Tree(8);
        k.right.left = new Tree(13);
        k.right.right = new Tree(4);
        k.right.right.left = new Tree(5);
        k.right.right.right = new Tree(1);
        System.out.println(new GivenSum24().pathSum(k,22));
    }


//    public boolean paths(Tree tree, List<Integer> list, int result) {
//        if (tree == null) {
//            return false;
//        }
//        list.add(tree.data);
//        boolean b = paths(tree.left, list, result) || paths(tree.right, list, result);
//
//        if (tree.left == null && tree.right == null) {
//            System.out.println(list);
//
//
//            if (list.stream().mapToInt(Integer::valueOf).sum() == result) {
//                List<Integer> arrayList = new ArrayList<>(list);
//                listList.add(arrayList);
//                return true;
//            }
//        }
//        list.remove(list.size() - 1);
//        return b;
//    }

//    public boolean withOutPath(Tree tree, int sum) {
//        if (tree == null) {
//            return false;
//        }
//        if (tree.left == null && tree.right == null && sum == tree.data) {
//            return true;
//        }
//        return withOutPath(tree.left, sum - tree.data) || withOutPath(tree.right, sum - tree.data);
//    }

    public List<List<Integer>> pathSum(Tree root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> iterableList = new ArrayList<>();
        pathSum(root, iterableList, targetSum, result);
        return result;
    }


    public void pathSum(Tree tree, List<Integer> list, int targetSum, List<List<Integer>> result) {
        if (tree == null) {
            return;
        }
        list.add(tree.data);
        pathSum(tree.left, list, targetSum-tree.data, result);
        pathSum(tree.right, list, targetSum-tree.data, result);

        if (tree.left == null && tree.right == null) {

            if (targetSum-tree.data==0) {
                List<Integer> arrayList = new ArrayList<>(list);
                result.add(arrayList);
                return;
            }
        }
        list.remove(list.size() - 1);
    }
}
