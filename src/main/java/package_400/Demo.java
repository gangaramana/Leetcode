package package_400;

public class Demo {
    public int findNthDigit(int n) {
        if (n <= 9) {
            return n;
        } else if (n > 9 && n <= 189) {
            int no = n - 9;
            if (no % 2 == 0) {
                no = no / 2 + 9;
                System.out.println(no);
                return no % 10;
            } else {
                no = no / 2 + 10;
                System.out.println(no);
                return no / 10;
            }

        } else if (n > 189 && n <= 2889) {
            int no = n - 189;
            if (no % 3 == 0) {
                no = no / 3 + 90 + 9;

                System.out.println(no);
                return no % 10;
            } else if (no % 3 == 2) {
                no = no / 3 + 90 + 9 + 1;
                System.out.println(no);
                // no = no % 100;

                return (no % 100) / 10;
            } else {
                no = no / 3 + 90 + 9 + 1;
                System.out.println(no);
                System.out.println(no / 100);
                return no / 100;
            }
        } else if (n > 2889 && n <= 34889) {
            int no = n - 2889;
            if (no % 4 == 0) {
                no = no / 4 + 900 + 90 + 9;
                System.out.println(no);
                return no % 10;
            } else if (no % 4 == 3) {
                no = no / 4 + 900 + 90 + 9 + 1;
                System.out.println(no);
                return (no % 100) / 10;
            } else if (no % 4 == 2) {
                no = no / 4 + 900 + 90 + 9 + 1;
                return (no % 1000) / 100;
            } else {
                no = no / 4 + 900 + 90 + 9 + 1;
                System.out.println(no);
                return no / 1000;
            }

        } else {
            {
                int no = n - 34489;
                if (no % 5 == 0) {
                    no = no / 5 + 9000 + 900 + 90 + 9;
                    System.out.println(no);
                    return no % 10;
                } else if (no % 5 == 4) {
                    no = no / 5 + 9000 + 900 + 90 + 9 + 1;
                    System.out.println(no);
                    return (no % 100) / 10;
                } else if (no % 5 == 3) {
                    no = no / 5 + 9000 + 900 + 90 + 9 + 1;
                    return (no % 1000) / 100;
                } else if (no % 5 == 2) {
                    no = no / 4 + 900 + 90 + 9 + 1;
                    System.out.println(no);
                    return (no % 10000) / 1000;
                } else {
                    return (no / 10000);
                }

            }
        }
    }

    public static void main(String[] args) {
        Demo demo = new Demo();
        int x=demo.findNthDigit(171);
        System.out.println(x);
    }
}
