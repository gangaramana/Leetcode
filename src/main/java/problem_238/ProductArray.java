package problem_238;

import cracking_the_coding_interview.sorting.Problem48;

public class ProductArray {
    public static void main(String[] args) {
        ProductArray productArray=new ProductArray();
        int [] res=productArray.productExceptSelf(new int[]{1,2,3,4});
        for (int k:res){
            System.out.println(k);
        }

    }

    public int[] productExceptSelf(int[] nums) {
        int[] prefixMul = new int[nums.length];
        prefixMul[0] = 1;
        int[] suffixMul = new int[nums.length];
        suffixMul[nums.length - 1] = 1;
        for (int j = nums.length - 2; j >= 0; j--) {
            suffixMul[j] = suffixMul[j + 1] * nums[j+1];
        }
        for (int i = 1; i < nums.length; i++) {
            prefixMul[i] = prefixMul[i - 1] * nums[i-1];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = prefixMul[i] * suffixMul[i];

        }
        return nums;

    }
}
