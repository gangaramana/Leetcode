package google.cracking_the_coding.problem_151;

public class Reverse {
    public static void main(String[] args) {
        Reverse reverse=new Reverse();
        System.out.println(reverse.reverseWords("  hello world  "));
    }

        public String reverseWords(String s){
            StringBuffer str=new StringBuffer();
            int i=0, j=s.length()-1;
            while(j>=0){
                if(s.charAt(j)== ' '){
                    j--;
                }
                else {
                    i = j;
                    while (i >= 0) {
                        if (s.charAt(i) != ' ') {
                            i--;
                        } else {
                            break;
                        }
                    }


                    String ss = s.substring(i + 1, j + 1);
                    str.append(ss);
//                    str.append(' ')
                    j = i - 1;
                }
            }

            return str.toString();

        }

    }

