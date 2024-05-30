package google.cracking_the_coding.problem_1011;

public class CapacityReservations {
    public static void main(String[] args) {
        CapacityReservations capacityReservations = new CapacityReservations();
        int res = capacityReservations.shipWithinDays(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 5);
        System.out.println( capacityReservations.canAccomodate(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9,10},5,15));
        System.out.println(res);
    }

    public int shipWithinDays(int[] weights, int days) {
        int totalWeight = 0;
        for (int w : weights) {
            totalWeight += w;
        }

        int L = totalWeight / days, R = totalWeight;
        int pivot = 0;
        while (L < R) {
            pivot = L + (R - L) / 2;

            if (canAccomodate(weights, days, pivot)) {
                R = pivot;
            } else {
                L = pivot + 1;
            }
        }

        return L;


    }

    public boolean canAccomodate(int[] weights, int days, int shipCapacity) {
        int sum = 0, actualDays = 0;

        for (int I : weights) {
            if (sum + I > shipCapacity) {
                sum = 0;
                actualDays++;
                sum += I;
            }
            else if(sum+I == shipCapacity) {
                sum=0;
                actualDays++;
            }
            else {
                sum+=I;
            }


        }
        if (sum!=0){
            actualDays++;
        }

        return actualDays <= days ? true : false;

    }
}
