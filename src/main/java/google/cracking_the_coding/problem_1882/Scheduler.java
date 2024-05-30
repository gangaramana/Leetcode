package google.cracking_the_coding.problem_1882;

import javafx.util.Pair;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Scheduler {
    public static void main(String[] args) {
Scheduler scheduler=new Scheduler();
        System.out.println(Arrays.toString(scheduler.assignTasks(new int[]{3, 3, 2}, new int[]{1, 2, 3, 2, 1, 2})));
    }

    public int[] assignTasks(int[] servers, int[] tasks) {
        int[] res = new int[tasks.length];
        PriorityQueue<Pair<Integer, int[]>> queue = new PriorityQueue<>(new Comparator<Pair<Integer, int[]>>() {
            @Override
            public int compare(Pair<Integer, int[]> o1, Pair<Integer, int[]> o2) {
                if (o1.getValue()[1] == o2.getValue()[1]) {
                    if (o1.getKey() == o2.getKey()) {
                        return Integer.compare(o1.getValue()[0], o2.getValue()[0]);
                    } else {
                        return Integer.compare(o1.getKey(), o2.getKey());
                    }

                }
                return Integer.compare(o1.getValue()[1], o2.getValue()[1]);
            }
        });
        for (int i = 0; i < servers.length; i++) {
            queue.add(new Pair(servers[i], new int[]{i, 0}));
        }
        for (int j = 0; j < tasks.length; j++) {
            Pair<Integer, int[]> p = queue.poll();
            res[j] = p.getValue()[0];
            p.getValue()[1] = p.getValue()[1] + tasks[j];
            queue.add(p);
        }


        return res;
    }
}
