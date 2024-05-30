package google.cracking_the_coding.problem_990;

public class Satisfiability {

    public boolean equationsPossible(String[] equations) {

        int[] parent = new int[26];
        int[] rank = new int[26];
        for (int i = 0; i < 26; i++) {
            parent[i] = i;
            rank[i] = 0;
        }
        for (String s : equations) {

            if (s.charAt(1) == '=') {
                union(s.charAt(0) - 97, s.charAt(3) - 97, parent, rank);
            }
        }

        for (String s : equations) {

            if (s.charAt(1) == '!') {
                int parentU = find(s.charAt(0) - 97, parent);
                int parentV = find(s.charAt(3) - 97, parent);
                if (parentU == parentV) {
                    return false;
                }
            }
        }

        return true;
    }

    public int find(int x, int[] parent) {
        if (x == parent[x]) {
            return x;
        }
        parent[x] = find(parent[x], parent);
        return parent[x];
    }

    public void union(int u, int v, int[] parent, int[] rank) {

        int parentU = find(u, parent);
        int parentV = find(v, parent);
        if (rank[parentU] > rank[parentV]) {
            parent[parentV] = parentU;
        } else if (rank[parentU] < rank[parentV]) {
            parent[parentU] = parentV;
        } else {
            parent[parentU] = parentV;
            rank[parentV]++;
        }
    }

}

