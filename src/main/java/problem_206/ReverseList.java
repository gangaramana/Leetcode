package problem_206;

import problem_7.ReverseInteger;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class ReverseList {
    public static void main(String[] args) {

        ListNode x = new ListNode(1);
        x.next=new ListNode(2);
        x.next.next=new ListNode(3);
        x.next.next.next=new ListNode(4);
        x.next.next.next.next=new ListNode(5);
        ReverseList reverseList = new ReverseList();
        ListNode k=reverseList.reverseList(x);

    }

    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

//    public ListNode reverseList(ListNode head) {
//        ListNode res = null;
//        while (head != null) {
//            res = insertAtBegin(res, head.val);
//            head = head.next;
//        }
//        return res;
//    }

    private ListNode insertAtBegin(ListNode h, int va) {
        if (h == null) {
            h = new ListNode(va);
            return h;
        } else {
            ListNode v = new ListNode(va);
            v.next = h;
            return v;
        }
    }


}
