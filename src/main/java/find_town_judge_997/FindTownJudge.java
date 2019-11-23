package find_town_judge_997;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindTownJudge {
    public static void main(String[] args) {
        FindTownJudge findTownJudge = new FindTownJudge();
       int result= findTownJudge.findJudge(4, new int[][]{{1,3},{1,4},{2,3},{2,4},{4,3}});
        System.out.println(result);
    }

    public int findJudge(int N, int[][] trust) {
        HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();
        for (int i = 1; i <= N; i++) {
            hashMap.put(i, new ArrayList<Integer>());
        }
        for (int[] k : trust) {
            hashMap.get(k[0]).add(k[1]);
        }
        int res = -1;
        for (Map.Entry<Integer, ArrayList<Integer>> entry : hashMap.entrySet()) {
            if (entry.getValue().size() == 0) {
                res = find(hashMap, entry.getKey());
                if (res != -1) {
                    return res;
                }

            }

        }
        return res;
    }

    public int find(HashMap<Integer, ArrayList<Integer>> map, int val) {
        for (Map.Entry<Integer, ArrayList<Integer>> entry : map.entrySet()) {
            if (entry.getKey() != val) {
                boolean b = entry.getValue().contains(val);
                if (!b) {
                    return -1;
                }

            }
        }
        return val;
    }
}
