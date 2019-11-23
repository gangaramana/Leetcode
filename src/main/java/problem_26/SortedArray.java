package problem_26;

public class SortedArray {
    public static void main(String[] args) {
        SortedArray sortedArray = new SortedArray();
        int[] num = new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        int x = sortedArray.removeDuplicates(num);
        System.out.println("         " + x);
        for (int l : num) {
            System.out.println(l);
        }

    }

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
        }
        return j + 1;
    }
}
