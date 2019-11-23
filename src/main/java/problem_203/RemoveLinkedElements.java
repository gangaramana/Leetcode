package problem_203;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class RemoveLinkedElements {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
//        listNode.next = new ListNode(2);
//        listNode.next.next = new ListNode(6);
//        listNode.next.next.next = new ListNode(3);
//        listNode.next.next.next.next = new ListNode(4);
//        listNode.next.next.next.next.next = new ListNode(5);
//        listNode.next.next.next.next.next.next = new ListNode(6);
        RemoveLinkedElements removeLinkedElements = new RemoveLinkedElements();
        removeLinkedElements.removeElements(listNode, 1);
    }

    public ListNode removeElements(ListNode head, int val) {
        ListNode res = head;
        ListNode prev = null;
        while (head != null) {
            ListNode nextTemp = head.next;
            if (head.val == val) {
                head = null;
                if (prev == null) {
                    res = head;
                    head = nextTemp;
                    continue;
                }
                prev.next = nextTemp;
                head = nextTemp;
            } else {
                prev = head;
                head = nextTemp;
            }
        }
        return res;
    }
}
