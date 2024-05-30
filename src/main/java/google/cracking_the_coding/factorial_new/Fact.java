package google.cracking_the_coding.factorial_new;

public class Fact {
    public static void main(String[] args) {
        Fact fact=new Fact();
        System.out.println( fact.kthFactor(2 ,2));
    }

    public int kthFactor(int n, int k) {

        int[] res=new int[n];
        int start=0,end=n-1;
        if(k>n){
            return -1;
        }
        for(int i=1;i<=Math.sqrt(n);i++){
            if(n%i==0){
                res[start++]=i;
                if(i!=Math.sqrt(n)){
                    res[end--]=n/i;
                }
            }

        }

        if(start+(n-end-1)>=k){
            if(k-start<=0){
                return res[k-1];
            }
            else{
                return res[end+k-start];
            }
        }
        return -1;

    }
}
