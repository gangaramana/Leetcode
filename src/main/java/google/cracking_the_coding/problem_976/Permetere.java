package google.cracking_the_coding.problem_976;

import java.util.Arrays;

class Permetere {

    public static void main(String[] args) {
        Permetere permetere=new Permetere();
       int res= permetere.largestPerimeter(new int[]{1,2,1,10});
        System.out.println(res);
    }

    public int largestPerimeter(int[] nums) {
        if (nums.length < 3) {
            return 0;
        }
        Arrays.sort(nums);
        for (int z = nums.length - 1; z > 0; z--) {
            int y = z - 1;
            for (int i = 0; i < y; i++) {
                if (nums[i] + nums[y] > nums[z]) {
                    return nums[i] + nums[y] + nums[z];
                }
            }


        }
        return 0;

    }

}
