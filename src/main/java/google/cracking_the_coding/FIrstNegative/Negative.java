package google.cracking_the_coding.FIrstNegative;

import java.util.LinkedList;
import java.util.Queue;

public class Negative {
    public long[] printFirstNegativeInteger(long A[], int N, int K)
    {
        Queue<Long> queue=new LinkedList();
        int i=0,j=0;
        long[] res=new long[N-K+1];

        while(j<N){
            if(A[j]<0){
                queue.add(A[j]);
            }

            if(j-i+1==K){
                if(queue.isEmpty()){
                    res[i]=0;
                }
                else{
                    res[i]=queue.peek();
                    if(A[i]==queue.peek()){
                        queue.remove();
                    }
                }

                i++;
            }
            j++;
        }
        return res;
    }
}
