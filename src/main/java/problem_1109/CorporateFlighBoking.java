package problem_1109;

public class CorporateFlighBoking {
    public static void main(String[] args) {
        CorporateFlighBoking corporateFlighBoking = new CorporateFlighBoking();
        corporateFlighBoking.corpFlightBookings(new int[][]{{1, 2, 10}, {2, 3, 20}, {2, 5, 25}}, 5);

    }

    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] res = new int[n];
        for (int[] book : bookings) {
            for (int i = book[0]; i <= book[1]; i++) {
                res[i - 1] = res[i - 1] + book[2];

            }
        }
        for (int k : res) {
            System.out.println(k);

        }
        return res;
    }
}
