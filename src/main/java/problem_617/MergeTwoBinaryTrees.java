package problem_617;

public class MergeTwoBinaryTrees {
    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(3);
        t1.left = new TreeNode(4);
        t1.right = new TreeNode(5);
        t1.left.left = new TreeNode(1);
        t1.left.left.right = new TreeNode(9);
//        t1.left.right = new TreeNode(2);
        TreeNode t2 = new TreeNode(4);
        t2.left = new TreeNode(1);
        t2.right = new TreeNode(2);
//        t2.left.right = new TreeNode(2);
//        t2.right.right = new TreeNode(7);
        MergeTwoBinaryTrees mergeTwoBinaryTrees = new MergeTwoBinaryTrees();
        mergeTwoBinaryTrees.mergeTrees(t1, t2);
    }

    public TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null) {
            inOrderPrintTree(t2);
            return t2;
        }
        if (t2 == null) {
            inOrderPrintTree(t1);
            return t1;
        }
        TreeNode t3 = preOrderprintTreerintTree(t1, t2);
//        inOrderPrintTree(t3);
        return t1;
    }


    public TreeNode preOrderprintTreerintTree(TreeNode node1, TreeNode node2) {
        TreeNode temp = node1;
        if (node1 != null || node2 != null) {
            node1.val = node1.val + node2.val;
            if (node1.left == null && node2.left != null) {
                node1.left = new TreeNode(0);
            } else if (node1.left != null && node2.left == null) {
                node2.left = new TreeNode(0);
            } else {
            }
            preOrderprintTreerintTree(node1.left, node2.left);
            if (node1.right == null && node2.right != null) {
                node1.right = new TreeNode(0);
            } else if (node1.right != null && node2.right == null) {
                node2.right = new TreeNode(0);
            } else {
            }

            preOrderprintTreerintTree(node1.right, node2.right);
        }
        return node1;

    }


    public void inOrderPrintTree(TreeNode node) {
        if (node!=null) {
            System.out.println(node.val);
            inOrderPrintTree(node.left);
            inOrderPrintTree(node.right);
        }
    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}


