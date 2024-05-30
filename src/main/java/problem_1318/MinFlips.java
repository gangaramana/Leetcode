package problem_1318;

public class MinFlips {
    public static void main(String[] args) {
MinFlips minFlips=new MinFlips();
int res=minFlips.minFlips(8,3,5);
        System.out.println(res);
    }

    public int minFlips(int a, int b, int c) {
        int flips = 0;
        while (a!=0||b!=0 ||c != 0) {
            if ((c&1)==1){
                if ((a&1) ==0 && (b&1) ==0){
                    flips++;
                }
            }
            else {
                if ((a&1)==1){
                    flips++;
                }
                if ((b&1) ==1){
                    flips++;
                }
            }
            c=c>>1;
            a=a>>1;
            b=b>>1;

        }
        return flips;
    }
}
