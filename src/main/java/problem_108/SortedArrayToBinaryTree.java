package problem_108;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class SortedArrayToBinaryTree {
    public static void main(String[] args) {
        SortedArrayToBinaryTree s = new SortedArrayToBinaryTree();
        TreeNode tnode = s.sortedArrayToBST(new int[]{-10,-3,0,5,9,11,13,15,17});
        s.print(tnode);


    }

    public void print(TreeNode treeNode) {
        if (treeNode != null) {
            System.out.println(treeNode.val);
            print(treeNode.left);

            print(treeNode.right);
        }
    }

    public TreeNode sortedArrayToBST(int[] nums) {
        int length = nums.length;
        if (length > 0) {
            int middle = (0 + nums.length ) / 2;
            TreeNode treeNode = new TreeNode(nums[middle]);
            helper(nums, 0, middle - 1, treeNode);
            helper(nums, middle + 1, nums.length - 1, treeNode);
            return treeNode;
        } else {
            return null;
        }

    }

    public void helper(int[] nums, int start, int end, TreeNode node) {
        if (end < start) {
            return;
        }
        int middle = (start + end+1) / 2;
        insert(node, nums[middle]);
        helper(nums,start,middle-1,node);
        helper(nums,middle+1,end,node);
    }

    public TreeNode insert(TreeNode treeNode, int val) {
        if (treeNode != null) {
            if (treeNode.val > val) {

                treeNode.left = insert(treeNode.left, val);


            } else {
                treeNode.right = insert(treeNode.right, val);

            }
            return treeNode;
        } else {
            TreeNode t = new TreeNode(val);
            return t;
        }
    }

}

