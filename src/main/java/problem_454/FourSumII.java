//package problem_454;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class FourSumII {
//    public static void main(String[] args) {
//
//    }
//    public int fourSumCount(int[] A, int[] B, int[] C, int[] D) {
//        List<List<Integer>> res = new ArrayList<>();
////        Arrays.sort(nums);
//        for (int i = 0; i < A.length ; i++) {
//            for (int j = i + 1; j < A.length ; j++) {
//                int left = j + 1;
//                int right = nums.length - 1;
//                while (left < right) {
//                    int sum = nums[i] + nums[j] + nums[left] + nums[right];
//                    if (sum == target) {
//                        List<Integer> l = new ArrayList<>();
//                        l.add(nums[i]);
//                        l.add(nums[j]);
//                        l.add(nums[left]);
//                        l.add(nums[right]);
//                        res.add(l);
//                        int leftValue = nums[left];
//                        int rightValue = nums[right];
//                        while (left < nums.length && nums[left] == leftValue) {
//                            left++;
//                        }
//                        while (right > left && nums[right] == rightValue) {
//                            right--;
//                        }
//                    } else if (sum < target) {
//                        left++;
//                    } else {
//                        right--;
//                    }
//                }
//                while (j < nums.length - 2 && nums[j] == nums[j + 1]) {
//                    ++j;
//                }
//            }
//            while (i < nums.length - 3 && nums[i] == nums[i + 1]) {
//                ++i;
//            }
//
//        }
//        return res;
//
//    }
//}
