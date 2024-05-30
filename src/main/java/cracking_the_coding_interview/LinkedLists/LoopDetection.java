package cracking_the_coding_interview.LinkedLists;

public class LoopDetection {
    public static void main(String[] args) {
        Node n3 = new Node(1);
        n3.next = new Node(2);
        Node temp = new Node(3);
        n3.next.next = temp;
        n3.next.next.next = new Node(4);
        n3.next.next.next.next = new Node(5);
        n3.next.next.next.next.next = new Node(6);
        n3.next.next.next.next.next.next = new Node(7);
        n3.next.next.next.next.next.next.next = temp;

        System.out.println(loopDetection(n3).data);
    }

    static Node loopDetection(Node node) {
        Node n1 = node;
        Node n2 = node;

        while (n2 != null && n2.next != null) {
            n1 = n1.next;
            n2 = n2.next.next;
            if (n1.equals(n2)) {
                break;
            }
//            System.out.println("n1   " + n1.data);
//            System.out.println("n2   " + n2.data);

        }
        if (n1 != null && n2 != null) {
            while (node != n1) {
                System.out.println("node " + node.data);
                System.out.println("n1   " + n1.data);
                node = node.next;
                n1 = n1.next;

            }
            return n1;
        }
        return null;
    }
}
