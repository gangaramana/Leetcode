package problem_141;

import java.util.HashSet;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class HASCycleLinkedList {
    public static void main(String[] args) {
        HASCycleLinkedList hasCycleLinkedList = new HASCycleLinkedList();
//        hasCycleLinkedList.hasCycle()
    }

    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> hashSet = new HashSet<>();
        while (hashSet.add(head)) {
            if (head == null) {
                return false;
            }
            head = head.next;
        }
        return true;

    }
}
