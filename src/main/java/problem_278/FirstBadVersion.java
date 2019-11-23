package problem_278;

import java.util.ArrayList;

public class FirstBadVersion {
    public static void main(String[] args) {
        FirstBadVersion firstBadVersion = new FirstBadVersion();
        int x = firstBadVersion.firstBadVersion(5);
        System.out.println(x);

    }

    public int firstBadVersion(int n) {
        double no = n / 2;
        int prevtrue = n, prevFalse = 1;
        int xx = 0;
        ArrayList<Integer> arrayList = new ArrayList<>();

        do {
            boolean b = isBadVersion((int) no);
            if (b) {
                prevtrue = (int) no;
                arrayList.add(prevtrue);
                no = ((double)prevtrue + (double)prevFalse)/2;
            } else {
                prevFalse = (int) no;
                arrayList.add(prevFalse);
                no = ((double)prevtrue + (double)prevFalse) / 2;
            }

            xx = (int) no;


        } while (!arrayList.contains(xx));
        return prevtrue;

    }

    public boolean isBadVersion(int n) {
        if (n >= 3) {
            return true;
        }
        return false;
    }
}


//2126753390 my result
//        1702766719 original