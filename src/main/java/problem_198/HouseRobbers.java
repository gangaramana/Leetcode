package problem_198;

public class HouseRobbers {
    public static void main(String[] args) {
        System.out.println(new HouseRobbers().rob(new int[]{2, 7, 9, 3, 1}));
    }

    public int rob(int[] nums) {
       int previous  = 0;
        int present = nums[0];
        int temp=0;
        for (int i = 2; i <= nums.length; i++) {
            temp= Math.max(present, nums[i-1] + previous);
            previous=present;
            present=temp;
        }
        return present;
    }
}
