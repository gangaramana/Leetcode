package problem_152;


public class MaximumProduct {
    public static void main(String[] args) {
        MaximumProduct maximumProduct = new MaximumProduct();
        int ans = maximumProduct.maxProduct(new int[]{2, 3, -2, -4, -5, -5, -6, });
        System.out.println(ans);

    }

    public int maxProduct(int[] nums) {
        int res = 0;
        if (nums.length > 0) {
            res = Integer.MIN_VALUE;
            int temp = 1, start = 0, end = 0;

            for (int i = 0; i < nums.length; i++) {
                end = i;
                temp = temp * nums[i];
                if (temp > res) {
                    res = temp;
                } else {
                    temp = temp / nums[start];
                    start++;

                }
            }

        }
        return res;
    }
}