package cracking_the_coding_interview.LinkedLists;

public class PartitionList {
    public static void main(String[] args) {
        Node node = new Node(3);
        node.next = new Node(5);
        node.next.next = new Node(8);
        node.next.next.next = new Node(5);
        node.next.next.next.next = new Node(10);
        node.next.next.next.next.next = new Node(2);
        node.next.next.next.next.next.next = new Node(1);
        Node res = partition(node, 5);
        while (res != null) {
            System.out.println(res.data);
            res = res.next;
        }
    }

    static Node partition(Node node, int index) {
        Node head = null;
        Node end = null;
        Node indexNode = null;
        Node next = node;
        Node starting = null;
        Node ending = null;
        while (node != null) {
            next = node.next;
            if (node.data > index) {
                if (ending == null) {
                    end = node;
                    ending = node;
                    ending.next = null;
                } else {
                    end.next = node;
                    end = end.next;
                }
            } else if (node.data < index) {
                if (starting == null) {
                    starting = node;
                    head = node;
                } else {
                    head.next = node;
                    head = head.next;
                }

            } else {
                indexNode = node;
                node.next=null;
                indexNode.next = ending;
                ending = indexNode;
                end = ending;
            }
            node = next;
        }
        head.next = indexNode;
        indexNode.next = ending;

        return starting;
    }
}
