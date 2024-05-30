package google.cracking_the_coding.problem_69;

public class SqrtBinarySearch {
    public static void main(String[] args) {
SqrtBinarySearch sqrtBinarySearch=new SqrtBinarySearch();
        System.out.println(sqrtBinarySearch.mySqrt(2147483647));
    }
    public int mySqrt(int x) {
        long L=0,R=(long)x+1;
        while(L<R ){
            long pivot=L+(R-L)/2;
            long value=pivot*pivot;
            if(value==x){
                return (int)pivot;
            }
            else if(value>x){
                R=pivot;
            }
            else{
                L=pivot+1;
            }
        }
        return (int)L-1;

    }
}
