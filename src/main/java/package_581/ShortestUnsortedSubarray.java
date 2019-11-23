package package_581;

import java.util.Arrays;

public class ShortestUnsortedSubarray {
    public static void main(String[] args) {
        ShortestUnsortedSubarray shortestUnsortedSubarray = new ShortestUnsortedSubarray();
        int x = shortestUnsortedSubarray.findUnsortedSubarray(new int[]{1, 3, 3, 0, 3, 3, 3});
        System.out.println("x     ::" + x);
    }

//    public int findUnsortedSubarray(int[] nums) {
//        int i = 0, len = nums.length, start = 0, end = 0, j = len - 1;
//        for (i = 0; i < len - 1; i++) {
//            if (nums[i] > nums[i + 1]) {
//                start = i;
//                break;
//            }
//        }
//        for (; j > 0; j--) {
//            if (nums[j] < nums[j - 1] || nums[start] > nums[j]) {
////            if (nums[j] < nums[j - 1] ) {
//                end = j;
//                break;
//            }
//
//
//        }
//        if (start + 1 >= end) {
//            end = len - 1;
//        }
//        System.out.println(start + "     " + end);
//        int y = 0;
//        if (end != start) {
//            y = end - start + 1;
//
//        }
//        return y;
//    }


    public int findUnsortedSubarray(int[] nums) {
        int[] k = nums.clone();
        Arrays.sort(k);int start = 0, end = 0;
        for (int i = 0; i < nums.length; i++) {
            if (k[i] != nums[i]) {
                start = i;
                break;
            }

        }
        for (int ll = nums.length - 1; ll >= 0; ll--) {
            if (k[ll] != nums[ll]) {
                end = ll;
                break;
            }
        }
//        System.out.println("start   " + start + "  end ::  " + end);
        if (start == end) {
            return 0;
        }
        return end - start + 1;
    }
}
