package problem_1005;

public class MaxAfterKNegotiations {
    public static void main(String[] args) {
        MaxAfterKNegotiations maxAfterKNegotiations = new MaxAfterKNegotiations();
       int result= maxAfterKNegotiations.largestSumAfterKNegations(new int[]{4,2,3}, 3);
        System.out.println(result);
    }

    public int largestSumAfterKNegations(int[] A, int K) {
        while (K != 0) {
            K--;
            int min = A[0];
            int index = 0;
            for (int i = 1; i < A.length; i++) {
                if (min > A[i]) {
                    min = A[i];
                    index = i;
                }

            }
            A[index] = A[index] * -1;
        }
        int sum = 0;
        for (int k : A) {
            sum = sum + k;
        }
        return sum;
    }
}
