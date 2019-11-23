package problem_1008;


import java.util.Stack;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class TreeFromPreorder {
    public static void main(String[] args) {
        TreeFromPreorder treeFromPreorder = new TreeFromPreorder();
        TreeNode x=treeFromPreorder.bstFromPreorder(new int[]{8,5,1,7,10,12});


    }

    public TreeNode bstFromPreorder(int[] preorder) {
        TreeNode root = null;
        if (preorder.length > 0) {
            root = new TreeNode(preorder[0]);
            for (int i = 1; i < preorder.length; i++) {
                insert(preorder[i], root);
            }
        }
        return root;
    }

    public void insert(int number, TreeNode treeNode) {
        if (treeNode.val < number) {
            if (treeNode.right == null) {
                treeNode.right = new TreeNode(number);
                return;
            }
            insert(number, treeNode.right);
        } else {
            if (treeNode.left == null) {
                treeNode.left = new TreeNode(number);
                return;
            }
            insert(number, treeNode.left);
        }

    }
}
