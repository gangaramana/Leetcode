package problem_1129;

class Graph {
    private int[][] adjlist;

    Graph(int v) {
        adjlist = new int[v][v];
    }

    public void addEdge(int src, int dest) {
        adjlist[src][dest] = 1;
    }
}

public class AlternatingColor {
    public static void main(String[] args) {

    }

    public int[] shortestAlternatingPaths(int n, int[][] red_edges, int[][] blue_edges) {
        Graph red = new Graph(n);
        for (int[] k : red_edges) {
            red.addEdge(k[0], k[1]);
        }
        Graph blue = new Graph(n);
        for (int[] l : blue_edges) {
            blue.addEdge(l[0], l[1]);
        }

        return null;
    }
}
