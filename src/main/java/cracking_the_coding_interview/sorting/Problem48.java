package cracking_the_coding_interview.sorting;

// find the first occurence of the number
public class Problem48 {
    public static void main(String[] args) {
Problem48 problem48=new Problem48();
int [] res=problem48.searchRange(new int[0],0);
for (int c: res){
    System.out.println(c);
}
    }

    public int[] searchRange(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
searchRange(nums,0,nums.length-1,target,res);
        return res;
    }

    private void searchRange(int[] nums, int low, int high, int target, int[] res) {
        if (low > high) {
            return;
        }
            int pivot = (low + high) / 2;
            if (nums[pivot] == target) {
                res[0] = res[0] == -1 ? pivot : Math.min(res[0], pivot);
                res[1] = res[1] == -1 ? pivot : Math.max(res[1], pivot);

                searchRange(nums, low, pivot - 1, target, res);
                searchRange(nums, pivot + 1, high, target, res);

            } else if (nums[pivot] > target) {
                searchRange(nums, low, pivot - 1, target, res);
            } else {
                searchRange(nums, pivot + 1, high, target, res);
            }
        }
    }


