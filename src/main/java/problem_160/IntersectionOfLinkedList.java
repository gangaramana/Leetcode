package problem_160;


import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
}

public class IntersectionOfLinkedList {
    public static void main(String[] args) {
        IntersectionOfLinkedList intersectionOfLinkedList = new IntersectionOfLinkedList();
        intersectionOfLinkedList.getIntersectionNode(null, null);
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode, Integer> listNodeIntegerHashMap = new HashMap<>();

        while (headA != null) {
            listNodeIntegerHashMap.put(headA, headA.val);
            headA = headA.next;
        }
        while (headB != null) {
            if (listNodeIntegerHashMap.containsKey(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
