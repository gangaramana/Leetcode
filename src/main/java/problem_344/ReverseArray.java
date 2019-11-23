package problem_344;

public class ReverseArray {
    public static void main(String[] args) {
        ReverseArray r = new ReverseArray();
        r.reverseString(new char[]{'r', 'a', 'm', 'a', 'n'});

    }

    public void reverseString(char[] s) {
        int len = s.length;
        char tmp;
        for (int i = 0; i < len / 2; i++) {
            tmp = s[i];
            s[i] = s[len - 1 - i];
            s[len - 1 - i] = tmp;
        }


    }
}
