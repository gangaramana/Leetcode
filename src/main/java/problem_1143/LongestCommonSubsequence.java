package problem_1143;

public class LongestCommonSubsequence {
    public static void main(String[] args) {
        LongestCommonSubsequence longestCommonSubsequence = new LongestCommonSubsequence();
        int x=longestCommonSubsequence.longestCommonSubsequence( "longest","stonpek");
        System.out.println(x);

    }

    public int longestCommonSubsequence(String text1, String text2) {
        char[] c1 = text1.toCharArray();
        char[] c2 = text2.toCharArray();
        int[][] dpArray = new int[c1.length + 1][c2.length + 1];
        for (int i = 0; i <= c1.length; i++) {
            for (int j = 0; j <=c2.length; j++) {
                if (i == 0 | j == 0) {
                    continue;
                }
                if (c1[i-1] == c2[j-1]) {
                    dpArray[i][j] = 1 + dpArray[i - 1][j - 1];
                } else {
                    dpArray[i][j] = Math.max(dpArray[i - 1][j], dpArray[i][j - 1]);
                }
            }
        }
        for (int i=0;i< dpArray.length;i++){
            for (int j=0;j<dpArray[0].length;j++){
                System.out.print(dpArray[i][j]+" ");
            }
            System.out.println();
        }
        return dpArray[c1.length][c2.length];
    }
}
