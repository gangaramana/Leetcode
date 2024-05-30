package back_tracking;

import java.util.ArrayList;

public class DiceRolling {
    public static void main(String[] args) {
        DiceRolling diceRolling = new DiceRolling();
        diceRolling.dice(3, 7);
    }

    public void dice(int noOfdices, int sum) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        diceHelper(noOfdices, arrayList, sum, 0);
    }

    public void diceHelper(int dicesCount, ArrayList<Integer> res, int desiredSum, int presentSum) {
        if (dicesCount == 0) {
            System.out.println(res);
        } else {
            for (int i = 1; i <= 6; i++) {
                if (presentSum + i + 1 * (dicesCount - 1) <= desiredSum && presentSum + i + 6 * (dicesCount - 1) >= desiredSum) {
                    res.add(i);
                    diceHelper(dicesCount - 1, res, desiredSum, presentSum+i);
                    boolean b = res.remove((Integer) i);
                }
            }
        }

    }
}
