package package_400;

public class Nthdigit {
    public static void main(String[] args) {
        Nthdigit nthdigit = new Nthdigit();
        int x = nthdigit.findNthDigit(3448905);
        System.out.println("  x  " + x);

    }

    public int findNthDigit(int n) {
        if (n > 9) {
            int c = 0;
            double res = 0;
            while (res < n) {
                c++;
                res = res + 9 * Math.pow(10, c - 1) * c;
            }
//            System.out.println("sum     :"+sum);
            int temp = c;
             res = n;
            while (c >= 2) {
                res = res - 9 * (Math.pow(10, c - 2)) * (c - 1);
//                System.out.println("internal res  " + res);
                c--;
            }
//            System.out.println("res   " + res);
            c = temp;
            int p = (int) (res % c);
            res = (int) Math.ceil(res / c);
            double no = res;

            while (c >= 2) {
                no = no + 9 * Math.pow(10, c - 2);
                c--;
            }

            System.out.println(no);
            String x = String.valueOf((int)no);
            System.out.println("cccc   "+x);
            if (p == 0) {
                return x.charAt(x.length() - 1)-'0';
            } else {
//                String k =""+x.charAt(p-1);
                return x.charAt(p-1)-'0';

            }
//            if (p == 0) {
//                return (int) no / 10;
//            }
//            return (int) ((no % Math.pow(10, temp - 1 - p)) / Math.pow(10, temp - 2 - p));

//            System.out.println(sum);

        } else {
            return n;
        }
    }
}
