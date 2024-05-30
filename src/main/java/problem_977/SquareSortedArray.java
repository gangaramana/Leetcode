package problem_977;
//question::


/*Given an array of integers A sorted in non-decreasing order,
        return an array of the squares of each number, also in sorted non-decreasing order.*/


import java.util.Arrays;

public class SquareSortedArray {
    public static void main(String[] args) {
        SquareSortedArray s=new SquareSortedArray();
        int []A={-4,-1,2,3,10};
//        System.out.println(Math.abs(-11));

        A=s.sortedSquares(A);
        int length=A.length;
        for (int i = 0; i < length; i++) {
            System.out.println(A[i]);
        }


    }

    public int[] sortedSquares(int[] nums) {
        int i=0,j=nums.length-1;
        int k=nums.length-1;
        int [] result=new int[nums.length];
        while (i<=j){
            if (Math.abs(nums[i])>Math.abs(nums[j])){
                result[k]=nums[i]*nums[i];
                i++;
                k--;

            }
            else {
                result[k]=nums[j]*nums[j];
                j--;
                k--;
            }

        }
        return result;
    }
}
