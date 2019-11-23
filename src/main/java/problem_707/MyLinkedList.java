package problem_707;


class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }


}

class MyLinkedList {
    Node head;
    int length;

    /**
     * Initialize your data structure here.
     */
    public MyLinkedList() {
        this.head = null;
        this.length = 0;

    }

    /**
     * Get the value of the index-th node in the linked list. If the index is invalid, return -1.
     */
    public int get(int index) {
        if (index >= length || index < 0) {
            return -1;
        }
        Node p = head;
        for (int i = 0; i < index; i++) {
            p = p.getNext();
        }
        return p.getData();
    }

    /**
     * Add a node of value val before the first element of the linked list. After the insertion, the new node will be the first node of the linked list.
     */
    public void addAtHead(int val) {
        if (this.head == null) {
            head = new Node(val);
            length++;
            return;
        }
        Node temp = new Node(val);
        temp.setNext(head);
        head = temp;
        length++;
        return;

    }

    /**
     * Append a node of value val to the last element of the linked list.
     */
    public void addAtTail(int val) {
        if (this.head == null) {
            head = new Node(val);
            length++;
            return;
        }
        Node p = head, q;
        while ((q = p.getNext()) != null) {
            p = q;
        }
        p.setNext(new Node(val));
        length++;
        return;

    }

    /**
     * Add a node of value val before the index-th node in the linked list. If index equals to the length of linked list, the node will be appended to the end of linked list. If index is greater than the length, the node will not be inserted.
     */
    public void addAtIndex(int index, int val) {
        if (index > length) {
            return;

        } else if (index == 0) {
            addAtHead(val);
            return;
        }

        Node p = head, q = head;
        for (int i = 0; i < index; i++) {
            p = q;
            q = p.getNext();

        }
        Node temp = new Node(val);
        p.setNext(temp);
        temp.setNext(q);
        length++;
        return;

    }

    /**
     * Delete the index-th node in the linked list, if the index is valid.
     */
    public void deleteAtIndex(int index) {
        Node p = head, q = head;
        if (index == 0) {
            deleteAtBegin();
            return;
        } else if (index >= length) {
            return;
        }
        for (int i = 0; i < index; i++) {
            p = q;
            q = p.getNext();
        }
        q = q.getNext();
        p.setNext(q);
        length--;
        return;

    }

    public void deleteAtBegin() {
        head = head.getNext();
        length--;
        return;

    }


    // return the middle of the list

    public Node middleNode(Node start) {
        int ll = 0;
        Node s = start;
        while (s != null) {
            s = s.next;
            ++ll;

        }
        System.out.println("length " + ll);

        int middle =ll/2 ;
//        System.out.println(middle);
        Node p = head, q = head;
        for (int k = 0; k < middle; k++) {
            p = q;
            q = p.getNext();
        }


        return  q;


    }
}


//
//["MyLinkedList","addAtHead","addAtIndex","get","get","get"]
//        [[],[1],[1,2],[1],[0],[2]]

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
