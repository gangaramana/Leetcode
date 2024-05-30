package google.cracking_the_coding.problem_2007;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class OriginalArray {
    public static void main(String[] args) {
        OriginalArray originalArray=new OriginalArray();
        int[] res=originalArray.findOriginalArray(new int[]{1,2,2,4});
        for (int i:res){
            System.out.print(i+", ");
        }
    }
    public int[] findOriginalArray(int[] changed) {
        if (changed.length % 2 == 1) {
            return new int[0];
        }
        Arrays.sort(changed);
        Map<Integer, Integer> countMap = new HashMap();
        for (int i : changed) {
            countMap.put(i, countMap.getOrDefault(i, 0) + 1);
        }
        int[] res = new int[changed.length / 2];
        int j = 0;
        for (int i : changed) {
            if (countMap.get(i) <= 0) {
                continue;
            }
            if (i % 2 == 0 && countMap.getOrDefault(i / 2, 0) > 0) {
                countMap.put(i, countMap.get(i) - 1);
                countMap.put(i / 2, countMap.get(i / 2) - 1);
                res[j] = i / 2;
                j++;
            } else if (countMap.getOrDefault(i * 2, 0) > 0) {
                countMap.put(i, countMap.get(i) - 1);
                countMap.put(i * 2, countMap.get(i * 2) - 1);
                res[j] = i;
                j++;
            } else {
                return new int[0];
            }
        }
        return res;

    }
}
