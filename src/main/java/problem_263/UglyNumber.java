package problem_263;

public class UglyNumber {
    public static void main(String[] args) {
        UglyNumber uglyNumber = new UglyNumber();
        boolean k=uglyNumber.isUgly(6);
        System.out.println(k);

    }

    public boolean isUgly(int num) {
        if (num % 2 == 0) {
            return true;
        }
        if (num % 3 == 0) {
            return true;
        }
        if (num % 5 == 0) {
            return true;
        }
        return false;
    }
}
