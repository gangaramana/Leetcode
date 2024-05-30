package problem_338;

public class CountBits {
    public static void main(String[] args) {
        CountBits countBits = new CountBits();
        int[] res = countBits.countBits(300);
        for (int k : res) {
            System.out.print(k + " ");
        }
    }

    public int[] countBits(int num) {
        if (num == 0) {
            return new int[]{0};
        }
        int[] res = new int[num + 1];
        res[0] = 0;
        res[1] = 1;
        for (int i = 2; i <= num; i++) {
            if (i % 2 == 0) {
                res[i] = res[i / 2];
            } else {
                res[i] = res[i / 2] + 1;
            }
        }
        return res;
    }
}
