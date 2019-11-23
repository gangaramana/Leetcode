package problem_21;


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class MergeTwoSortedList {
    public static void main(String[] args) {
        MergeTwoSortedList mergeTwo = new MergeTwoSortedList();
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(2);
//
        l1.next.next = new ListNode(4);
        ListNode l2 = new ListNode(0);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(5);

        ListNode r = mergeTwo.mergeTwoLists(l1, l2);

    }

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode res = l1;
        ListNode prev = null;
        if (l2 == null) {
            return l1;
        }
        if (l1 == null) {
            return l2;
        }
        while (l1 != null && l2 != null) {
            if (l1.val <= l2.val) {
                prev = l1;
                l1 = l1.next;

            } else {
                if (prev == null) {
                    ListNode temp = l2;
                    l2 = l2.next;
                    temp.next = l1;
                    prev = temp;
                    l1 = temp;

//                    l1 = temp;
                    res = l1;
                    l1 = l1.next;
//
                } else {
                    ListNode temp = l2;
                    l2 = l2.next;
                    prev.next = temp;

                    prev = prev.next;
                    prev.next = l1;
//                    l1 = l1.next;


                }

//                ListNode tmp = l1;
//                l1.next = tmp;
//                l2 = l2.next;
//
//                prev = tmp;
//                l1 = l1.next;
            }
        }
        if (l2 != null) {
            prev.next = l2;
        }
        return res;

    }

}
