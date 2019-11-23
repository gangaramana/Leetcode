package problem_104;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class MaximumDepthBinaryTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(3);
        treeNode.left = new TreeNode(9);
        treeNode.right = new TreeNode(20);
        treeNode.right.right = new TreeNode(7);
        treeNode.right.left = new TreeNode(15);
        treeNode.right.left.right = new TreeNode(22);
        treeNode.right.left.right.left = new TreeNode(22);
        MaximumDepthBinaryTree maximumDepthBinaryTree = new MaximumDepthBinaryTree();
        System.out.println(maximumDepthBinaryTree.maxDepth(treeNode));
    }

    public int maxDepth(TreeNode root) {
        int depth = 0;
        if (root != null) {
            HashMap<TreeNode, Integer> hashMap = new HashMap<TreeNode, Integer>();
            Queue<TreeNode> queue = new LinkedList<TreeNode>();

            queue.add(root);
            while (!queue.isEmpty()) {
                TreeNode t = queue.remove();
                if (t == root) {
                    hashMap.put(t, 1);
                    depth++;
                }

                if (t.left != null) {
                    hashMap.put(t.left, hashMap.get(t) + 1);
                    if (depth < hashMap.get(t.left)) {
                        depth = hashMap.get(t.left);
                    }

                    queue.add(t.left);
                }
                if (t.right != null) {
                    hashMap.put(t.right, hashMap.get(t) + 1);
                    if (depth < hashMap.get(t.right)) {
                        depth = hashMap.get(t.right);
                    }
                    queue.add(t.right);
                }

            }
        }
        return depth;
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
