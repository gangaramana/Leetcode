package cracking_the_coding_interview.premiun.prefix_sum_III_437;

import cracking_the_coding_interview.premiun.TreeNode;

import java.util.HashMap;
import java.util.Map;

public class PrefixSum3 {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(1000000000);
        treeNode.left=new TreeNode(1000000000);
        treeNode.left.left=new TreeNode(294967296);
        treeNode.left.left.left=new TreeNode(1000000000);
        treeNode.left.left.left.left=new TreeNode(1000000000);
//        treeNode.left.left.left.left.left=new TreeNode(1000000000);

        PrefixSum3 pf = new PrefixSum3();
       int result= pf.pathSum(treeNode, 0);
        System.out.println(result);
    }

    Map<Long, Integer> hashMap = new HashMap<>();
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        preorder(root, 0, targetSum);
        return count;
    }

    private void preorder(TreeNode root, long sum, int targetSum) {
        if (root != null) {
            sum += root.val;
            if (sum == targetSum) {
                count++;
            }

            count += hashMap.getOrDefault(sum - targetSum, 0);
            hashMap.put(sum, hashMap.getOrDefault(sum, 0) + 1);

            preorder(root.left, sum, targetSum);
            preorder(root.right, sum, targetSum);

            hashMap.put(sum, hashMap.get(sum) - 1);
        }

    }
}
