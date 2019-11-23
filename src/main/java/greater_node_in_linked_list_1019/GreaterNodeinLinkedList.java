package greater_node_in_linked_list_1019;

import java.util.ArrayList;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}


public class GreaterNodeinLinkedList {
    public static void main(String[] args) {
//        ArrayList<Integer> a = new ArrayList();
//        a.toArray();
        ListNode l = new ListNode(2);
        l.next = new ListNode(7);
        l.next.next = new ListNode(4);
        l.next.next.next = new ListNode(3);
        l.next.next.next.next=new ListNode(5);
        GreaterNodeinLinkedList greaterNodeinLinkedList = new GreaterNodeinLinkedList();
        int[] a = greaterNodeinLinkedList.nextLargerNodes(l);
        for (int f : a) {
            System.out.println(f);
        }

    }

    public void insert(ListNode node, ArrayList<Integer> arrayList, int no) {
        int sum = 0;
        while (node != null) {
            if (no < node.val) {
//                sum = node.val;
                arrayList.add(node.val);
                return;
            }
            node = node.next;
        }

            arrayList.add(0);

    }

    public int[] nextLargerNodes(ListNode head) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        while (head != null) {
            insert(head.next, arrayList, head.val);
            head = head.next;
        }
        int size = arrayList.size();
        int[] res = new int[size];
        int k = 0;
        for (int c : arrayList) {
            res[k++] = c;
        }
        return res;
    }
}
