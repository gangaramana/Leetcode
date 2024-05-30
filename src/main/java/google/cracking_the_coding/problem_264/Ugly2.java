package google.cracking_the_coding.problem_264;

public class Ugly2 {
    public static void main(String[] args) {
        Ugly2 t=new Ugly2();
        System.out.println(t.nthUglyNumber(11));
    }

    public int nthUglyNumber(int n) {
        int L=1,R=n*5;
        int k=1;
        while(L<R){
            int pivot=L+(R-L)/2;
            k= pivot/2 + pivot/3 + pivot/5 - pivot/10 - pivot/15 - pivot/6 + pivot/30 + 1;
            if (k<n){
                L=pivot+1;
            }
            else{
                R=pivot;
            }
        }
        return R;

    }
}
