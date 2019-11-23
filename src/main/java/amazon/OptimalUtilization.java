package amazon;

import java.util.*;

public class OptimalUtilization {
    public static void main(String[] args) {
        OptimalUtilization optimalUtilization = new OptimalUtilization();
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        List<Integer> list2 = new ArrayList<>();
        list2.add(2);
        list2.add(5);
        List<Integer> list3 = new ArrayList<>();
        list3.add(3);
        list3.add(7);
        List<Integer> list4 = new ArrayList<>();
        list4.add(4);
        list4.add(10);
        lists.add(list);
        lists.add(list2);
        lists.add(list3);
        lists.add(list4);
        List<List<Integer>> listList = new ArrayList<>();
        List<Integer> l = new ArrayList<>();
        l.add(1);
        l.add(2);
        List<Integer> l2 = new ArrayList<>();
        l2.add(2);
        l2.add(3);
        List<Integer> l3 = new ArrayList<>();
        l3.add(3);
        l3.add(4);
        List<Integer> l4 = new ArrayList<>();
        l4.add(4);
        l4.add(5);
        listList.add(l);
        listList.add(l2);
        listList.add(l3);
        listList.add(l4);

        System.out.println(optimalUtilization.optimal(lists, listList, 10));
    }

    public List<List<Integer>> optimal(List<List<Integer>> a, List<List<Integer>> b, int target) {
        List<List<Integer>> res = new ArrayList<>();
        TreeMap<Integer, List<List<Integer>>> treeMap = new TreeMap<>();
        for (List<Integer> l : a) {
            for (List<Integer> two : b) {
                int k = l.get(1) + two.get(1) - target;
                if (k > 0) {
                    continue;
                }
                k = Math.abs(k);
                if (treeMap.containsKey(k)) {
                    List<Integer> ll = new ArrayList<>();
                    ll.add(l.get(0));
                    ll.add(two.get(0));
                    treeMap.get(k).add(ll);
                } else {
                    List<Integer> lk = new ArrayList<>();
                    lk.add(l.get(0));
                    lk.add(two.get(0));
                    List<List<Integer>> ll = new ArrayList<>();
                    ll.add(lk);
                    treeMap.put(k, ll);

                }

            }
        }
        for (Map.Entry<Integer, List<List<Integer>>> entry : treeMap.entrySet()) {
            return entry.getValue();
        }
        return new ArrayList<List<Integer>>();
    }
}
