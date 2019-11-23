package problem_412;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static void main(String[] args) {
        List<String> x=new FizzBuzz().fizzBuzz(15);
        System.out.println(x);


    }

    public List<String> fizzBuzz(int n) {
        List<String> strings = new ArrayList<String>();

//        int i = 1;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                strings.add("FizzBuzz");

            } else if (i % 3 == 0) {
                strings.add("Fizz");

            } else if (i % 5 == 0) {
                strings.add("Buzz");

            } else {
                strings.add(String.valueOf(i));

            }
        }
        return strings;

    }
}
