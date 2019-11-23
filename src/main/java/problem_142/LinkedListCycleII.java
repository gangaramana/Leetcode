package problem_142;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class LinkedListCycleII {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = l;
//        l.next.next = new ListNode(3);
//        l.next.next.next = new ListNode(4);
//        l.next.next.next.next = new ListNode(5);
//        l.next.next.next.next.next = new ListNode(6);
//        l.next.next.next.next.next.next = l.next;
        LinkedListCycleII linkedListCycleII = new LinkedListCycleII();
        ListNode k = linkedListCycleII.detectCycle(l);
        System.out.println(k.val);
    }

    public ListNode detectCycle(ListNode head) {
        ListNode fast = head, slow = head;
        boolean isCyclic = false;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast == slow) {
                isCyclic = true;
                break;
            }
        }
        slow = head;
        int i = 1;
        if (!isCyclic) {
            return null;
        }
        while (slow != fast) {
            slow = slow.next;
            fast = fast.next;
            i++;
        }


        return slow;
    }
}
