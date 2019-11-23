package problem_523;

public class ContinuosSubArray {
    public static void main(String[] args) {
        ContinuosSubArray continuosSubArray = new ContinuosSubArray();
        boolean b = continuosSubArray.checkSubarraySum(new int[]{23, 2, 4, 6, 7, 9, 8, 7, 6, 7, 8, 9}, 41);
        System.out.println(b);

    }

    public boolean checkSubarraySum(int[] nums, int k) {
        boolean b = false;
        if (k > 0) {
            int temp = 0, start = 0, end = 0;

            for (int i = 0; i < nums.length; i++) {
                end = i;
                temp = temp + nums[i];
                if (temp > k) {
                    temp = temp - nums[start];
                    start++;
                }  if (temp == k && end - start > 0) {
                    System.out.println("start " + start + " end " + end);
                    return true;
                }
            }


        }
        return b;

    }
}
