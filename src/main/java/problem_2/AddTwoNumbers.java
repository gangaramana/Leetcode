package problem_2;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbers {
    public static void main(String[] args) {
        AddTwoNumbers addTwoNumbers = new AddTwoNumbers();
        ListNode l = new ListNode(1);
        l.next = new ListNode(8);
//        l.next.next = new ListNode(9);

        ListNode l2 = new ListNode(0);
//        l2.next = new ListNode(0);
//        l2.next.next = new ListNode(1);


        ListNode lll = addTwoNumbers.addTwoNumbers(l, l2);
//        System.out.println(l.val+"   "+ l.next.val+"   "+l.next.next.val);
//        System.out.println(l2.val+"   "+ l2.next.val+"   "+l2.next.next.val);
        System.out.println();


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Deque<ListNode> stack1 = new LinkedList<>();
        Deque<ListNode> stlist2 = new LinkedList<>();
        ListNode res = null;
        Deque<ListNode> resStack = null;
        Deque<ListNode> noStack = null;

        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }
        ListNode st1 = l1;
        ListNode st2 = l2;
        while (st1 != null) {
            stack1.addLast(st1);
            st1 = st1.next;
        }
        while (st2 != null) {
            stlist2.addLast(st2);
            st2 = st2.next;
        }
        if (stack1.size() > stlist2.size()) {
            resStack = stlist2;
            noStack = stack1;
        } else {
            resStack = stack1;
            noStack = stlist2;
        }
        int carry = 0, intermediate = 0;
        Queue<Integer> resqueue = new LinkedList<>();
        while (!resStack.isEmpty()) {
            intermediate = resStack.pop().val + noStack.pop().val + carry;
            if (intermediate > 9) {
                carry = intermediate / 10;
                intermediate = intermediate % 10;

            } else {
                carry = 0;
            }

            resqueue.add(intermediate);

        }
        while (!noStack.isEmpty()) {
            intermediate = noStack.pop().val + carry;
            if (intermediate > 9) {
                carry = intermediate / 10;
                intermediate = intermediate % 10;
            } else {
                carry = 0;
            }
            resqueue.add(intermediate);


        }
        ListNode in = res;
        if (carry > 0) {
            resqueue.add(carry);

        }
        while (!resqueue.isEmpty()) {
            if (in == null) {
                in = new ListNode(resqueue.remove());
                res = in;
            } else {
                in.next = new ListNode(resqueue.remove());
                in = in.next;
            }
        }
        return res;

    }
}
