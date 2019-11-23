//package insufficient_nodes_in_tree_1080;
//
//class TreeNode {
//    int val;
//    TreeNode left;
//    TreeNode right;
//
//    TreeNode(int x) {
//        val = x;
//    }
//}
//
//public class InsufficientNodes {
//    public static void main(String[] args) {
//        TreeNode tree = new TreeNode(1);
//        tree.left = new TreeNode(2);
//        tree.right = new TreeNode(3);
//        tree.left.left = new TreeNode(-5);
//        tree.left.right = new TreeNode(5);
//        tree.right.left = new TreeNode(4);
//        tree.right.right = new TreeNode(5);
//        tree.right.right.left = new TreeNode(4);
//        tree.right.right.right = new TreeNode(-34);
//        int limit = 0;
//        InsufficientNodes insufficientNodes = new InsufficientNodes();
//        insufficientNodes.sufficientSubset(tree, limit);
//
//    }
//
//    public TreeNode sufficientSubset(TreeNode root, int limit) {
////        if ()
//        helper(root, 0, limit);
//        return null;
//
//    }
//
//    private boolean helper(TreeNode root, int sum, int limit) {
//        if (root.left == null && root.right == null) {
//
//            if (sum + root.val > limit) {
//                return true;
//            } else {
//                return false;
//            }
//        }
//
//        if (helper(root.left, sum + root.val, limit)) {
//            root.left = null;
//            return false;
//        }
////        sum = sum - root.val;
//
//        if (helper(root.right, sum + root.val, limit)) {
//
//        }
////        System.out.println(sum);
////        return sum - root.val;
//    }
//}
