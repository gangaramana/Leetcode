package problem_700;

import java.util.LinkedList;
import java.util.Queue;

public class SearchBinarySearchTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        SearchBinarySearchTree searchBinarySearchTree = new SearchBinarySearchTree();
        TreeNode t=searchBinarySearchTree.searchBST(treeNode, 2);
        System.out.println(t.val+"  "+t.left.val);
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if (root != null) {
            Queue<TreeNode> treeNodeQueue = new LinkedList<TreeNode>();
            treeNodeQueue.add(root);
            while (!treeNodeQueue.isEmpty()) {
                TreeNode t = treeNodeQueue.remove();
                if (t.val == val) {
                    return t;
                }
                if (t.left != null) {
                    treeNodeQueue.add(t.left);
                }
                if (t.right != null) {
                    treeNodeQueue.add(t.right);
                }
            }
        }

        return null;

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
