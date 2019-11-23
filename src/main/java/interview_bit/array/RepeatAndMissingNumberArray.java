package interview_bit.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RepeatAndMissingNumberArray {
    public static void main(String[] args) {
        RepeatAndMissingNumberArray repeatAndMissingNumberArray = new RepeatAndMissingNumberArray();
        System.out.println(repeatAndMissingNumberArray.repeatedNumber(Arrays.asList(5, 1, 2, 5, 3)));

    }

    public List<Integer> repeatedNumber(final List<Integer> A) {
        int sum = 0, thisSum = 0, xorValue = 0;
        for (int i = 0; i < A.size(); i++) {
            xorValue = xorValue ^ A.get(i) ^ i+1;
            sum = sum + i+1;
            thisSum = thisSum + A.get(i);
        }
        int diff = sum - thisSum;
        int a = (diff + xorValue) / 2;
        int b = xorValue - a;
        if (diff > 0) {
            return  Arrays.asList(a, b);
        }
        return  Arrays.asList(b, a);


    }
}
