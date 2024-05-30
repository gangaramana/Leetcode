package cracking_the_coding_interview.LinkedLists;

import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Node n1 = new Node(1);
        n1.next = new Node(2);
        n1.next.next = new Node(3);
        n1.next.next.next = new Node(3);
        n1.next.next.next.next = new Node(2);
        n1.next.next.next.next.next = new Node(5);
        System.out.println(palindrome(n1));
    }

    static boolean palindrome(Node node) {
        Node n2 = node;
        int length = 0;
        Stack<Integer> stack = new Stack<>();
        while (n2 != null) {
            length++;
            n2 = n2.next;
        }
        for (int i = 0; i < length / 2; i++) {
            stack.push(node.data);
            node = node.next;
        }
        if (!(length % 2 == 0)) {
            node = node.next;
            length--;
        }
        for (int i = length / 2; i < length; i++) {
            if (!stack.pop().equals(node.data)) {
                return false;
            }
            node = node.next;
        }
        return true;
    }
}
