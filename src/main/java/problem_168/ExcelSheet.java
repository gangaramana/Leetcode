package problem_168;

import java.util.Stack;

public class ExcelSheet {
    public static void main(String[] args) {
        ExcelSheet excelSheet = new ExcelSheet();
        String x = excelSheet.convertToTitle(706);
        System.out.println(x);

    }

    public String convertToTitle(int n) {
        Stack<Integer> stack = new Stack<Integer>();
        String res = "";
        int remainder = 0, no = n;
        if (no % 26 == 0) {
            remainder = 26;
            no = no - 26;
        } else {
            remainder = no % 26;
            no = no - remainder;
        }
        if (no == 26) {
            stack.add(1);
        }
        while (no > 26) {
            no = no / 26;
            int x = no % 26 == 0 ? 26 : no % 26;
            stack.add(x);
        }
        while (!stack.isEmpty()) {
            int c = stack.pop() + 64;
            res = res + (char) c;
        }
        return res + (char) (64 + remainder);
    }
}
