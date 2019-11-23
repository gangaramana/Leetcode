package problem_234;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class PalindromeLinkedList {
    public static void main(String[] args) {
        ListNode l = new ListNode(1);
        l.next = new ListNode(2);
        l.next.next = new ListNode(2);
        l.next.next.next = new ListNode(1);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean v = palindromeLinkedList.isPalindrome(l);
        System.out.println(v);

    }

    public boolean isPalindrome(ListNode head) {
        if (head == null) {
            return false;
        }
        k = head;
        boolean v = helper(head);
        return v;
    }

    private ListNode k = null;

    public boolean helper(ListNode l) {
        boolean b = true;
        if (l != null) {
            b = helper(l.next);
        }
        else {
            return true;
        }
        if (b == false) {
            return false;
        }
        if (l.val == k.val) {
//            if (k.next!=null) {
            k = k.next;
//            }
            return true;
        }
        return false;

    }

}
