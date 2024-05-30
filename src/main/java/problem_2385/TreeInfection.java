package problem_2385;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class TreeInfection {
    public static void main(String[] args) {
        TreeNode treeNode = new TreeNode(989);
        treeNode.left = new TreeNode(7);
        treeNode.right = new TreeNode(10250);
        treeNode.right.left = new TreeNode(98693);
        treeNode.right.right = new TreeNode(-89388);
        treeNode.right.right.right = new TreeNode(-32127);
        TreeInfection treeInfection = new TreeInfection();
        System.out.println(treeInfection.amountOfTime(treeNode, 10250));
    }

    public int amountOfTime(TreeNode root, int start) {

            Map<Integer, List<Integer>> map = new HashMap<>();

            createGraph(root, map);
            return bfs(map,start);
    }


    private void createGraph(TreeNode treeNode, Map<Integer, List<Integer>> adjList) {


        adjList.putIfAbsent(treeNode.val, new ArrayList<>());
        if (treeNode.left != null) {
            adjList.get(treeNode.val).add(treeNode.left.val);
            adjList.putIfAbsent(treeNode.left.val, new ArrayList<>());
            adjList.get(treeNode.left.val).add(treeNode.val);
            createGraph(treeNode.left,adjList);
        }
        if (treeNode.right != null) {
            adjList.get(treeNode.val).add(treeNode.right.val);
            adjList.putIfAbsent(treeNode.right.val, new ArrayList<>());
            adjList.get(treeNode.right.val).add(treeNode.val);
            createGraph(treeNode.right,adjList);
        }

    }
    public int bfs(Map<Integer,List<Integer>> listMap,int start){
        Queue<Integer> queue=new LinkedList<>();
        queue.add(start);
        Set<Integer> set=new HashSet<>();
        set.add(start);
        int level=0;
        while (!queue.isEmpty()){
            int N=queue.size();
            while (N>0) {
                int u = queue.remove();
                for (int i=0;i<listMap.get(u).size();i++){
                    if (!set.contains(listMap.get(u).get(i))){
                        queue.add(listMap.get(u).get(i));
                        set.add(listMap.get(u).get(i));
                    }
                }

                N--;
            }
            level++;

        }
        return level-1;
    }

    int result=0;
    public int amountOfTimeother(TreeNode root, int start) {
        while (root==null){
            return 0;
        }

        int lHeight=amountOfTimeother(root.left,start);
        int rHeight=amountOfTimeother(root.right,start);
        if (root.val==start){
          result=Math.max(lHeight,rHeight);
          return -1;
        }
        else if (lHeight>=0 && rHeight>=0){
            return lHeight+rHeight+1;
        }
        else {
            result=Math.max(result,Math.abs(lHeight)+Math.abs(rHeight));
            return Math.min(lHeight,rHeight)-1;
        }
    }
}
