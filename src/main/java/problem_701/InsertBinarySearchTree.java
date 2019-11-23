package problem_701;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class InsertBinarySearchTree {
    TreeNode root = null;

    public static void main(String[] args) {
        InsertBinarySearchTree searchTree = new InsertBinarySearchTree();
        TreeNode treeNode = new TreeNode(4);
        treeNode.left = new TreeNode(2);
        treeNode.right = new TreeNode(7);
        treeNode.left.left = new TreeNode(1);
        treeNode.left.right = new TreeNode(3);
        searchTree.insertIntoBST(treeNode, 5);
    }


    public TreeNode insertIntoBST(TreeNode root, int val) {
        this.root = root;
        insert(val, root);
        return root;

    }

    public TreeNode insert(int data, TreeNode treeNode) {
        if (this.root == null) {
            TreeNode temp = new TreeNode(data);
            this.root = temp;
            return root;
        }

        if (treeNode == null) {
            TreeNode temp = new TreeNode(data);
            treeNode = temp;
            return treeNode;
        }
        if (treeNode.val > data) {
            treeNode.left = insert(data, treeNode.left);
        } else {
            treeNode.right = insert(data, treeNode.right);
        }
        return treeNode;
    }

}
