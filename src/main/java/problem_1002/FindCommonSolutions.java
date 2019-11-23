package problem_1002;

import java.util.ArrayList;
import java.util.List;

public class FindCommonSolutions {
    public static void main(String[] args) {
//        String x = "ramana";
//        System.out.println(x.indexOf('b'));
//        x = x.replaceFirst("a", "");
//        System.out.println(x);
//        x = x.replaceFirst("a", "");
//        System.out.println(x);
//        x = x.replaceFirst("a", "");
//        System.out.println(x);
//        x = x.replaceFirst("a", "");
//        System.out.println(x);
        FindCommonSolutions findCommonSolutions = new FindCommonSolutions();
        System.out.println(findCommonSolutions.commonChars(new String[]{"bella","label","roller"}));

    }

    public List<String> commonChars(String[] A) {
        ArrayList<String> result = new ArrayList<>();
        boolean flag = false;
        char[] chars = A[0].toCharArray();
        for (int i = 0; i < chars.length; i++) {

            for (int j = 1; j < A.length; j++) {
                if (A[j].indexOf(chars[i]) != -1) {
                    String z = String.valueOf(chars[i]);
                    A[j] = A[j].replaceFirst(z, "");
                    flag = true;
                } else {
                    flag = false;
                    break;
                }

            }
            if (flag) {
                result.add(String.valueOf(chars[i]));
            }

        }
        return result;
    }
}
