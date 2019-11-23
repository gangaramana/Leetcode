package problem_1161;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class MaxLevelSum {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(989);
//        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(10250);
        treeNode.right.left = new TreeNode(98693);
        treeNode.right.right = new TreeNode(-89388);
        treeNode.right.right.right = new TreeNode(-32127);
        MaxLevelSum maxLevelSum = new MaxLevelSum();
        int res = maxLevelSum.maxLevelSum(treeNode);
        System.out.println(res);
    }

    public int maxLevelSum(TreeNode root) {
        HashMap<Integer, Long> hashMap = new HashMap<>();
        int level = 1;
        helper(root, hashMap, level);
        int res = 0;
        long temp = Long.MIN_VALUE;
        for (Map.Entry<Integer, Long> entry : hashMap.entrySet()) {
            System.out.println(entry.getValue());
            if (entry.getValue() >= temp) {
                res = entry.getKey();
                temp = entry.getValue();
            }
        }
        System.out.println(temp);
        return res;
    }

    private void helper(TreeNode treeNode, HashMap<Integer, Long> hashMap, int level) {
        if (treeNode != null) {
            helper(treeNode.left, hashMap, level + 1);
            if (hashMap.containsKey(level)) {
                hashMap.put(level, hashMap.get(level) + treeNode.val);
            } else {
                hashMap.put(level, (long) treeNode.val);
            }
            helper(treeNode.right, hashMap, level + 1);

        }

    }
}

