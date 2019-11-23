package problem_707;

public class Check {
    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();
////        linkedList.deleteAtIndex(1);
////        linkedList.addAtHead(1);
////        linkedList.deleteAtIndex(0);
////        linkedList.deleteAtIndex(1);
//////        linkedList.addAtTail(3);
////        linkedList.addAtIndex(1, 2);  // linked list becomes 1->2->3
////        linkedList.get(1);            // returns 2
////
////        linkedList.get(0);
////        linkedList.get(2);
////        linkedList.get(11);
////        linkedList.deleteAtIndex(11);
//////        linkedList.deleteAtIndex(1);  // now the linked list is 1->3
////        System.out.println(linkedList.get(1));
//
        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
//        linkedList.deleteAtIndex(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.addAtTail(6);
        linkedList.addAtTail(7);
        linkedList.addAtTail(8);
        linkedList.addAtTail(9);
        linkedList.addAtTail(10);
        linkedList.addAtTail(11);
        linkedList.addAtTail(12);
        linkedList.addAtTail(13);
//        linkedList.addAtTail(14);
        linkedList.middleNode(linkedList.head);

        System.out.println(linkedList.middleNode(linkedList.head).data);


    }
}


//["MyLinkedList","addAtHead","addAtIndex","get","get","get"]
//        [[],[1],[1,2],[1],[0],[2]]