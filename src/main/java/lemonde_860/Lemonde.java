package lemonde_860;

import problem_872.LeafSimilarTree;

public class Lemonde {
    public static void main(String[] args) {
        Lemonde lemonde = new Lemonde();
        System.out.println(lemonde.lemonadeChange(new int[]{5, 5, 10, 20, 5, 5, 5, 5, 5, 5, 5, 5, 5, 10, 5, 5, 20, 5, 20, 5}));

    }

    public boolean lemonadeChange(int[] bills) {
        int fives = 0, tens = 0;
        for (int i = 0; i < bills.length; i++) {
            if (bills[i] == 5) {
                fives++;
            } else if (bills[i] == 10) {
                tens++;
                fives--;
            } else {

                if (tens > 0) {
                    tens--;
                    fives--;
                } else {
                    fives = fives - 3;
                }
            }
            if (tens < 0 || fives < 0) {
                return false;
            }

        }
        return true;

    }
}
