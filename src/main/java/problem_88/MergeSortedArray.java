package problem_88;

import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
        MergeSortedArray mergeSortedArray = new MergeSortedArray();
        int[] nums1 = new int[]{1};
        int[] nums2 = new int[]{};
        int m = 1, n = 0;
        mergeSortedArray.merge(nums1, m, nums2, n);
        for (int i : nums1) {
            System.out.println(i);
        }
    }


    private void insert(int i, int insertval, int[] nu) {
//        int temp = insertval;
        for (int k = nu.length - 1; k > i; ) {
            nu[k] = nu[--k];
        }
//        nu[i + 1] = nu[i];
        nu[i] = insertval;

    }

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (n == 0) {
            return;
        }
        int j = 0, i = 0;
        int k = 0;
        while (k < m && j < n) {
            if (nums1[i] > nums2[j]) {
                insert(i, nums2[j], nums1);
                i++;
                j++;
            } else {
                i++;
                k++;
            }

        }
        if (j < n) {
            System.arraycopy(nums2, j, nums1, i, n - j);
        }
    }
}
