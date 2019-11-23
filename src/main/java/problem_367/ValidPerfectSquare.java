package problem_367;

public class ValidPerfectSquare {
    public static void main(String[] args) {
        ValidPerfectSquare validPerfectSquare = new ValidPerfectSquare();
        boolean b=validPerfectSquare.isPerfectSquare(2147483647);
        System.out.println(b);

    }

    public boolean isPerfectSquare(int num) {

        int start = 1, end = num;
        long middle;
        long k;
        while (start <= end) {
            middle = (start + end) / 2;
            k = middle * middle;
            if (k == num) {
                return true;
            } else if (k > num) {
                end =(int) middle - 1;
            } else {
                start =(int) middle + 1;
            }
        }
        return false;
    }
}
