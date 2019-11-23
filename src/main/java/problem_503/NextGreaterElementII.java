package problem_503;

public class NextGreaterElementII {
    public static void main(String[] args) {
        NextGreaterElementII nextGreaterElementII = new NextGreaterElementII();
        int[] x = nextGreaterElementII.nextGreaterElements(new int[]{5, 4, 3, 2, 1});
        for (int k : x) {
            System.out.println(k);
        }

    }

    public int[] nextGreaterElements(int[] nums) {
        int len = nums.length;
        int[] res = new int[len];
        int k = 0, j;
        for (int i = 0; i < len; i++) {
//            for (j = i + 1; j != i; j++) {
            j = i;
            do {
                j = j + 1;
                if (j == len) {
                    j = 0;
                }
                if (nums[j] > nums[i]) {
                    res[k++] = nums[j];
                    break;
                }

            } while (j != i);
            if (j == i) {
                res[k++] = -1;
            }
        }
        return res;
    }
}
