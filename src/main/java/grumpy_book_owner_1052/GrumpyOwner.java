package grumpy_book_owner_1052;


public class GrumpyOwner {
    public static void main(String[] args) {
        GrumpyOwner grumpyOwner = new GrumpyOwner();
        int k = grumpyOwner.maxSatisfied(new int[]{1, 0, 1, 2, 1, 7, 7, 7, 3, 5, 6, 1, 7, 5}, new int[]{0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0, 1}, 3);
        System.out.println(k);

    }

    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
        if (customers.length == 0) {
            return 0;
        }
        int windowSum = 0;
        int start = 0, end = X - 1;
        for (int i = 0; i < X; i++) {
            windowSum = windowSum + grumpy[i] == 1 ? customers[i] : 0;
        }
        int tempSum = windowSum;
        for (int k = X; k < grumpy.length; k++) {
            tempSum = tempSum - (grumpy[k - X] == 1 ? customers[k - X] : 0) + (grumpy[k] == 1 ? customers[k] : 0);
            if (tempSum > windowSum) {
                windowSum = tempSum;
                end = k;
                start = k - X + 1;
            }
        }
        int result = 0;

        for (int i = 0; i < grumpy.length; i++) {
            if (i < start || i > end) {

                result = result + (grumpy[i] == 0 ? customers[i] : 0);
//                System.out.println("number "+ (grumpy[i] == 0 ? customers[i] : 0 )+" i   "+i);
            } else {
                result = result + customers[i];
//                System.out.println("number "+customers[i] +" i   "+i);
            }


        }

//        System.out.println(result + "     " + start + "  " + end);
        return result;
    }

//    public int maxSatisfied(int[] customers, int[] grumpy, int X) {
////        int grumpySum = 0, start = 0, end = 0;
////        int sum = 0;
////        for (int i = 0; i < customers.length; i++) {
////            boolean b = false;
////            if (customers.length - i < X) {
////                break;
////            }
////            for (int k = i; k - i < X; k++) {
////                b = grumpy[k] == 1 ? true : false;
////                i = k;
////                if (b == true) {
////                    break;
////                }
////            }
////            if (b) {
////                int j;
////                sum = 0;
////                for (j = i; j - i < X; j++) {
////                    sum = sum + customers[j];
////                }
////                if (sum > grumpySum) {
////                    grumpySum = sum;
////                    start = i;
////                    end = j - 1;
////                }
////            }
////        }
////
////        sum = grumpySum;
////        for (int i = 0; i < customers.length; i++) {
////            if (i < start || i > end) {
////                sum = sum + (grumpy[i] == 1 ? 0 : customers[i]);
////            }
////
////        }
////        return sum;
////    }
//        int start = 0, end = 0, actualStart = -1, actualEnd = -1;
//        boolean b = false;
//        for (int i = 0; i < grumpy.length; i++) {
//            if (!b && grumpy[i] == 1) {
//                b = true;
//                start = i;
//            }
//            end = (grumpy[i] == 1 ? i : end);
//        }
//        int maxSum = 0;
//        actualStart = start;
//        for (int k = start; k - start < X && k < customers.length; k++) {
//            maxSum = maxSum + customers[k];
//        }
//        actualEnd = start + X - 1;
//        int windowsum = maxSum;
//        for (int p = start; p + X <= end && p + X < customers.length; p++) {
//            windowsum = windowsum - customers[p] + customers[p + X];
//            if (maxSum < windowsum) {
//                if (grumpy[p + 1] == 1 || grumpy[p + 2] == 1 || grumpy[p + X] == 1) {
//                    actualStart = p + 1;
//                    actualEnd = p + X;
//                    maxSum = windowsum;
//                }
//            }
//        }
//        int result = maxSum;
//        for (int i = 0; i < customers.length; i++) {
//            if (i < actualStart || i > actualEnd) {
//                result = result + (grumpy[i] == 1 ? 0 : customers[i]);
//            }
//
//        }
//
//        return result;
//    }
}
