package med_406;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashSet;

public class QueueReconstructionByHeight {
    public static void main(String[] args) {
        QueueReconstructionByHeight height = new QueueReconstructionByHeight();
        int[][] x = new int[][]{{7,0},{4,4},{7,1},{5,0},{6,1},{5,2}};
        int[][] res = height.reconstructQueue(x);
//        for (int[] c : res) {
//            for (int k : c) {
//                System.out.print(k + ",");
//            }
//            System.out.println();
//        }

    }


    public int[][] reconstructQueue(int[][] people) {
        if (people.length > 0) {
            Arrays.sort(people, (o1, o2) -> {

                return (Integer.valueOf(o1[0]).compareTo(o2[0]));

            });
//            Arrays.sort(people, (o1, o2) -> {
//                if (o1[1]==o2[1]) {
//
//                    return (Integer.valueOf(o1[1]).compareTo(o2[1]));
//                }
//                return o2[1];
//
//            });
            for (int[] c : people) {
                for (int k : c) {
                    System.out.print(k + ",");
                }
                System.out.println();
            }
            HashSet<Integer> occupied = new HashSet<>();
            int[][] res = new int[people.length][people[0].length];

            for (int[] c : people) {
                int i = c[1];
                while (!occupied.add(i)) {
                    i++;
                }
                res[i] = c;
            }
//        while ()


//        Arrays.sort(people, (o1, o2) -> {
//            if (o1[1]==o2[1]) {
//
//                return (Integer.valueOf(o1[0]).compareTo(o2[0]));
//            }
//            return (o1[1]);
//
//        });
            return res;
        }
        return people;

    }
}
