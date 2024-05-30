package cracking_the_coding_interview.LinkedLists;

public class SumLists {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        Node n2 = new Node(9);
        n2.next = new Node(2);
        n2.next.next = new Node(3);
        n2.next.next.next = new Node(8);
        n2.next.next.next.next = new Node(9);

        Node res = forwardList(n1, n2);
        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }

    }

    static Node forwardList(Node n1, Node n2) {
        Node result = null;
        int carry = 0;
        Node temp = null;
        while (n1 != null && n2 != null) {
            int res = n1.data + n2.data + carry;
            carry = res / 10;
            res = res % 10;

            if (result == null) {
                temp = new Node(res);
                result = temp;
            } else {
                Node x = new Node(res);
                temp.next = x;
                temp = x;
            }
            if (n2.next == null) {
                n2.next = new Node(0);
            } else if (n1.next == null) {
                n1.next = new Node(0);
            }
            n2 = n2.next;
            n1 = n1.next;

        }
        if (carry > 0) {
            Node x = new Node(carry);
            temp.next = x;
        }
        return result;

    }


    static Node reverseSumList(Node n1, Node n2) {
        return null;

    }
}
