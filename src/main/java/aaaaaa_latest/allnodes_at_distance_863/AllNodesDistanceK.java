package allnodes_at_distance_863;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class AllNodesDistanceK {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(0);
        root.left.right = new TreeNode(8);
        root.right = new TreeNode(5);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(2);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(4);
        AllNodesDistanceK allNodesDistanceK = new AllNodesDistanceK();
        System.out.println(allNodesDistanceK.distanceK(root, root, 2));


    }

    public List<Integer> distanceK(TreeNode root, TreeNode target, int K) {
        HashMap<Integer, ArrayList<Integer>> rootLeft = new HashMap<>();
        int leftresult = -1, rightResult = -1;
        boolean b = false;
        HashMap<Integer, ArrayList<Integer>> foundList;
        HashMap<Integer, ArrayList<Integer>> notFound;
        HashMap<Integer, ArrayList<Integer>> right = new HashMap<>();
        int resultIndex;
        if (root != null) {

            rootLeft.put(0, new ArrayList<Integer>());

            rootLeft.get(0).add(root.val);
            leftresult = traversal(root.left, rootLeft, 1, target.val);

            rightResult = traversal(root.right, right, 1, target.val);
        }
        if (root.val == target.val) {
            leftresult = 0;
        }

        if (rightResult == -1) {
            foundList = rootLeft;
            notFound = right;
            resultIndex = leftresult;
        } else {
            foundList = right;
            notFound = rootLeft;
            resultIndex = rightResult;
        }
        ArrayList<Integer> res = foundList.getOrDefault(resultIndex + K, new ArrayList<Integer>());
        res.addAll(notFound.getOrDefault(K - resultIndex, new ArrayList<Integer>()));
        return res;

    }

    private int traversal(TreeNode node, HashMap<Integer, ArrayList<Integer>> hashMap, int key, int target) {
        int res = -1;
        if (node != null) {
            res = traversal(node.left, hashMap, key + 1, target);
            if (!hashMap.containsKey(key)) {
                hashMap.put(key, new ArrayList<Integer>());
            }
            hashMap.get(key).add(node.val);
            res = traversal(node.right, hashMap, key + 1, target);
            if (node.val == target) {
                res = key;
            }

        }
        return res;

    }
}
