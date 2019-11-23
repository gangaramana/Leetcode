package problem_791;

import java.util.HashMap;
import java.util.Map;

public class CustomSortString {
    public static void main(String[] args) {
        CustomSortString customSortString = new CustomSortString();
        String k=customSortString.customSortString("cba", "abcdaad");
        System.out.println(k);
    }

    public String customSortString(String S, String T) {
        int[] x = new int[26];
        StringBuffer stringBuffer = new StringBuffer();
        HashMap<Integer, Character> hashMap = new HashMap<>();
        int k = 0;
        for (char c : S.toCharArray()) {
            hashMap.put(k++, c);
        }

        for (char c : T.toCharArray()) {
            x[c - 97] = x[c - 97] + 1;
        }
        for (Map.Entry<Integer, Character> entry : hashMap.entrySet()) {
            char v = entry.getValue();
            while (x[v - 97] > 0) {
                stringBuffer.append(v);
                x[v - 97]--;
            }

        }
        for (int i = 0; i < 26; i++) {
            while (x[i] > 0) {
                stringBuffer.append((char) (i + 97));
                x[i]--;
            }
        }
        return stringBuffer.toString();
    }
}
