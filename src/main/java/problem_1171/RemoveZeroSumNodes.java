package problem_1171;


import java.util.HashMap;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

public class RemoveZeroSumNodes {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(3);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(-3);
        listNode.next.next.next.next = new ListNode(-2);
        listNode.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next = new ListNode(5);
        listNode.next.next.next.next.next.next.next = new ListNode(-5);
        listNode.next.next.next.next.next.next.next.next = new ListNode(1);

        RemoveZeroSumNodes removeZeroSumNodes = new RemoveZeroSumNodes();
        ListNode h = removeZeroSumNodes.removeZeroSumSublists(listNode);
        while (h != null) {
            System.out.println(h.val);
            h = h.next;
        }

    }

    public ListNode removeZeroSumSublists(ListNode head) {
        HashMap<Integer, ListNode> listNodeHashMap = new HashMap<>();
        ListNode dummy = new ListNode(0);
        listNodeHashMap.put(0, dummy);
        dummy.next = head;
        ListNode pp = head;
        int sum = 0;
        while (pp != null) {
            sum = sum + pp.val;
            if (listNodeHashMap.containsKey(sum)) {
                int tempSum = sum;
                ListNode ttmp = listNodeHashMap.get(sum).next;
                tempSum = tempSum + ttmp.val;
                while (tempSum != sum) {
                    listNodeHashMap.remove(tempSum);
                    ttmp = ttmp.next;
                    tempSum = tempSum + ttmp.val;
                }
                ListNode k = listNodeHashMap.get(sum);
                k.next = pp.next;


            } else {
                listNodeHashMap.put(sum, pp);
            }
            pp = pp.next;
        }
        return dummy.next;
    }
}
