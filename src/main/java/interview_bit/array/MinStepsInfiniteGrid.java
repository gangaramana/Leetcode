package interview_bit.array;

import java.util.ArrayList;
import java.util.List;

public class MinStepsInfiniteGrid {
    public static void main(String[] args) {

    }

    public int coverPoints(ArrayList<Integer> A, ArrayList<Integer> B) {
        int minDistance = 0;
        for (int i = 0; i < A.size() - 1; i++) {
            minDistance = Math.max(Math.abs(A.get(i) - A.get(i + 1)), Math.abs(B.get(i) - B.get(i + 1))) + minDistance;
        }
        return minDistance;

    }

    public int maxSubArray(final List<Integer> A) {
        int max_so_far = Integer.MIN_VALUE, max_ending_here = 0;
        for (int i = 0; i < A.size(); i++) {
            max_ending_here = max_ending_here + A.get(i);
            if (max_ending_here > max_so_far) {
                max_so_far = max_ending_here;
            }
            if (max_ending_here < 0) {
                max_ending_here = 0;
            }

        }
        return max_so_far;
    }
}
