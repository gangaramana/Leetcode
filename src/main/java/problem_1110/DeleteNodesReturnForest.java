package problem_1110;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class DeleteNodesReturnForest {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(3);
        treeNode.left.left = new TreeNode(4);
        treeNode.left.right = new TreeNode(5);
        treeNode.right.left = new TreeNode(6);
        treeNode.right.right = new TreeNode(7);
        DeleteNodesReturnForest deleteNodesReturnForest = new DeleteNodesReturnForest();
        deleteNodesReturnForest.delNodes(treeNode, new int[]{3, 5});

    }

    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {

        HashSet<Integer> hashSet = new HashSet<>();
        for (int i : to_delete) {
            hashSet.add(i);
        }
        List<TreeNode> list = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();
        stack.add(root);
        TreeNode prev = null;
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (hashSet.contains(node.val)) {

            }
            else {

            }
        }

        return list;
    }


}
