package problem_993;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Cousins {
    public static void main(String[] args) {
        Cousins cousins = new Cousins();
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.right = new TreeNode(4);
        treeNode.right.right = new TreeNode(5);
        treeNode.right.right.left = new TreeNode(6);
        treeNode.right.right.right = new TreeNode(7);

        treeNode.left.right.left = new TreeNode(3);
        boolean b = cousins.isCousins(treeNode, 2, 3);
        System.out.println(b);
    }

    public boolean isCousins(TreeNode root, int x, int y) {
        ArrayList<TreeNode> arrayListx = new ArrayList<>();
        ArrayList<TreeNode> arrayListy = new ArrayList<>();
        if (root != null) {

            HashMap<TreeNode, TreeNode> treeNodeHashMap = new HashMap<>();
            HashMap<TreeNode, Integer> integerHashMap = new HashMap<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode t = queue.remove();
                if (t == root) {
                    treeNodeHashMap.put(t, null);
                    integerHashMap.put(t, 1);
                }
                if (t.left != null) {
                    if (t.left.val == x) {
                        arrayListx.add(t.left);
//                        System.out.println(t.left);
//                        System.out.println("t.x   :" + t.left.val);
                    }
                    if (t.left.val == y) {
                        arrayListy.add(t.left);
//                        System.out.println(t.left);
//                        System.out.println("t.y   :" + t.left.val);
                    }

                    integerHashMap.put(t.left, integerHashMap.get(t) + 1);
                    treeNodeHashMap.put(t.left, t);
                    queue.add(t.left);
                }
                if (t.right != null) {
                    if (t.right.val == x) {
//                        System.out.println("t.x   :" + t.right.val);
//                        System.out.println(t.right);
                        arrayListx.add(t.right);
                    }
                    if (t.right.val == y) {
//                        System.out.println("t.y   :" + t.right.val);
//                        System.out.println(t.right);
                        arrayListy.add(t.right);
                    }
                    integerHashMap.put(t.right, integerHashMap.get(t) + 1);
                    treeNodeHashMap.put(t.right, t);
                    queue.add(t.right);
                }
            }
            if (arrayListx.size() >= 1 && arrayListy.size() >= 1) {
//                if ((treeNodeHashMap.get(arrayList.get(0)) != treeNodeHashMap.get(arrayList.get(1))) && integerHashMap.get(arrayList.get(0)) == integerHashMap.get(arrayList.get(1))) {
//                    return true;
//                }
                for (int i = 0; i < arrayListx.size(); i++) {
                    for (int j = 0; j < arrayListy.size(); j++) {
                        if (integerHashMap.get(arrayListx.get(i)) == integerHashMap.get(arrayListy.get(j)) && treeNodeHashMap.get(arrayListx.get(i)) != treeNodeHashMap.get(arrayListy.get(j))) {
                            return true;
                        }
                    }
                }
            }

//            System.out.println(arrayListx.get(1));

//            System.out.println("arrayList X  " + arrayListx);
//            System.out.println("arrayList Y  " + arrayListy);
//            System.out.println("integerHashMap    " + integerHashMap);
//            System.out.println("treeNodeHashMap     :" + treeNodeHashMap);
        }


        return false;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}
