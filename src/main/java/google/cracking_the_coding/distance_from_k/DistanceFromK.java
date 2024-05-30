package google.cracking_the_coding.distance_from_k;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Node
 {
     int data;
     Node left, right;

     public Node(int d)
     {
         data = d;
         left = right = null;
     }
 }

public  class DistanceFromK
{
    public static void main(String[] args) {
        Node node=new Node(1);
        node.left=new Node(2);
        node.right=new Node(3);
        node.left.left=new Node(4);
        node.left.right=new Node(5);
        node.right.left=new Node(6);
        node.right.right=new Node(7);
        node.right.left.right=new Node(8);
        DistanceFromK distanceFromK=new DistanceFromK();
        System.out.println(distanceFromK.printKDistantfromLeaf(node,2));
    }
    //Function to return count of nodes at a given distance from leaf nodes.
    int printKDistantfromLeaf(Node root, int k) {
        Set<Node> result=new HashSet();
        printKDistant(root, k,new ArrayList<Node>(),result);
        return result.size();
    }

    void printKDistant(Node root, int k, List<Node> path, Set<Node> result){
        if(root==null){
            return;
        }
        path.add(root);
        printKDistant(root.right, k,path,result);
        printKDistant(root.left, k,path,result);
        if(root.left ==null && root.right==null && path.size()>k){

            result.add(path.get(path.size()-k-1));

        }

        path.remove(path.size()-1);
    }
}

