package problem_23;

import java.util.PriorityQueue;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeSortedLists {
    public static void main(String[] args) {
        MergeSortedLists mergeSortedLists = new MergeSortedLists();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);
        ListNode[] listNodes = new ListNode[]{l1, l2, l3};
        ListNode k = mergeSortedLists.mergeKLists(listNodes);
        while (k != null) {
            System.out.print(k.val + " ");
            k = k.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        ListNode result = null;
        for (ListNode l : lists) {
            while (l != null) {
                priorityQueue.add(l.val);
                l = l.next;
            }
        }
        if (priorityQueue.size() > 0) {
            result = new ListNode(priorityQueue.remove());
        }
        ListNode k = result;
        while (priorityQueue.size() > 0) {
            result.next = new ListNode(priorityQueue.remove());
            result = result.next;

        }
        return k;
    }
}
