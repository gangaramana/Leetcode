package problem_538;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BSTtoGreaterTree {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(2);
        root.right = new TreeNode(13);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(3);
        root.right.left = new TreeNode(12);
        root.right.right = new TreeNode(15);
        BSTtoGreaterTree bsTtoGreaterTree = new BSTtoGreaterTree();
        bsTtoGreaterTree.bstToGst(root);

    }

    public TreeNode bstToGst(TreeNode root) {
        helper(root, 0);
        return root;
    }

    public int helper(TreeNode ro, int sum) {
        if (ro != null) {
            sum=helper(ro.right, sum);
            ro.val = ro.val + sum;
//            sum=ro.val;
           sum= helper(ro.left, ro.val);
        }
        return sum;
    }
}
