package problem_767;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class MyComparator implements Comparator<Pair<Character, Integer>> {

    @Override
    public int compare(Pair<Character, Integer> o1, Pair<Character, Integer> o2) {
        return Integer.compare(o2.getValue(), o1.getValue());
    }
}

public class ReorganizeString {
    public static void main(String[] args) {
        ReorganizeString reorganizeString = new ReorganizeString();
        System.out.println(reorganizeString.reorganizeString("aab"));

    }

//    public String reorganizeString(String s) {
//        Map<Character, Integer> hashMap = new HashMap<>();
//        for (char c : s.toCharArray()) {
//            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
//        }
//        PriorityQueue<Pair<Character, Integer>> pq = new PriorityQueue<>(new MyComparator());
//        for (Map.Entry<Character, Integer> entry : hashMap.entrySet()) {
//            pq.add(new Pair<>(entry.getKey(), entry.getValue()));
//            int limit = s.length() % 2 == 0 ? s.length() / 2 : (s.length() / 2) + 1;
//            if (!(entry.getValue() <= limit)) {
//                return "";
//            }
//        }
//        char[] stringBuilder = new char[s.length()];
//        boolean[] visited = new boolean[s.length()];
//        Arrays.fill(visited, false);
//        int i = -1, j = 0;
//        char previous = '@';
//        while (!pq.isEmpty()) {
//            Pair<Character, Integer> pair = pq.poll();
//            if (pair.getKey() != previous) {
//                i++;
//                while (visited[i] == true) {
//                    i++;
//                }
//                stringBuilder[i]= pair.getKey();
//                visited[i] = true;
//
//            } else {
//                if (i == -1) {
//                    j = 0;
//                } else {
//                    j = i + 2;
//
//                }
//                stringBuilder[j]= pair.getKey();
//                visited[j] = true;
//
//            }
//            previous = pair.getKey();
//            if (pair.getValue() == 1) {
//                continue;
//            } else {
//
//                pq.add(new Pair<Character, Integer>(pair.getKey(), pair.getValue() - 1));
//            }
//
//
//        }
//        return String.valueOf(stringBuilder);
//
//
//    }

    public String reorganizeString(String s) {
        int[] charCount = new int[26];
        Arrays.fill(charCount, 0);
        char maxChar = 0;
        int maxFreq = 0;
        for (char c : s.toCharArray()) {
            charCount[c - 'a']++;
            if (charCount[c - 'a'] > maxFreq) {
                maxChar = c;
                maxFreq = charCount[c - 'a'];

            }
            if (charCount[c - 'a'] > (s.length() + 1) / 2) {
                return "";
            }
        }
        char[] chars = new char[s.length()];
        //getting the max count
        int i = 0;
        while (charCount[maxChar - 'a'] > 0) {
            chars[i] = maxChar;
            i = i + 2;
            charCount[maxChar - 'a']--;
        }

        for (int k = 0; k < charCount.length; k++) {
            if (charCount[k] == 0) {
                continue;
            }
            while (charCount[k] > 0) {
                if (i >= s.length()) {
                    i = 1;
                }
                chars[i] = (char) (k+'a');
                i = i + 2;

                charCount[k]--;
            }


        }
        return String.valueOf(chars);
    }
}
