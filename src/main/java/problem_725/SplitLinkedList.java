package problem_725;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class SplitLinkedList {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(8);
        listNode.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next = new ListNode(3);
        SplitLinkedList splitLinkedList = new SplitLinkedList();
        splitLinkedList.splitListToParts(listNode, 5);
        int c=00;
    }

    public ListNode[] splitListToParts(ListNode root, int k) {
        ArrayList<ListNode> arrayList = new ArrayList<>();
        ListNode[] result = new ListNode[k];
        while (root != null) {
            arrayList.add(root);
            root = root.next;
        }
        int val = arrayList.size() / k;
        int rem = arrayList.size() % k;
        int first = 0;
        int next = 0;
//        rem--;
        int i = 0;
        while (first < arrayList.size()) {

            result[i++] = arrayList.get(first);
            int add = (rem - 1 >= 0) ? 1 : 0;
            rem--;

            next = first + val + add;
            if (first == next) {
                return result;
            }
            if (next < arrayList.size()) {
                arrayList.get(next - 1).next = null;
            }
            first = next;
        }
        return result;
    }
}
