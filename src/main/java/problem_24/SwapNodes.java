package problem_24;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class SwapNodes {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(3);
        l.next.next.next = new ListNode(4);
        l.next.next.next.next = new ListNode(5);
        SwapNodes s = new SwapNodes();
        ListNode k = s.swapPairs(l);
        System.out.println(l.val + " " + l.next.val + "  " + l.next.next.val + " " + l.next.next.next.val);
        s.pri(k);


    }


    public ListNode swapPairs(ListNode head) {
        if (head != null && head.next != null) {
            ListNode tmp = head.next;
            int v = tmp.val;
            head.next.val = head.val;
            head.val = v;
            swapPairs(tmp.next);
        }
        return head;

    }


    public void pri(ListNode lk) {
        if (lk != null) {
            System.out.println(lk.val);
            pri(lk.next);
        }
    }
}
