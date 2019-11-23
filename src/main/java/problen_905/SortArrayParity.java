package problen_905;

import java.util.Arrays;
import java.util.List;

/*Given an array A of non-negative integers, return an array consisting
of all the even elements of A, followed by all the odd elements of A*/
public class SortArrayParity {
    public static void main(String[] args) {

        SortArrayParity s = new SortArrayParity();

        int[] A = {1, 2, 3, 4, 5,11,14,12,14,51,45,2,256};
        int len = A.length;
         A=s.sortArrayByParity(A);

        int odd[] = new int[100];
        for (int i = 0; i < len; i++) {
            System.out.println(A[i]);
        }
//        System.out.println(odd.length);


    }


    public int[] sortArrayByParity(int[] A) {
        int length = A.length;
        int odd[] = new int[length], even[] = new int[length];
        int oddcounter = 0, evencounter = 0;
        for (int i = 0; i < length; i++) {
            if ((A[i] % 2) == 0) {
                even[evencounter] = A[i];
                evencounter++;
            } else {
                odd[oddcounter] = A[i];
                oddcounter++;
            }
        }
        int e = even.length - 1;
        for (int i = 0; i < oddcounter; i++) {
            even[evencounter++] = odd[i];
        }
        A = even;
        return A;

    }
}
