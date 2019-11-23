package addition;

public class Addsix {
    public static void main(String[] args) {
        Addsix addsix = new Addsix();
        int res = addsix.add(new int[]{9, 1, 2, 6, 9, 6, 9, 5, 4, 6, 5, 9, 9,10});
        System.out.println(res);
    }

    private int add(int[] a) {
        boolean flag = true;
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 6) {
                flag = false;
                continue;
            } else if (a[i] == 9) {
                if (flag == false ) {
                    flag = true;
                    continue;
                }

            }
            if (flag) {
                sum = sum + a[i];
            }
        }
        return sum;
    }
}
