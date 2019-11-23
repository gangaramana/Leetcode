package right_side_199;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int x) {
        val = x;
    }
}

public class RightSide {
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
        RightSide rightSide = new RightSide();
        System.out.println( rightSide.rightSideView(null));
    }

    public List<Integer> rightSideView(TreeNode root) {
        HashMap<Integer, Integer> resultMap = new HashMap<>();
        List<Integer> li=new ArrayList<>();
        dfs(resultMap, root, 0);
//        System.out.println(resultMap);
        for (Map.Entry<Integer,Integer> entry:resultMap.entrySet()){
            li.add(entry.getValue());

        }
        return li;

    }

    private void dfs(HashMap<Integer, Integer> hashMap, TreeNode node, int key) {
        if (node != null) {
            dfs(hashMap, node.left, key + 1);
            hashMap.put(key, node.val);
            dfs(hashMap, node.right, key + 1);
        }
    }
}
