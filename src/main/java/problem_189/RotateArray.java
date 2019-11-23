package problem_189;

public class RotateArray {
    public static void main(String[] args) {
        RotateArray rotateArray = new RotateArray();
        int[] x = new int[]{-1, -100, 3, 99};
        rotateArray.rotate(x, 2);
        for (int l : x) {
            System.out.println(l);
        }

    }

    public void rotate(int[] nums, int k) {
        int no;
        while (k > 0) {
            no = nums[nums.length - 1];
            for (int i = nums.length - 1; i >= 0; i--) {
                if (i == 0) {
                    nums[i] = no;
                    continue;
                }
                nums[i] = nums[i - 1];

            }
            k--;
        }

    }
}
