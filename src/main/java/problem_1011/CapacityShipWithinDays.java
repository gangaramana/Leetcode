package problem_1011;

public class CapacityShipWithinDays {
    public static void main(String[] args) {
        CapacityShipWithinDays capacityShipWithinDays = new CapacityShipWithinDays();
        int x = capacityShipWithinDays.shipWithinDays(new int[]{1, 2}, 2);
        System.out.println(x);
    }

    public int shipWithinDays(int[] weights, int D) {

        int sum = 0;
        for (int i = 0; i < weights.length; i++) {
            sum = sum + weights[i];

        }
        int min = sum / D, max = sum, middle;
        while (min < max) {
            middle = (min + max) / 2;
            int count = 0, tempSum = 0;
            for (int i = 0; i < weights.length; i++) {
//                if (tempSum == D) {
//                    tempSum = 0;
//                    count++;
//                }
                if (tempSum + weights[i] > middle) {
                    tempSum = weights[i];
                    count++;
                } else {
                    tempSum = tempSum + weights[i];
                }
            }
            if (tempSum >= weights[weights.length - 1]) {
                count++;
            }
            if (count > D) {
                min = middle + 1;
            } else {
                max = middle;
            }
        }
        return max;
    }
}
