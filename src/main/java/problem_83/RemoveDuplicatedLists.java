package problem_83;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveDuplicatedLists {
    public static void main(String[] args) {

    }

    public ListNode deleteDuplicates(ListNode head) {
        ListNode res = head;
        if (head != null) {

            while (head.next != null) {
                int val = head.val;
                if (val == head.next.val) {
                    ListNode temp = head;
                    head.next = head.next.next;
                } else {
                    head = head.next;
                }

            }
        }
        return res;

    }
}
