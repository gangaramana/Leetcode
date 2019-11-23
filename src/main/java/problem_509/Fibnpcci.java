package problem_509;

public class Fibnpcci {
    public static void main(String[] args) {
        Fibnpcci fibnpcci = new Fibnpcci();
        System.out.println(fibnpcci.fib(7));

    }


    public int fib(int N) {
        int start = 0, next = 0, count = 2, res = 0;
         if (N >= 2) {
        res = fibnocci(0, 1, N, res);
         } else if (N == 1) {
             res = 1;
         } else {
             res = 0;
    }
        return res;

}

    public int fibnocci(int start, int end, int count, int result) {
        if (count >=2) {
            result = start + end;
            count--;
            return fibnocci(end, result, count, result);
        } else {
            return result;
        }

    }
}
