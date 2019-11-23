package flower_planting_with_no_adjacent_1042;

import java.util.*;

public class FlowerNoAdjacent {
    public static void main(String[] args) {
        FlowerNoAdjacent flowerNoAdjacent = new FlowerNoAdjacent();
        int[] ress = flowerNoAdjacent.gardenNoAdj(10000, new int[][]{});
        for (int l : ress) {
            System.out.println(l);
        }
        System.out.println(ress.length);

    }

    public int[] gardenNoAdj(int N, int[][] paths) {
        Graph g = new Graph(N);
        for (int[] k : paths) {
            g.addEdge(k[0], k[1]);
        }
        return g.graphColr(4);

    }
}

class Graph {
    private int len;
    private int[][] adjMatrix;

    Graph(int len) {
        this.len = len;
        adjMatrix = new int[len][len];
    }

    public void addEdge(int source, int destination) {
        adjMatrix[source - 1][destination - 1] = 1;
        adjMatrix[destination - 1][source - 1] = 1;
    }


    public int[] graphColr(int noOfColors) {
        int[] color = new int[len];
        graphColrutil(4, color, 0);
        return color;
    }

    private boolean graphColrutil(int noOfcolors, int[] color, int vertice) {
        if (vertice == len) {
            return true;
        }
        for (int i = 1; i <= noOfcolors; i++) {
            if (isSafe(i, color, vertice)) {
                color[vertice] = i;
                if (graphColrutil(noOfcolors, color, vertice + 1)) {
                    return true;
                }
                color[vertice] = 0;
            }
        }
        return false;

    }

    private boolean isSafe(int presentColor, int[] color, int vertice) {
        for (int v = 0; v < len; v++) {
            if (adjMatrix[vertice][v] == 1 && presentColor == color[v]) {
                return false;
            }
        }
        return true;
    }
}
