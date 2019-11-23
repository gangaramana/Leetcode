package com.classCRT;

public class NondecreasingArray {


    public static void main(String[] args) {
        int ar[]={4,5,6,0,7};


        boolean b=new NondecreasingArray().checkPossibility(ar);
    }
    public boolean checkPossibility(int[] nums) {
        int len = nums.length;
        int count = 0;
        for (int i = 0; i <= len - 2; i++) {
            if (nums[i] > nums[i + 1]) {
                nums[i] = nums[i + 1];
                break;

            }
        }
        for (int i = 0; i <= len - 2; i++) {
            if (nums[i] <= nums[i + 1]) {

                return false;

            }
        }
        return true;

    }
}
