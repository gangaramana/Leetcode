package problem_49;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GroupAnagram {
    public static void main(String[] args) {
GroupAnagram groupAnagram =new GroupAnagram();
groupAnagram.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> integerListMap = new HashMap<>();

        for (String str : strs) {
            int count = 0;
            for (int i = 0; i < str.length(); i++) {
                count = count + str.charAt(i);
            }
            List<String> stringList = integerListMap.getOrDefault(count, new ArrayList<>());
            stringList.add(str);
            integerListMap.putIfAbsent(count, stringList);
        }

        System.out.println(integerListMap);
        return null;
    }
}
