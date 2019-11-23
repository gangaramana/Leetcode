package problem_98;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class ValidBinarySearchTree {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(2147483647);
//        treeNode.left = new TreeNode(6);
//        treeNode.right = new TreeNode(8);
//        treeNode.left.left = new TreeNode(2);
//        treeNode.left.right = new TreeNode(4);
//        treeNode.right.left = new TreeNode(7);
//        treeNode.right.right = new TreeNode(9);
        ValidBinarySearchTree validBinarySearchTree = new ValidBinarySearchTree();
        System.out.println(validBinarySearchTree.isValidBST(treeNode));
    }

    public boolean isValidBST(TreeNode root) {
        return helper(root, null, null);
    }

    private boolean helper(TreeNode node, Integer min, Integer max) {
        if (node != null) {
            if ((min != null && node.val <=min) || (max != null && node.val >= max)) {
                return false;
            } else {
                if (!helper(node.left, min, node.val) || !(helper(node.right, node.val, max))) {
                    return false;
                }
            }

        }
        return true;
    }
}
