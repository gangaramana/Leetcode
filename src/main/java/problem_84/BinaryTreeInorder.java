package problem_84;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreeInorder {
    public static void main(String[] args) {
        BinaryTreeInorder binaryTreeInorder = new BinaryTreeInorder();
//        List<Integer> y=binaryTreeInorder.inorderTraversal();
    }

    public List<Integer> inorderTraversal(TreeNode root) {
        ArrayList<Integer> x = new ArrayList<>();
        inorder(root, x);
        return x;
    }

    public void inorder(TreeNode r, ArrayList<Integer> l) {
        if (r != null) {
            inorder(r.left, l);
            l.add(r.val);
            inorder(r.right, l);
        }
    }
}
