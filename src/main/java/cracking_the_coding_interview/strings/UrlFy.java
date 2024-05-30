package cracking_the_coding_interview.strings;

import java.util.Arrays;

public class UrlFy {
    public static void main(String[] args) {
        char[] urll = new char[]{'M', 'r',' ', ' ', 'J', 'O', 'H', 'N', ' ', 's', 'm', 'i', 't', 'h', ' ', ' ', ' ', ' ',' ',' '};
        System.out.println(urll);
        urlFly(urll);
        System.out.println(urll);
    }

    public static void urlFly(char[] url) {
        int lengthofString=0;
        for (int i = url.length - 1; i >= 0; i--) {
           if(url[i]!=' '){
               lengthofString=i;
               break;
           }
        }
        for (int i=url.length-1;i>=0;i--){
            if (url[lengthofString]!=' '){
                url[i]=url[lengthofString];
            }
            else {
                url[i--] = '0';
                url[i--] = '2';
                url[i] = '%';
            }
            lengthofString--;
        }
    }

}
