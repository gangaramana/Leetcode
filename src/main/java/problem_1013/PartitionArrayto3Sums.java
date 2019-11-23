package problem_1013;

public class PartitionArrayto3Sums {
    public static void main(String[] args) {
        PartitionArrayto3Sums partitionArrayto3Sums = new PartitionArrayto3Sums();

    }

    public boolean canThreePartsEqualSum(int[] A) {
        if(A.length<3){
            return false;
        }
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            sum = sum + A[i];
        }
        if (sum % 3 != 0) {
            return false;
        } else {
            int realsum = sum / 3, normalsum = 0, k = 0, i;
            for (i = 0; i < A.length; i++) {
                normalsum = normalsum + A[i];
                if (normalsum == realsum) {
                    k++;
                    normalsum = 0;
                }
            }
            if (k == 3 && i == A.length) {
                return true;

            } else {
                return false;
            }

        }

    }
}
