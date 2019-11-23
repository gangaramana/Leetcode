package problem_445;

import java.util.List;
import java.util.Stack;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class AddTwoNumbersII {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(7);
        ListNode y = new ListNode(5);
        y.next = new ListNode(6);
        y.next.next = new ListNode(4);
        AddTwoNumbersII addTwoNumbersII = new AddTwoNumbersII();
        ListNode v = addTwoNumbersII.addTwoNumbers(listNode, y);


    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode l11 = l1;
        ListNode l22 = l2;
        Stack<ListNode> stack1 = new Stack<>();
        Stack<ListNode> stack2 = new Stack<>();
        Stack<ListNode> res = null;
        ListNode answer = null;
        Stack<ListNode> not = null;
        while (l1 != null) {
            stack1.add(l1);
            l1 = l1.next;
        }
        while (l2 != null) {
            stack2.add(l2);
            l2 = l2.next;
        }
        if (stack1.size() > stack2.size()) {
            res = stack1;
            answer = l11;
            not = stack2;
        } else {
            res = stack2;
            not = stack1;
            answer = l22;
        }
        int carry = 0, intermediate = 0;

        while (!not.isEmpty()) {
            intermediate = not.pop().val + res.peek().val + carry;
            if (intermediate > 9) {
                carry = intermediate / 10;
                intermediate = intermediate % 10;

            } else {
                carry = 0;
            }
                res.pop().val = intermediate;

        }
        if (carry > 0) {
            while (!res.isEmpty() && carry > 0) {
                intermediate = res.peek().val + carry;
                if (intermediate > 9) {
                    carry = intermediate / 10;
                    intermediate = intermediate % 10;

                } else {
                    carry = 0;

                }
                res.pop().val = intermediate;
//                ListNode node = new ListNode(carry);
//                node.next = answer;
//                return node;
            }
            if (carry > 0) {
                ListNode node = new ListNode(carry);
                node.next = answer;
                return node;
            } else {
                return answer;
            }
        }
        return answer;


    }
}
