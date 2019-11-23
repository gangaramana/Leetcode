package problem_872;

import java.util.ArrayList;

public class LeafSimilarTree {
    public static void main(String[] args) {
        TreeNode t = new TreeNode(1);
        t.left = new TreeNode(2);
        t.right = new TreeNode(3);
        t.left.left = new TreeNode(4);
        t.left.right = new TreeNode(5);
        t.left.right.right = new TreeNode(7);
        TreeNode t2 = new TreeNode(1);

        t2.left = new TreeNode(2);
        t2.right = new TreeNode(3);
        t2.left.left = new TreeNode(4);
        t2.left.right = new TreeNode(5);
        t2.left.right.right = new TreeNode(7);
        LeafSimilarTree leafSimilarTree = new LeafSimilarTree();
        boolean b = leafSimilarTree.leafSimilar(t, t2);
        System.out.println("boolean result is " + b);
    }

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        ArrayList<Integer> x = new ArrayList<>();
        LDR(root1, x);
        ArrayList<Integer> y = new ArrayList<>();
        LDR(root2, y);

        if (x.size() == y.size()) {
            for (int i = 0; i < x.size(); i++) {
                if (x.get(i) != y.get(i)) {
                    return false;
                }
            }
        } else {
            return false;
        }
        return true;
//        System.out.println(y);
//        System.out.println(x);
//        return true;
    }

    public void LDR(TreeNode treeNode, ArrayList<Integer> result) {
        if (treeNode != null) {
            if (treeNode.left == null && treeNode.right == null) {
                result.add(treeNode.val);
            }

            LDR(treeNode.left, result);

            LDR(treeNode.right, result);
        }
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