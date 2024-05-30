package google.cracking_the_coding.factorial;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Factorial {
    public static void main(String[] args) {
//        Factorial factorial=new Factorial();
//        List<Integer> res=factorial.factorial(10);
//        for (int i=0;i<res.size();i++){
//            System.out.print(res.get(i));
//        }

        String inputString = "https://iaas.us-ashburn-1.oraclecloud.com";
        Pattern pattern = Pattern.compile("(https://iaas\\.)us-ashburn-1(\\.oraclecloud\\.com)");
        Matcher matcher = pattern.matcher(inputString);
        System.out.println(matcher.replaceAll("$1"+"uk-london-1"+"$2"));
    }
    public List<Integer> factorial(int N){
        List<Integer> res=new ArrayList<Integer>();
        res.add(1);
        for(int i=2;i<=N;i++){
            calculate(res,i);
        }
        return res;
    }

    private void calculate(List<Integer> list, int N){
        int carry=0,sum=0;
        for(int i=list.size()-1;i>=0;i--){
            sum=N*list.get(i)+carry;
            int next=sum%10;
            carry=sum/10;
            list.set(i,next);
        }
        while(carry>0){
             sum=carry%10;
            carry=carry/10;
            list.add(0,sum);
        }
    }

}
