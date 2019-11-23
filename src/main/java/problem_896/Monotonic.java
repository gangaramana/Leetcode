package problem_896;

public class Monotonic {
    public static void main(String[] args) {

    }

    public boolean isMonotonic(int[] A) {
        int len = A.length;
        int k = 0;
        while (k < len-1) {
            if (A[k] >= A[k + 1]) {
                k++;
            } else {
                break;
            }

        }
        if (k == len - 1) {
            return true;
        }
        k = 0;
        while (k < len-1) {
            if (A[k] <= A[k + 1]) {
                k++;
            } else {
                return false;
            }
        }
        return true;
    }
}
