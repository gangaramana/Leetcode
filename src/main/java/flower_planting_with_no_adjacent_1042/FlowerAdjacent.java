package flower_planting_with_no_adjacent_1042;
class Graph2 {
    private int len;
    private int[][] adjMatrix;

    Graph2(int len) {
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
public class FlowerAdjacent {
    public static void main(String[] args) {

    }

}
