package gcd_of_strings_1071;

public class GcdOfStrings {
    public static void main(String[] args) {
        GcdOfStrings gcdOfStrings = new GcdOfStrings();
        gcdOfStrings.gcdOfStrings("ABCABC", "ABC");
    }

    public String gcdOfStrings(String str1, String str2) {
        String[] v = str1.split("A");
        for (String t : v) {
            System.out.println(t);
        }
        System.out.println(v.length);

        return null;
    }
}
