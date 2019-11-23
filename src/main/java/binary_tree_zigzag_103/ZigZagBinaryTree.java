package binary_tree_zigzag_103;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ZigZagBinaryTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(2);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(4);

        ZigZagBinaryTree zigZagBinaryTree = new ZigZagBinaryTree();
        zigZagBinaryTree.zigzagLevelOrder(root);
    }

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        dfs(result, root, 0);
        System.out.println(result);
        return result;
    }

    private void dfs(List<List<Integer>> resList, TreeNode node, int key) {
        if (node != null) {
            dfs(resList, node.left, key + 1);
            if (resList.size() <= key) {
                for (int k=resList.size();k<=key;k++) {
                    resList.add(k, new ArrayList<Integer>());
                }
            }
            if (key % 2 == 1) {
                resList.get(key).add(0, node.val);
            } else {
                resList.get(key).add(node.val);
            }
            dfs(resList, node.right, key + 1);
        }
    }
}
