package problem_1089;

public class DuplicateZeros {
    public static void main(String[] args) {
        DuplicateZeros duplicateZeros = new DuplicateZeros();
        int[] x = new int[]{1,2,0,3};
        duplicateZeros.duplicateZeros(x);
        for (int k:x){
            System.out.print(k+" ");
        }
    }

    public void duplicateZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int k = arr.length - 1; k > i; k--) {
                    arr[k] = arr[k - 1];
                }
                i++;
            }
        }
    }
}
