package problem_283;

public class MoveZeros {
    public static void main(String[] args) {
        MoveZeros moveZeros = new MoveZeros();
        int[] a = new int[]{0,0,0,0,0,0,0};
        moveZeros.moveZeroes(a);
        for (int i:a){
            System.out.print(i);
        }

    }

    public void moveZeroes(int[] nums) {
        int start = 0, i = 0, count = 0;
        while (i < nums.length) {
            while (i < nums.length-1 &&nums[i] == 0) {
                count++;
                i++;
            }

            nums[start] = nums[i];
            i++;
            start++;
        }
        for (int k = nums.length - count; k < nums.length; k++) {
            nums[k] = 0;
        }

    }
}
