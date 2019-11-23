package problem_665;

public class NonDecreasingArray {
    public static void main(String[] args) {
        NonDecreasingArray nonDecreasingArray = new NonDecreasingArray();
        boolean b = nonDecreasingArray.checkPossibility(new int[]{-1, 4, 2, 3});
        System.out.println(b);
    }

    public boolean checkPossibility(int[] nums) {
        int flag = 0, i = 0, len = nums.length;
        boolean found = false;

        while (flag <= 2 && i < len - 1) {
            if (found) {
                if (nums[i - 1] > nums[i + 1]) {
                    i = i + 1;
                    flag++;
                } else {
                    found = false;
                    i++;
                }
                continue;
            }
            if (nums[i] > nums[i + 1]) {
                i = i + 1;
                found = true;
                flag++;
            } else {
                i++;
            }
        }
        if (flag == 1) {
            return true;
        } else {
            return false;
        }

    }
}
