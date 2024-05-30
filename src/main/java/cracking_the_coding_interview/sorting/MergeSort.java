package cracking_the_coding_interview.sorting;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = new int[]{1,3,6,7,5,4,3,3,3,3,3,3,4,5,6,6,7,8,9,9,0,523423,423,42,423424,234,24,32,42,34,234,0,178,1,2};
        MergeSort mergeSort = new MergeSort();
        mergeSort.mergeSort(array, 0, array.length - 1);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public void mergeSort(int[] integers, int left, int right) {
        int pivot = (left + right) / 2;
        if (left < right) {

            mergeSort(integers, left, pivot);
            mergeSort(integers, pivot + 1, right);
            merge(integers, left, pivot, right);

        }
    }

    private void merge(int[] integers, int left, int pivot, int right) {
        int leftSize = pivot;
        while (left <= leftSize && pivot + 1 <= right) {
            if (integers[left] < integers[pivot + 1]) {
                left++;
            } else if (integers[left] >= integers[pivot + 1]) {
                int temp = integers[left];
                integers[left] = integers[pivot + 1];
                integers[pivot + 1] = temp;
                left++;
            } else {
                pivot++;
            }
        }
    }
}
