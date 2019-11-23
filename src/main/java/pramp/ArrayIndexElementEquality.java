package pramp;

public class ArrayIndexElementEquality {
    public static void main(String[] args) {
        ArrayIndexElementEquality arrayIndexElementEquality = new ArrayIndexElementEquality();
        int res = ArrayIndexElementEquality.indexEqualsValueSearch(new int[]{-6,-5,-4,-3,-2,-1,6});
        System.out.println(res);


    }

    static int indexEqualsValueSearch(int[] arr) {
        // your code goes here
        int k = helper(arr, 0, arr.length - 1);
        if (k > arr.length)
            return -1;
        return k;

    }

    static int helper(int[] arr, int start, int end) {
        if (start > end) {
            return Integer.MAX_VALUE;
        }
        int middle = (start + end) / 2;
        if (arr[middle] == middle) {
            return Math.min(middle, helper(arr, start, middle - 1));
        } else if (arr[middle] < middle) {
            return helper(arr, middle + 1, end);
        } else {
            return helper(arr, start, middle - 1);
        }


    }
}
