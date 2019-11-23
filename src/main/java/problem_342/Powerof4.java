package problem_342;

public class Powerof4 {
    public static void main(String[] args) {
        Powerof4 powerof4 = new Powerof4();
        System.out.println(powerof4.isPowerOfFour(-2147483648));
    }

    public boolean isPowerOfFour(int num) {
        if (num == 0) {
            return true;
        } else if (num > 0) {

            Double d = Math.log10(num) / Math.log10(4);
            boolean b = (int) Math.ceil(d) == (int) Math.floor(d) ? true : false;
//        System.out.println(d);
            return b;
        } else {
            return false;
        }

    }
}
