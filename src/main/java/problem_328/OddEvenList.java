package problem_328;

import java.util.List;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class OddEvenList {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        l.next.next.next.next.next = new ListNode(6);
//        while (l != null) {
//            System.out.print(l.val + " ");
//            l = l.next;
//        }
//        System.out.println();
        OddEvenList oddEvenList = new OddEvenList();
        l = oddEvenList.oddEvenList(l);
        while (l != null) {
            System.out.print(l.val + " ");
            l = l.next;
        }

    }

    public ListNode oddEvenList(ListNode head) {
        ListNode end = head;
        if (head == null) {
            return head;
        }
        int len = 1;
        while (end.next != null) {
            end = end.next;
            len++;
        }
        if (len <= 2) {
            return head;
        }
        ListNode odd = head;
        int i = 0;
        ListNode even = null;
        while (i != len / 2 && odd.next != null) {
            even = odd.next;
            odd.next = even.next;
            end.next = even;
            even.next = null;
            odd = odd.next;
            end = end = even;
            i++;
        }

        return head;
    }
}
