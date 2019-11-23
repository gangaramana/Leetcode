package problem_974;

public class SubarraysSumByK {
    public static void main(String[] args) {
        SubarraysSumByK subarraysSumByK = new SubarraysSumByK();
//        int res = subarraysSumByK.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5);
        int res = subarraysSumByK.subarraysDivByK_solution(new int[]{4, 5, 0, -2, -3, 1}, 5);
//        System.out.println(res);
    }

//    public int subarraysDivByK(int[] A, int K) {
//        int[] count = new int[A.length + 1];
//        int[] sumA = new int[A.length + 1];
//        for (int i = 1; i <= A.length; i++) {
//            sumA[i] = sumA[i - 1] + A[i - 1];
//        }
//
//        for (int i = 1; i <= A.length; i++) {
//            int res = 0;
//            int sum = sumA[i];
//
////            for (int j = 0; j < i; j++) {
////                sum = sum + A[j];
////            }
////            if (sum % K == 0) {
////                res++;
////            }
//            for (int k = 0; k < i; k++) {
//                if (sum % K == 0) {
//                    res++;
//                }
//                sum = sum - A[k];
//
//
//                count[i] = count[i - 1] + res;
//            }
//        }
//        return count[A.length];
//    }

    public int subarraysDivByK_solution(int[] A, int K) {
        int N = A.length;
        int[] P = new int[N + 1];
        for (int i = 0; i < N; ++i)
            P[i + 1] = P[i] + A[i];

        int[] count = new int[K];
        for (int x : P)
            count[(x % K + K) % K]++;

        int ans = 0;
        for (int v : count)
            ans += v * (v - 1) / 2;
        return ans;
    }
}
