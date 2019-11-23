package problem_204;

public class CountPrimes {
    public static void main(String[] args) {
        CountPrimes countPrimes = new CountPrimes();
        int x = countPrimes.countPrimes(10);
        System.out.println(x);
    }

    public int countPrimes(int n) {
        int i = 1;
        int result = 0;
        while (i < n) {
            boolean b = isPrimeNumber(i);
            if (b) {
                result++;
            }
            i++;
        }
        return result;
    }


    public static boolean isPrimeNumber(int number) {
        if (number == 1) {
            return false;
        }
        if (number == 2 || number == 3) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < sqrt; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        System.out.println("number  " + number);
        return true;
    }

}
