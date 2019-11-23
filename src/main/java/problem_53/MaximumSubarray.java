package problem_53;

/// using kadane's algorithm
public class MaximumSubarray {
    public static void main(String[] args) {
        MaximumSubarray maximumSubarray = new MaximumSubarray();
        int x = maximumSubarray.maxSubArray(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4});
        System.out.println(x);
    }

    public int maxSubArray(int[] nums) {
        int len = nums.length;
        int sum = 0;
        int start = 0, new_start = 0, end = 0;
        if (len > 0) {
            sum = nums[0];
            int prevSum = nums[0];
            for (int i = 1; i < len; i++) {
                if (nums[i] > prevSum + nums[i]) {
                    prevSum = nums[i];
                    new_start = i;
                } else {
                    prevSum = prevSum + nums[i];
//                    end = i;
                }
//                prevSum = Math.max(nums[i], prevSum + nums[i]);
                if (sum < prevSum) {
                    sum = prevSum;
                    start = new_start;
                    end = i;

                }
//                sum = Math.max(sum, prevSum);
            }

        }
        System.out.println("start  " + start + "  end  " + end);
        return sum;

    }
}
