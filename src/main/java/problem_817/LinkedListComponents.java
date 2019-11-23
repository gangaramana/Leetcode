package problem_817;

import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class LinkedListComponents {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(5);
        listNode.next.next.next = new ListNode(8);
        listNode.next.next.next.next = new ListNode(6);
        listNode.next.next.next.next.next = new ListNode(3);
        int[] A = new int[]{1, 2,8, 3};
        LinkedListComponents linkedListComponents = new LinkedListComponents();
        int p = linkedListComponents.numComponents(listNode, A);
        System.out.println(p);

    }

    public int numComponents(ListNode head, int[] G) {
        Set<Integer> Gset = new HashSet();
        for (int x : G) Gset.add(x);

        ListNode cur = head;
        int ans = 0;

        while (cur != null) {
            if (Gset.contains(cur.val) &&
                    (cur.next == null || !Gset.contains(cur.next.val)))
                ans++;
            cur = cur.next;
        }

        return ans;
    }
}
