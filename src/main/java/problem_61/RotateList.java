package problem_61;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RotateList {
    public static void main(String[] args) {
        RotateList rotate = new RotateList();
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        ListNode k = rotate.rotateRight(l, 5);
        while (k != null) {
            System.out.println(k.val);
            k = k.next;
        }

    }

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0 || head==null) {
            return head;
        }
        int len = 0;
        ListNode l = head;
        while (l != null) {
            len++;
            l = l.next;
        }

        int someLength = k % len;
        if (someLength == 0) {
            return head;
        } else {
            l = head;
            ListNode dble = head;
            ListNode prev = head;
            for (int i = 1; i < someLength; i++) {
                l = l.next;

            }
            while (l.next != null) {
                l = l.next;
                dble = prev;
                prev = prev.next;

            }
            l.next = head;
            dble.next = null;
            return prev;
        }
    }
}
