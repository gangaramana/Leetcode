package problem_35;

public class SearchInsertPosition {
    public static void main(String[] args) {
        SearchInsertPosition searchInsertPosition = new SearchInsertPosition();
        System.out.println(searchInsertPosition.searchInsert(new int[]{1,3,5,6},2));

    }

    public int searchInsert(int[] nums, int target) {
        int min = 0, max = nums.length - 1;
        int pivot=0;
        while (min <= max) {
            pivot = (min + max) / 2;
            if (target==nums[pivot]){
                return pivot;
            }
            else if (target>nums[pivot]){
                min=pivot+1;
            }else {
                max=pivot-1;
            }
        }
        if (nums[pivot]<target){
            return pivot+1;
        }
        else {
            return pivot;
        }

    }
}
