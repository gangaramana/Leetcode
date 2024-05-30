package cracking_the_coding_interview.LinkedLists;

import com.sun.glass.events.mac.NpapiEvent;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DeleteKthElement {
    public static void main(String[] args) {
        Node node = new Node(1);
        node.next = new Node(2);
        node.next.next = new Node(3);
        node.next.next.next = new Node(4);
        node.next.next.next.next = new Node(5);
        node.next.next.next.next.next = new Node(6);
        deleteK(node, 6);
        while(node!=null){
            System.out.println(node.data);
            node=node.next;
        }
    }

    public static int deleteK(Node node, int k) {
        if (node == null) {
            return 0;
        }
//        System.out.println(node.data);
        int index = deleteK(node.next, k) + 1;
        System.out.println(index+", "+node.data);
        if (index==k+1){
            node.next=node.next.next;
        }
        return index;
    }
}

