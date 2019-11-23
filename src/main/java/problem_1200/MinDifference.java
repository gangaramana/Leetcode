package problem_1200;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinDifference {
    public static void main(String[] args) {
        MinDifference minDifference = new MinDifference();
        System.out.println(minDifference.minimumAbsDifference(new int[]{4, 2, 1, 3}));
    }

    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        int i = 0;
        List<List<Integer>> lists = new ArrayList<>();
        while (i < arr.length - 1) {
            if (Math.abs(arr[i + 1] - arr[i]) == min) {
                List<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i + 1]);
                lists.add(l);
            } else if (Math.abs(arr[i + 1] - arr[i]) < min) {
                min = Math.abs(arr[i + 1] - arr[i]);
                List<Integer> l = new ArrayList<>();
                l.add(arr[i]);
                l.add(arr[i + 1]);
                lists = new ArrayList<>();
                lists.add(l);
            }
            i++;
        }
        return lists;
    }
}
