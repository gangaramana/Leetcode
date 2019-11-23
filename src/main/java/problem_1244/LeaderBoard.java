package problem_1244;

import java.util.*;

class Leaderboard {
  private   HashMap<Integer, Integer> hashMap;

    public Leaderboard() {
        hashMap = new HashMap<>();

    }

    public void addScore(int playerId, int score) {
        if (hashMap.containsKey(playerId)) {
            hashMap.put(playerId, hashMap.get(playerId) + score);
        } else {
            hashMap.put(playerId, score);
        }
    }

    public int top(int K) {
        int sum = 0;
        ArrayList<Map.Entry<Integer, Integer>> arrayList = new ArrayList<>(hashMap.entrySet());
        Collections.sort(arrayList, new Comparator<Map.Entry<Integer, Integer>>() {
            @Override
            public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
                return o2.getValue().compareTo(o1.getValue());
            }
        });
        for (int i = 0; i < K; i++) {
            sum = sum + arrayList.get(i).getValue();
        }
        return sum;
    }

    public void reset(int playerId) {
        hashMap.put(playerId, 0);
    }
}

