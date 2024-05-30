package google.cracking_the_coding.DSU_cycle;

import java.util.ArrayList;
import java.util.Arrays;

public class DSUcycle {


    public int detectCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        int[] parent = new int[V];
        int[] rank = new int[V];
        for (int i = 0; i < V; i++) {
            parent[i] = i;
        }
        Arrays.fill(rank, 0);
        for (int i = 0; i < V; i++) {
            for (int k : adj.get(i)) {
                if (i < k) {
                    if (union(i, k, parent, rank)) {
                        return 1;
                    }
                }
            }
        }
        return 0;
    }

    public int find(int x, int[] parent) {

        if (x == parent[x]) {
            return x;
        }

        parent[x] = find(parent[x], parent);
        return parent[x];

    }

    public boolean union(int u, int v, int[] parent, int[] rank) {

        int parentU = find(u, parent);
        int parentV = find(v, parent);
        if (parentU == parentV) {
            return true;
        }
        if (rank[parentU] > rank[parentV]) {
            parent[parentV] = parentU;
        } else if (rank[parentU] < rank[parentV]) {
            parent[parentU] = parentV;
        } else {
            parent[parentU] = parentV;
            rank[parentV]++;
        }
        return false;

    }


}

