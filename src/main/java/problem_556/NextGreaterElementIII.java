package problem_556;

import java.util.Arrays;

public class NextGreaterElementIII {
    public static void main(String[] args) {
        NextGreaterElementIII nextGreaterElementIII = new NextGreaterElementIII();
        nextGreaterElementIII.nextGreaterElement(2444);
        char[] c = new char[]{'5', '1', '0', '1'};
        Arrays.sort(c);
        for (char v:c){
            System.out.println(v);
        }

//        System.out.println('1' - 48);
    }


    public int nextGreaterElement(int n) {
        String num = String.valueOf(n);
        char x = num.charAt(0);
//        System.out.println(Integer.valueOf(x + ""));
        return n;

    }
}
