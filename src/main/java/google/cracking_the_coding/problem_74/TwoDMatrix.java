package google.cracking_the_coding.problem_74;

public class TwoDMatrix {
    public static void main(String[] args) {
        TwoDMatrix twoDMatrix=new TwoDMatrix();
       boolean result= twoDMatrix.searchMatrix(new int[][]{{1}},1);
               //new int[][]{{1,3,5,7},{10,11,16,20},{23,30,34,60}},3);
        System.out.println(result);
    }
    public boolean searchMatrix(int[][] matrix, int target) {
        int l=0,r=matrix.length*matrix[0].length-1;
        while(l<=r){
            int pivot=(l+r)/2;
            System.out.println(pivot);
            int i=pivot/matrix[0].length;
            int j=pivot-matrix[0].length*i;
            if(matrix[i][j]==target){
                return true;
            }
            else if (matrix[i][j]<target){
                l=pivot+1;
            }
            else{
                r=pivot-1;
            }

        }
        return false;

    }
}
