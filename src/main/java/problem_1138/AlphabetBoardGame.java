package problem_1138;

public class AlphabetBoardGame {
    public static void main(String[] args) {
        AlphabetBoardGame alphabetBoardGame = new AlphabetBoardGame();
        String k = alphabetBoardGame.alphabetBoardPath("zrz");
        System.out.println(k);
    }

    public String alphabetBoardPath(String target) {
        StringBuilder stringBuilder = new StringBuilder();
        int i = 0, newI, j = 0, newJ;
        for (int c : target.toCharArray()) {
            newI = (c - 97) / 5;
            newJ = c - (97 + newI * 5);
            while (newJ > j) {
                stringBuilder.append('R');
                j++;
            }
            while (newJ < j) {
                stringBuilder.append('L');
                j--;
            }
            while (newI > i) {
                stringBuilder.append('D');
                i++;
            }
            while (newI < i) {
                stringBuilder.append('U');
                i--;
            }

            stringBuilder.append('!');

        }
        return stringBuilder.toString();

    }
}
