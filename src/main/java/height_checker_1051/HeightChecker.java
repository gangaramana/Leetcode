package height_checker_1051;

import java.util.ArrayList;
import java.util.Arrays;

public class HeightChecker {
    public static void main(String[] args) {
        HeightChecker heightChecker = new HeightChecker();
        int x=heightChecker.heightChecker(new int[]{});
        System.out.println(x);

    }

    public int heightChecker(int[] heights) {
        int[] result = Arrays.copyOf(heights, heights.length);
        Arrays.sort(result);
        int solution = 0;
        for (int i = 0; i < heights.length; i++) {
            if (result[i] != heights[i]) {
                solution++;
            }
        }
        return solution;
    }
}
