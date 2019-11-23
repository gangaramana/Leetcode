package problem_814;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class BinaryTreePruning {
    public static void main(String[] args) {
        TreeNode x = new TreeNode(1);
        x.left = new TreeNode(0);
        x.left.left = new TreeNode(0);
        x.left.left.left = new TreeNode(0);
        x.left.right = new TreeNode(1);
        x.left.right.right = new TreeNode(1);
        x.right = new TreeNode(1);
        x.right.right = new TreeNode(0);
        x.right.right.right = new TreeNode(0);
        x.right.right.left = new TreeNode(0);
        x.right.right.left.left = new TreeNode(0);

        BinaryTreePruning binaryTreePruning = new BinaryTreePruning();
        binaryTreePruning.LRD(x);


    }

    public void LRD(TreeNode t) {
        if (t != null) {

            if (t.left != null) {
                LRD(t.left);
            }

            if (t.right != null) {
                LRD(t.right);
            }
            System.out.print("    " + t.val);
        }
    }

}




///
//[1,0,1,null,1,null,0,null,1,0,null,null,null,1]

//
//[1,0,1,0,1,null,0,0,null,null,1,0,0,null,null,null,null,1]
