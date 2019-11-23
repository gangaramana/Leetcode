package problem_999;

//import java.util.Arrays;

public class AvailableCaptures {
    public static void main(String[] args) {
        AvailableCaptures availableCaptures = new AvailableCaptures();
        int x = availableCaptures.numRookCaptures(new char[][]{{'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'}, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'B', 'R', 'B', 'p', '.', '.'}, {'.', 'p', 'p', 'B', 'p', 'p', '.', '.'}, {'.', 'p', 'p', 'p', 'p', 'p', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}, {'.', '.', '.', '.', '.', '.', '.', '.'}});
        System.out.println(x);
    }


    public int numRookCaptures(char[][] board) {
        int x = -1, y = -1;

        outer:
        for (int i = 0; i < 8; i++) {
            for (int k = 0; k < 8; k++) {
                if (board[i][k] == 'R') {
                    x = i;
                    y = k;
                    break outer;
                }

            }
        }

        int[] a = new int[]{-1, -1, -1, -1, -1, -1, -1, -1};
        for (int l = 1; l < 8; l++) {
//            if (a[0] == -1) {
//                a[0] = check(board, x + l, y + l);
//            }
//            if (a[1] == -1) {
//                a[1] = check(board, x + l, y - l);
//            }
            if (a[2] == -1) {
                a[2] = check(board, x + l, y);
            }
//            if (a[3] == -1) {
//                a[3] = check(board, x - l, y - l);
//            }
//            if (a[4] == -1) {
//                a[4] = check(board, x - l, y + l);
//            }
            if (a[5] == -1) {
                a[5] = check(board, x - l, y);
            }
            if (a[6] == -1) {
                a[6] = check(board, x, y + l);
            }
            if (a[7] == -1) {
                a[7] = check(board, x, y - l);
            }

        }
        int resul = 8;
        for (int o : a) {
            if (o == -1) {
                resul = resul + o;
            }


        }
        return resul;
    }


    public int check(char[][] are, int m, int n) {
        if (m >= 0 && m < 8 && n < 8 && n >= 0 && are[m][n] == 'p') {
            return 0;
        } else if (m >= 0 && m < 8 && n < 8 && n >= 0 && are[m][n] == 'B') {
            return 2;
        }


        return -1;
    }
}


