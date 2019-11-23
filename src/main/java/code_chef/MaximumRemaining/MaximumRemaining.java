package code_chef.MaximumRemaining;

import java.util.Scanner;

public class MaximumRemaining {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();
        int[] ar = new int[no];
        for (int i = 0; i < no; i++) {
            ar[i] = scanner.nextInt();
//            System.out.println(ar[i]);
        }
        for (int i=0;i<no;i++){
            System.out.print(ar[i]+" ");
        }
    }
}
