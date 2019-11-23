package problem_559;

import problem_53.MaximumSubarray;

import java.util.*;

class Node {
    public int val;
    public List<Node> children;

    public Node() {
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
};

public class MaximunDepthNarrayTree {
    public static void main(String[] args) {
        List list = new ArrayList();
        List x = new ArrayList();
        List q = new ArrayList();
//        q.add(new Node(7, null));
        x.add(new Node(5, new ArrayList<>()));
        x.add(new Node(6, new ArrayList<>()));
        list.add(new Node(3, x));
        list.add(new Node(2, new ArrayList<>()));
        list.add(new Node(4, new ArrayList<>()));
        Node node = new Node(1, list);
        MaximunDepthNarrayTree maximunDepthNarrayTree = new MaximunDepthNarrayTree();
        int y = maximunDepthNarrayTree.maxDepth(null);
        System.out.println(y);

    }

    int max = 0;

    public int maxDepth(Node root) {
        if (root == null) {
            return 0;
        } else if (root.children.size() == 0) {
            return 1;
        } else {
            ArrayList<Node> nodes = (ArrayList<Node>) root.children;
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
            for (int i = 0; i < nodes.size(); i++) {
                priorityQueue.add(maxDepth(nodes.get(i)) + 1);
            }
            return priorityQueue.peek();
        }
    }


}
