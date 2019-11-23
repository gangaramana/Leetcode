package problem_575;


import java.util.Arrays;
import java.util.HashSet;

public class DistributeCandies {
    public static void main(String[] args) {
        DistributeCandies s = new DistributeCandies();
        s.distributeCandies(new int[]{1, 1, 2, 3,5,6,3,3,1,1,1,1,1,1,1,1,1});

    }

    public int distributeCandies(int[] candies) {
        int halfLength = (candies.length) / 2;
        HashSet hashSet = new HashSet();

        for (int c : candies) {
            hashSet.add(c);
        }
        int variety = halfLength >= hashSet.size() ? hashSet.size() : halfLength;
//        System.out.println(variety);

        return variety;

    }
}
