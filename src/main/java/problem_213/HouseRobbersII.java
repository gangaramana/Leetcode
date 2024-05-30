package problem_213;

public class HouseRobbersII {
    public static void main(String[] args) {
        System.out.println(new HouseRobbersII().rob(new int[]{1, 2, 3}));
        System.out.println(new HouseRobbersII().rob(new int[]{0,1}));

    }

    public int rob(int[] nums) {
//        int k = rob(nums,0,2);
//        System.out.println(k);
////        return k;
//        System.out.println(rob(nums,1,nums.length-1));
        if (nums.length == 1){
            return nums[0];
        }
        if (nums.length == 2 || nums.length == 0) {
            return 0;
        }
        return Math.max(rob(nums, 0, nums.length - 2), rob(nums, 1, nums.length - 1));
    }

    public int rob(int[] nums, int start, int end) {
        int previous = 0;
        int present = nums[start];
        int temp = 0;
        for (int i = start + 2; i <= end + 1; i++) {
            temp = Math.max(present, nums[i - 1] + previous);
            previous = present;
            present = temp;
        }
        return present;
    }
}
