package problem_268;

public class MissingNumberr {
    public static void main(String[] args) {
        MissingNumberr missingNumberr = new MissingNumberr();
        int x = missingNumberr.missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println(x);
    }

    public int missingNumber(int[] nums) {
        int sum = 0, len = nums.length;
        for (int x : nums) {
            sum = sum + x;
        }

        return ((len * (len + 1)) / 2) - sum;

    }
}
