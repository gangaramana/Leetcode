package google.cracking_the_coding.problem_131;

import google.cracking_the_coding.problem_125.Palindrome;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PalindromeSubstring {
    List<List<String>> result;
    public static void main(String[] args) {
        PalindromeSubstring palindromeSubstring=new PalindromeSubstring();
        System.out.println(palindromeSubstring.partition("aabb"));
    }
    public List<List<String>> partition(String s) {
        result=new ArrayList();
        helper(s,0,"",new Stack());
        return result;
    }

    private void helper(String s,int count,String res,Stack<String> stack){
        System.out.println(res);

        if(count==s.length()){

            result.add(new ArrayList(stack));
        }
        for(int i=count;i<s.length();i++){
            if(palindrome(s.substring(count,i+1))) {
                stack.push(s.substring(count,i+1));
                helper(s, i + 1, s.substring(count, i + 1), stack);
                stack.pop();
            }

        }
    }

    private boolean palindrome(String s){
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }

        }
        return true;
    }

}
