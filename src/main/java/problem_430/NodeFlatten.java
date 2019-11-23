package problem_430;

class Node {
    public int val;
    public Node prev;
    public Node next;
    public Node child;

    public Node() {
    }

    public Node(int _val, Node _prev, Node _next, Node _child) {
        val = _val;
        prev = _prev;
        next = _next;
        child = _child;
    }
};

public class NodeFlatten {
    public static void main(String[] args) {
        Node head = new Node(1, null, null, null);
        Node child1 = new Node(2, null, null, null);
        head.child = child1;

        Node child2 = new Node(3, null, null, null);
        child1.child = child2;
        Node child3 = new Node(4, null, null, null);
        child2.child = child3;
        Node child4 = new Node(5, null, null, null);
        child3.child = child4;
//        head.next.next.next.next.next = new Node(6, head.next.next.next.next, null, null);
//        Node child = new Node(7, null, null, null);
//        child.next = new Node(8, child, null, null);
//        child.next.next = new Node(9, child.next, null, null);
//        child.next.next.next = new Node(10, child.next.next, null, null);
//        Node childChild = new Node(11, null, null, null);
//        childChild.next = new Node(12, childChild, null, null);
////        childChild.next.next = new Node(9, childChild.next, null, null);
//        head.child = child;
//        child.child = childChild;
//        Node childChildChild = new Node(100, null, null, null);
//        childChild.child = childChildChild;
//        childChildChild.child = new Node(1212, null, null, null);

        NodeFlatten nodeFlatten = new NodeFlatten();
        nodeFlatten.flatten(null);

        Node h = head;
        while (h != null) {
            System.out.print(h.val + " ");
            h = h.next;
        }
    }

    public Node flatten(Node head) {
        if (head != null) {
            traverse(head);
        }
        return head;
    }

    public Node traverse(Node head) {
        Node t = head;
        while (t.child != null || t.next != null) {
            if (t.child != null) {
                Node afterNull = t.next;
                t.next = t.child;
                Node childNode = t.child;
                t.child.prev = t;
                t.child = null;
                Node p = traverse(childNode);
                if (afterNull != null) {
                    p.next = afterNull;
                    afterNull.prev = p;
                }

            } else {
                t = t.next;
            }
        }
        return t;
    }
}
