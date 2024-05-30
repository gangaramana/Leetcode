package google.cracking_the_coding.problem_125;

public class Palindrome {
    public static void main(String[] args) {
        Palindrome p=new Palindrome();
        System.out.println(p.isPalindrome("race a car"));
    }

    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        int i=0,j=s.length()-1;
        while(i<j){
            while(s.charAt(i)-'a'<0 || 'a'-s.charAt(i)>26){
                i++;

            }
            while(s.charAt(j)-'a'<0 || 'a'-s.charAt(j)>26){
                j--;

            }
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;j--;

        }
        return true;
    }
}
