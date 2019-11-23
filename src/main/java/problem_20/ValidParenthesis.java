package problem_20;

import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        String s = "(())[][{{}}]";

        ValidParenthesis validParenthesis = new ValidParenthesis();
        boolean b = validParenthesis.isValid(s);
        System.out.println(b);

    }

    public boolean isValid(String s) {
        if (s.length() % 2 == 0) {
            char[] c = s.toCharArray();
            Stack<Character> stack = new Stack<Character>();
            int i = 0;
            int len = c.length;
            boolean flag = true;
            while (i < len) {
                if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                    stack.push(c[i++]);
                } else if (c[i] == ')') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '(') {
                        stack.pop();
                        i++;
                    } else {
                        i++;
                    }
                } else if (c[i] == ']') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '[') {
                        stack.pop();
                        i++;
                    } else {
                        i++;
                    }
                } else if (c[i] == '}') {
                    if (stack.isEmpty()) {
                        return false;
                    }
                    if (stack.peek() == '{') {
                        stack.pop();
                        i++;
                    } else {
                        i++;
                    }
                } else {

//                i++;
                }
            }
            if (stack.isEmpty()) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }


}
