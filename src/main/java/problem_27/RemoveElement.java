package problem_27;

public class RemoveElement {
    public static void main(String[] args) {
        RemoveElement removeElement=new RemoveElement();
        int[] inte=new int[]{3,2,2,3};
        System.out.println(removeElement.removeElement(inte,3));
        for (int k:inte) {
            System.out.println(k);
        }

    }
    public int removeElement(int[] nums, int val) {
        int i=0;
        for (int j=0;j<nums.length;j++){
            if (nums[j]==val){
                continue;

            }
         else {
             if (i!=j){
                 nums[i]=nums[j];
                 i++;
             }else {
                 i++;
             }

            }

        }
        return i;

    }

}
