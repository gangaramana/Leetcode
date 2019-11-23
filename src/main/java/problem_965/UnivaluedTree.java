package problem_965;

public class UnivaluedTree {

    public static void main(String[] args) {
        UnivaluedTree univaluedTree = new UnivaluedTree();
        TreeNode treeNode = new TreeNode(10);
        treeNode.left = new TreeNode(10);
        treeNode.right = new TreeNode(10);
        treeNode.left.left = new TreeNode(10);
        treeNode.left.right = new TreeNode(10);
        treeNode.right.left = new TreeNode(10);
        treeNode.right.right = new TreeNode(10);
        boolean b = univaluedTree.isUnivalTree(treeNode);
        System.out.println(b);
    }

    int unival = 0;
    boolean flag = true;

    public boolean isUnivalTree(TreeNode root) {

        if (root != null) {
            unival = root.val;
            return preOrder(root);

        }
        return false;
    }

    public boolean preOrder(TreeNode treeNode) {
        if (treeNode != null) {
            if (treeNode.val != unival) {
                flag = false;
            }
            if (flag) {
                preOrder(treeNode.left);
                preOrder(treeNode.right);
            } else {
                return false;
            }
        }
        return flag;
    }


}


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


