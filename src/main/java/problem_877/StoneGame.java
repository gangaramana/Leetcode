package problem_877;

public class StoneGame {
    public static void main(String[] args) {
        StoneGame stoneGame = new StoneGame();
        boolean b = stoneGame.stoneGame(new int[]{3, 2, 10, 4});
        System.out.println(b);

    }

    public boolean stoneGame(int[] piles) {

        int alexSum = 0, leeSum = 0, start = 0, end = piles.length - 1;
        while (start <= end) {
            if (piles[start]>piles[end]){

            }

        }
        return false;

    }
}