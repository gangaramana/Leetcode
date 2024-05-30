package contest_1;

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}

public class SumList {
    public static void main(String[] args) {
SumList sumList=new SumList();
ListNode l1=new ListNode(9);
l1.next=new ListNode(9);
l1.next.next=new ListNode(9);
ListNode l2=new ListNode(9);
l2.next=new ListNode(9);
l2.next.next=new ListNode(9);
ListNode res=sumList.addTwoNumbers(l1,l2);
        System.out.println(res);
    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = null, start = null;
        int value = 0, carry = 0, current = 0;
        while (l1 != null && l2 != null) {
            value = l1.val + l2.val + carry;
            if (value>=10) {
                carry = value / 10;
                value = value % 10;


            }
            else { carry=0;}
            if (res == null) {
                res = new ListNode(value);
                start = res;

            } else {
                res.next = new ListNode(value);
                res = res.next;
            }
            l1 = l1.next;
            l2 = l2.next;

        }
        while (l1 != null) {
            value = l1.val + carry;
            if (value>=10) {
                carry = value / 10;

                value = value % 10;
            }
           else {
                carry=0;
            }
            if (res == null) {
                res = new ListNode(value);
                start = res;

            } else {
                res.next = new ListNode(value);
                res = res.next;
            }
            l1 = l1.next;


        }
        while (l2 != null) {
            value = l2.val + carry;
            if (value>=10) {
                carry = value / 10;

                value = value % 10;
            }
               else {
                carry=0;
            }
            if (res == null) {
                res = new ListNode(value);
                start = res;

            } else {
                res.next = new ListNode(value);
                res = res.next;
            }
            l2 = l2.next;


        }
        if (carry != 0) {
            res.next = new ListNode(carry);
        }
        return start;
    }
}
