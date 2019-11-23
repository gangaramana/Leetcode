package problem_922;

public class SortArrayParityII {
    public static void main(String[] args) {
        SortArrayParityII sortArrayParityII = new SortArrayParityII();
        int[] a = sortArrayParityII.sortArrayByParityII(new int[]{4, 2, 5, 7});
        for (int k : a) {
            System.out.print(k + " ,");
        }

    }

    public int[] sortArrayByParityII(int[] A) {
        int even = 0, odd = 1, len = A.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            if (A[i] % 2 == 0) {
                result[even] = A[i];
                even = even + 2;
            } else {
                result[odd] = A[i];
                odd = odd + 2;
            }
        }
        return result;
    }
}
