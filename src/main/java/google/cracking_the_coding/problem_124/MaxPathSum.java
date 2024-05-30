package google.cracking_the_coding.problem_124;


 class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
} 
public class MaxPathSum {
    public static void main(String[] args) {

    }

    int maxPathSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        helper(root,0);
        return maxPathSum;
    }

    private int helper(TreeNode root,Integer sum){
        if(root==null){
            return 0;
        }
        int left=helper(root.left,sum);
        int right=helper(root.right,sum);
        maxPathSum =Math.max(root.val+right,Math.max(root.val+left,Math.max(root.val,Math.max(left+right+root.val, maxPathSum))));
        return Math.max(Math.max(left,right)+root.val,root.val);
    }
}
