package cracking_the_coding_interview.sorting;

public class QuickSort {
    public static void main(String[] args) {
QuickSort quickSort=new QuickSort();
int[] array=new int[]{1,2,3,4,5,5,6,8,7,5,4};
        quickSort.sort(array,0, array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }


    public void sort(int[] nums,int l,int r){
        if (l<r){
            performSwitch(nums,l,r);
            int pivot=l+(r-l)/2;
            sort(nums,l,pivot);
            sort(nums,pivot+1,r);
        }
    }

    private void swap(int[] nums,int i,int j){
        int temp=nums[j];
        nums[j]=nums[i];
        nums[i]=temp;
    }
    public void performSwitch(int[] nums,int l,int r){
        int pivot=l+(r-l)/2;
        while (r>l) {
            while (nums[l] < nums[pivot]) {
                l++;
            }
            while (nums[r - 1] > nums[pivot]) {
                r--;
            }
            if (l < r) {
                swap(nums, l, r - 1);
            }
        }
        swap(nums,r,pivot);

    }
}
