package problem_109;

import java.util.ArrayList;
import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        next = null;
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

public class SortedListToBinarySearchTree {
    public static void main(String[] args) {
        SortedListToBinarySearchTree sortedListToBinarySearchTree = new SortedListToBinarySearchTree();
//        ListNode listNode=new ListNode()
//        sortedListToBinarySearchTree.sortedListToBST();

    }

    public TreeNode sortedListToBST(ListNode head) {
        List<Integer> list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        if (list.size() > 0) {
            int middle = (0 + list.size()) / 2;
            TreeNode treeNode = new TreeNode(list.get(middle));
            helper(list, 0, middle - 1, treeNode);
            helper(list, middle + 1, list.size() - 1, treeNode);
            return treeNode;
        } else {
            return null;
        }

    }

    private void helper(List<Integer> list, int start, int end, TreeNode node) {
        if (end < start) {
            return;
        }
        int middle = (start + end + 1) / 2;
        insert(node, list.get(middle));
        helper(list, start, middle - 1, node);
        helper(list, middle + 1, end, node);
    }

    private TreeNode insert(TreeNode treeNode, int val) {
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
