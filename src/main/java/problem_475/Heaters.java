//package problem_475;
//
//import java.util.Arrays;
//import java.util.HashSet;
//import java.util.List;
//import java.util.PriorityQueue;
//import java.util.Queue;
//import java.util.function.Predicate;
//import java.util.stream.Collectors;
//import java.util.stream.IntStream;
//
//public class Heaters {
//    public static void main(String[] args) {
//        Heaters heaters = new Heaters();
//        System.out.println(heaters.findRadius(new int[]{1, 2, 3, 4}, new int[]{1, 4}));
//    }
//
//    public int findRadius(int[] houses, int[] heaters) {
//        int maxDiameter = findDiff(heaters, houses);
//        Queue<Integer> queue = new PriorityQueue<>();
//        binarySearch(0, maxDiameter, heaters, houses, queue);
//        System.out.println(queue);
//        return queue.peek();
//    }
//
//    private int findDiff(int[] heaters, int[] houses) {
//        int max = 0;
////        for (int i = 0; i < heaters.length; i++) {
//
//            if (i == 0) {
//                int k = heaters[i] - houses[0];
//                max = k > max ? k : max;
//            } else {
//                int k = heaters[i] - heaters[i - 1];
//                max = k > max ? k : max;
//            }
//            if (heaters.length == i + 1) {
//                int k = houses[houses.length - 1] - heaters[i];
//                max = k > max ? k : max;
//            }
//        }
//        return max;
//    }
//
//    private int binarySearch(int low, int high, int[] heater, int[] houses, Queue queue) {
//        int pivot = (high + low) / 2;
//        boolean allLightened = allLightened(pivot, heater, houses);
//        if (low > high) {
//            return pivot;
//        } else if (allLightened) {
//            queue.add(pivot);
//            return binarySearch(low, pivot - 1, heater, houses, queue);
//        } else {
//            return binarySearch(pivot + 1, high, heater, houses, queue);
//        }
//
//
//    }
//
//    private boolean allLightened(int pivot, int[] heaters, int[] houses) {
//        HashSet<Integer> hashSet = new HashSet<>();
//        for (int h : heaters) {
//            hashSet.addAll(getNumbersUsingIntStreamRangeClosed(h - pivot, h + pivot, houses));
//        }
//        if (hashSet.size() == houses.length) {
//            return true;
//        } else {
//            return false;
//        }
//    }
//
//    private List<Integer> getNumbersUsingIntStreamRangeClosed(int start, int end, int[] max) {
//        return IntStream.rangeClosed(start, end)
//                .boxed()
//                .filter(new Predicate<Integer>() {
//                    @Override
//                    public boolean test(Integer integer) {
//                        return Arrays.asList(max).contains(integer) ? true : false;
//                    }
//                })
//                .collect(Collectors.toList());
//    }
//}
