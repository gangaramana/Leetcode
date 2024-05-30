package problem_540;

import java.util.LinkedList;
import java.util.Queue;

public class SingleElementSoortedArray {
    public static void main(String[] args) {
SingleElementSoortedArray singleElementSoortedArray=new SingleElementSoortedArray();
int k=singleElementSoortedArray.singleNonDuplicate(new int[]{1,1,2,3,3});
        System.out.println(k);
        Queue<Integer> queue=new LinkedList<>();
        queue.add(null);
        Integer kp=queue.poll();
        if (kp!=null) {
            System.out.println();
        }
    }

    public int singleNonDuplicate(int[] nums) {
        int l = 0, h = nums.length - 1;
        int mid =0;
        while (l < h) {
            mid=( l + h) / 2;

                if ( mid > 0 && nums[mid] == nums[mid - 1]) {
                    if ((mid-1 - l) % 2 != 0) {
                        h = mid - 2;
                    } else {
                        l = mid + 1;
                    }

                }
            else if(mid < nums.length - 1 && nums[mid] == nums[mid + 1]) {
                    if ((h - mid + 1) % 2 != 0) {
                        l = mid + 2;
                    } else {
                        h = mid - 1;
                    }
                }
            else {
                return nums[mid];
                }
            }
        return nums[l];

    }

}

