package problem_91;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Stack;

public class DecodeWays {
    public static void main(String[] args) {
        DecodeWays decodeWays = new DecodeWays();
        int res = decodeWays.numDecodings("1011");
        System.out.println(res);
        // Create a graph given in the above diagram
//        Graph g = new Graph(6);
//        g.addEdge(5, 2);
//        g.addEdge(5, 0);
//        g.addEdge(4, 0);
//        g.addEdge(4, 1);
//        g.addEdge(2, 3);
//        g.addEdge(3, 1);
//
//        System.out.println("Following is a Topological "
//                + "sort of the given graph");
//        // Function Call
//        g.topologicalSort();
    }
int[] memo=new int[101];

    public int numDecodings(String s) {
Arrays.fill(memo,-1);
//    return numDecodingsRec(0,s);
        return numDecodingDP(s);

}

    private int numDecodingsRec(int i,String s) {
        if (i==s.length()){
            return 1;
        }
        if (memo[i]!=-1){
            return memo[i];
        }
        if (s.charAt(i)== '0'){
            return 0;
        }
        int result=numDecodingsRec(i+1,s);
        if (i+1<s.length()&& (s.charAt(i)=='1'|| s.charAt(i)=='2'&& s.charAt(i+1)<='6')){
            result+=numDecodingsRec(i+2,s);

        }
        memo[i]=result;
        return result;
    }

    private int numDecodingDP(String s){
        int dp[]=new int[s.length()+1];
        dp[s.length()]=1;
        for (int i=s.length()-1;i>=0;i--) {
            if (s.charAt(i) == '0') {
                dp[i] = 0;
            } else {
                dp[i] = dp[i + 1];
                if (i + 1 < s.length() && (s.charAt(i) == '1' || s.charAt(i) == '2' && s.charAt(i + 1) <= '6')) {
                    dp[i] += dp[i + 2];
                }

            }
        }
        return dp[0];

    }

    }

// A Java program to print topological
// sorting of a DAG


// This class represents a directed graph
// using adjacency list representation
class Graph {
    // No. of vertices
    private int V;

    // Adjacency List as ArrayList of ArrayList's
    private ArrayList<ArrayList<Integer>> adj;

    // Constructor
    Graph(int v)
    {
        V = v;
        adj = new ArrayList<ArrayList<Integer> >(v);
        for (int i = 0; i < v; ++i)
            adj.add(new ArrayList<Integer>());
    }

    // Function to add an edge into the graph
    void addEdge(int v, int w) { adj.get(v).add(w); }

    // A recursive function used by topologicalSort
    void topologicalSortUtil(int v, boolean visited[],
                             Stack<Integer> stack)
    {
        // Mark the current node as visited.
        visited[v] = true;
        Integer i;

        // Recur for all the vertices adjacent
        // to thisvertex
        Iterator<Integer> it = adj.get(v).iterator();
        while (it.hasNext()) {
            i = it.next();
            if (!visited[i])
                topologicalSortUtil(i, visited, stack);
        }

        // Push current vertex to stack
        // which stores result
        stack.push(new Integer(v));
    }

    // The function to do Topological Sort.
    // It uses recursive topologicalSortUtil()
    void topologicalSort()
    {
        Stack<Integer> stack = new Stack<Integer>();

        // Mark all the vertices as not visited
        boolean visited[] = new boolean[V];
        for (int i = 0; i < V; i++)
            visited[i] = false;

        // Call the recursive helper
        // function to store
        // Topological Sort starting
        // from all vertices one by one
        for (int i = 0; i < V; i++)
            if (visited[i] == false)
                topologicalSortUtil(i, visited, stack);

        // Print contents of stack
        while (stack.empty() == false)
            System.out.print(stack.pop() + " ");
    }

    // Driver code
}
