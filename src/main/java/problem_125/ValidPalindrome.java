package problem_125;

public class ValidPalindrome {
    public static void main(String[] args) {
        ValidPalindrome validPalindrome = new ValidPalindrome();
       boolean b= validPalindrome.isPalindrome("race e car +-=-__");

        System.out.println("result is  : "+b);

    }

    public boolean isPalindrome(String s) {
        s = s.replaceAll("\\W+", "").replaceAll("_", "").toLowerCase();
//        System.out.println(s);
        int length = s.length();
        char [] chars=s.toCharArray();
//        System.out.println("length ::"+length);

        int i = 0, reverseLen = length-1;
        while (i <= length / 2 && reverseLen >= length / 2) {
            if (chars[i++] != chars[reverseLen--]) {
                return false;
            }
        }
        return true;

    }
}
