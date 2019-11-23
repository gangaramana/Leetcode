package problem_821;

public class ShortestDistance {
    public static void main(String[] args) {
        ShortestDistance s = new ShortestDistance();
        int[] jj = s.shortestToChar("baa", 'b');
        for (int i : jj) {
            System.out.println(i);
        }

    }

    public int[] shortestToChar(String S, char C) {
        int i = 0, k = 0, index = -1, p = Integer.MAX_VALUE, min = 0;
        int[] x = new int[S.length()];

        do {
            index = S.indexOf(C, index + 1);

            if (index != -1) {
                while (k <= index) {
                    x[k] = Math.min(Math.abs(p - k), Math.abs(index - k));
                    k++;
                }
                p = index;

            }
        } while (index != -1);
        while (k < S.length()) {
            x[k] = Math.abs(p - k);
            k++;
        }

//        System.out.println(index);


        return x;
    }
}
