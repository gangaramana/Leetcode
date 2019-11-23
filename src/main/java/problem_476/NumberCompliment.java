package problem_476;

public class NumberCompliment {
    public static void main(String[] args) {
        NumberCompliment compliment = new NumberCompliment();
        compliment.findComplement(16);
//        System.out.println(1<<0 );
    }

    public int findComplement(int num) {
        int i = 31;
        while (i >= 0) {
            int k = num & 1 << i;
            if (k > 0) {
                break;
            }
            i--;
        }
        while (i >= 0) {
            int k = num & 1 << i;
            if (k > 0) {
                num = num & ~(1 << i);
            } else {
                num = num | 1 << i;

            }
            i--;
        }
//        System.out.println(num);
        return num;
    }
}
