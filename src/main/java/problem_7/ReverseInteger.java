package problem_7;

public class ReverseInteger {
    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        int x = reverseInteger.reverse(-2147483648);
        System.out.println(x);

    }

    public int reverse(int x) {
//if (x==)
        if (x == -2147483648) {
            return 0;
        }
        long result = 0;
        int flag = 1;
        if (x < 0) {
            flag = flag * -1;

        }
        long no = x;
        while (no != 0) {

            long remainder = no % 10;
            result = result * 10 + remainder;
            no = no / 10;


        }
        if (flag == -1) {
            long res = (long) (result + Math.pow(2, 31));
            if (res > 0) {
                return 0;
            }
        } else {
            long res = (long) (result - Math.pow(2, 31) - 1);
            if (res > 0) {
                return 0;
            }
        }

        return (int) result;

    }
}
