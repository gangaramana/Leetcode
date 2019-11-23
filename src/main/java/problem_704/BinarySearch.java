package problem_704;

public class BinarySearch {
    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        int res=binarySearch.search(new int[]{0}, 0);
        System.out.println(res);
    }

    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;
        int med;
        while (start <= end) {
            med = (start + end) / 2;
            if (nums[med] == target) {
                return med;
            } else if (nums[med] > target) {
                end = med-1;
            } else {
                start = med+1;
            }

        }
        return -1;
    }
}
