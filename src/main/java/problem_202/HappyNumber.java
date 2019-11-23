package problem_202;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
    public static boolean isHappy(int n)
    {
        Set<Integer> unique_num = new HashSet<Integer>();

        while (unique_num.add(n))
        {
            int value = 0;
            while (n > 0)
            {
                value += Math.pow(n % 10, 2);
                n /= 10;
            }
            n = value;
        }

        return n == 1;
    }

    public static void main(String[] args)
    {
        System.out.print("Input a number: ");
        int num = 3;
        System.out.println(isHappy(num) ? "Happy Number" : "Unhappy Number");
    }

}
