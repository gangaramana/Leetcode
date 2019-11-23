package problem_414;

import java.util.Map;
import java.util.TreeMap;

public class ThirdMaxNumber {
    public static void main(String[] args) {
        ThirdMaxNumber thirdMaxNumber = new ThirdMaxNumber();
        int x = thirdMaxNumber.thirdMax(new int[]{1,2,2,3,4,5});
        System.out.println(x);
    }

    public int thirdMax(int[] nums) {
        TreeMap<Integer, Integer> treeMap = new TreeMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (treeMap.containsKey(nums[i])) {
                treeMap.put(nums[i], treeMap.get(nums[i]) + 1);
            } else {
                treeMap.put(nums[i], 1);
            }
        }
        int i = 0, result = 0, size = treeMap.size();
        if (size >= 3) {
            for (Map.Entry em : treeMap.entrySet()) {
                if (i == size-3) {
//                System.out.println(em.getKey() + "      " + em.getValue());
                    result = (int) em.getKey();
                    break;
                }
                result = (int) em.getKey();

                i++;
            }
        } else {
            for (Map.Entry em : treeMap.entrySet()) {

//                System.out.println(em.getKey() + "      " + em.getValue());

                result = (int) em.getKey();

                i++;
            }

        }

        return result;
    }
}
