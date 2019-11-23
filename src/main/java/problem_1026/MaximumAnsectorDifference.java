package problem_1026;

import problem_160.IntersectionOfLinkedList;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaximumAnsectorDifference {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(8);
        treeNode.left = new TreeNode(3);
        treeNode.right = new TreeNode(10);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.left.left = new TreeNode(44);
        treeNode.left.left.right = new TreeNode(14);
        treeNode.left.right = new TreeNode(6);
        treeNode.left.right.left = new TreeNode(74);
        treeNode.left.right.right = new TreeNode(17);
        treeNode.right.right = new TreeNode(14);
        treeNode.right.left = new TreeNode(34);
        treeNode.right.left.left = new TreeNode(13);
        MaximumAnsectorDifference maximumAnsectorDifference = new MaximumAnsectorDifference();
        int k = maximumAnsectorDifference.maxAncestorDiff(treeNode);
        System.out.println(k);
    }

    public int maxAncestorDiff(TreeNode root) {
        int k = helper(root, new ArrayList<Integer>(), Integer.MIN_VALUE);
        return k;
    }


    private int helper(TreeNode node, ArrayList<Integer> list, int diff) {
        if (node != null) {
            int temp;
            for (int i = 0; i < list.size(); i++) {
                temp = Math.abs(node.val - list.get(i));
                if (temp > diff) {
                    diff = temp;
                }
            }
            list.add(node.val);
            diff = helper(node.left, list, diff);

            diff = helper(node.right, list, diff);
            boolean b = list.remove((Integer) node.val);
        }
        return diff;

    }
}
