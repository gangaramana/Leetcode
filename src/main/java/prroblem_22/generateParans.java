package prroblem_22;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class generateParans {
    public static void main(String[] args) {
generateParans generateParans=new generateParans();
        System.out.println(generateParans.generateParenthesis(3));
    }

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        generateParenthesis(n - 1, n, res, "(");
        return res;

    }

    private void generateParenthesis(int rightLen, int leftLen, List<String> list, String parans) {
        if (rightLen == 0 && leftLen == 0) {
            if(validateParans(parans)){
            list.add(parans);
            return;}
        }
        if (rightLen > 0) {
            generateParenthesis(rightLen - 1, leftLen, list, parans + "(");
        }
        if (leftLen > 0) {
            generateParenthesis(rightLen, leftLen - 1, list, parans + ")");
        }

    }

    private boolean validateParans(String parans) {
        Stack<Character> stack = new Stack<>();
        for (char c : parans.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else {
                if (stack.isEmpty() || stack.pop() != '(') {
                    return false;
                }
            }
        }
        return true;
    }
}
