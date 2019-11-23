package N_array_level_order_429;

import java.beans.IntrospectionException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Name {
    private Node node;
    private int height;

    public Node getNode() {
        return node;
    }

    public void setNode(Node node) {
        this.node = node;
    }

    public void setHeight(int height) {
        this.height = height;

    }

    public int getHeight() {
        return height;
    }

    public Name(Node node, int height) {
        this.node = node;
        this.height = height;
    }


}

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

public class NArrayLevelOrderTraversal {
    public static void main(String[] args) {
        List list = new ArrayList();
        List x = new ArrayList();
        List q = new ArrayList();
        List qq = new ArrayList();
        List po = new ArrayList();
        po.add(new Node(2175, new ArrayList<>()));
        qq.add(new Node(19909, new ArrayList<>()));
        q.add(new Node(7, qq));
        q.add(new Node(90, new ArrayList<>()));
        x.add(new Node(5, po));
        x.add(new Node(6, new ArrayList<>()));
        list.add(new Node(3, x));
        list.add(new Node(2, q));
        list.add(new Node(4, new ArrayList<>()));
        Node node = new Node(1, list);
        NArrayLevelOrderTraversal nArrayLevelOrderTraversal = new NArrayLevelOrderTraversal();
        System.out.println(nArrayLevelOrderTraversal.levelOrder(null));

    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> lists = new ArrayList<>();
        helper(root, 0, lists);
        return lists;
    }


    private void helper(Node root, int height, List<List<Integer>> lists) {
        if (root == null) {
            return;
        } else {
            List<Node> child = root.children;
            if (child != null) {
                for (int i = 0; i < child.size(); i++) {
                    helper(child.get(i), height + 1, lists);
                }
            }
            if (lists.size() <= height) {
                for (int k = lists.size(); k <= height ; k++) {
                    lists.add(new ArrayList<>());
                }

            }
            lists.get(height).add(root.val);
        }

    }

}
