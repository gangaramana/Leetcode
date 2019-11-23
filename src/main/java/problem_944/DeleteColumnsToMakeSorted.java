package problem_944;

public class DeleteColumnsToMakeSorted {
    public static void main(String[] args) {
        DeleteColumnsToMakeSorted d = new DeleteColumnsToMakeSorted();
        System.out.println(d.minDeletionSize(new String[]{"zyx","wvu","tsr"}));

    }

    public int minDeletionSize(String[] A) {

        int del = 0, len = A.length, l = A[0].length();
        for (int j = 0; j < l; j++) {
            for (int i = 0; i < len-1; i++) {
                if (A[i].toCharArray()[j] <= A[i + 1].toCharArray()[j]) {
                } else {
                    del++;
                    break;
                }

            }
        }
        return del;

    }
}
