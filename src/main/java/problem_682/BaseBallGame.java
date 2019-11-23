package problem_682;

import java.util.Stack;

public class BaseBallGame {
    public static void main(String[] args) {
        BaseBallGame ballGame = new BaseBallGame();
        System.out.println(ballGame.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"}));

    }

    public int calPoints(String[] ops) {
        Stack<Integer> integers = new Stack<Integer>();
        int sum = 0;
        for (String s : ops) {
            if (s.equalsIgnoreCase("C")) {
                if (!integers.isEmpty()) {
                    int no = integers.pop();
                    sum = sum - no;
                }

            } else if (s.equalsIgnoreCase("D")) {
                int no = integers.peek();
                int score = no * 2;
                integers.push(score);
                sum = sum + score;

            } else if (s.equalsIgnoreCase("+")) {
                int lastnum = integers.pop();
                int lastSecond = integers.peek();
                integers.push(lastnum);
                int score = lastnum + lastSecond;
                integers.push(score);
                sum = sum + score;

            } else {
                int score = Integer.valueOf(s);
                sum = sum + score;
                integers.push(score);


            }
        }
        return sum;

    }
}
