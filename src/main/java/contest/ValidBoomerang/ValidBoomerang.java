package contest.ValidBoomerang;

import problem_20.ValidParenthesis;

public class ValidBoomerang {
    public static void main(String[] args) {
        ValidBoomerang validParenthesis = new ValidBoomerang();
        int[][] v = new int[][]{{0, 0}, {1, 1}, {1, 1}};
        boolean b = validParenthesis.isBoomerang(v);
        System.out.println(b);
    }

    public boolean isBoomerang(int[][] points) {
        if (points[0][0] == points[1][0]) {
            if (points[0][1] == points[1][1]) {
                return false;
            }
        }
            if (points[1][0] == points[2][0]) {
                if (points[1][1] == points[2][1]) {
                    return false;
                }
            }

        if (points[0][0] == points[2][0]) {
            if (points[0][1] == points[2][1]) {
                return false;
            }
        }

        float m1 = (float) (points[1][1] - points[0][1]) / (float) (points[1][0] - points[0][0]);
        float m2 = (float) (points[2][1] - points[1][1]) / (float) (points[2][0] - points[1][0]);
        if (m1 == m2) {
            return false;
        }
        return true;

    }
}
