package problem_66;

public class PlusOne {
    public static void main(String[] args) {
        PlusOne one = new PlusOne();
        int[] c = new int[]{};
        int[] v = one.plusOne(c);
        for (int l : v) {
            System.out.print(l + " ");
        }
    }

    public int[] plusOne(int[] digits) {
        int len = digits.length - 1;
        boolean flag = true;
        while (len >= 0) {
            if (digits[len] == 9) {
                digits[len] = 0;
                len--;

            } else {
                digits[len] = digits[len] + 1;
                flag = false;
                break;
            }
        }
        if (flag) {
            int[] x = new int[digits.length + 1];
            x[0] = 1;
            return x;

        }
        return digits;

    }
}
