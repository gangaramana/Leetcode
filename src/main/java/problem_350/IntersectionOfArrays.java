package problem_350;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.IntStream;

public class IntersectionOfArrays {
    public static void main(String[] args) {
        IntersectionOfArrays intersectionOfArrays = new IntersectionOfArrays();
      int[] yy=  intersectionOfArrays.intersect(new int[]{4,9,9,5}, new int[]{9,4,9,8,4});
        for (int y : yy) {
            System.out.println(y);
        }


//        ArrayList arrayList=new ArrayList();
//        arrayList.add(2);
//        arrayList.add(2);
//        arrayList.add(2);
//        arrayList.add(1);
//        arrayList.remove((Object)2);
//        System.out.println(arrayList);

    }

    //
    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList arrayList = new ArrayList();
        ArrayList integerArrayList = toArrayList(nums1);
        for (int x : nums2) {

            if (integerArrayList.remove((Object) x)) {
                arrayList.add(x);
//                System.out.println("true");

            }
        }
        return toIntArray(arrayList);
    }


    public ArrayList toArrayList(int[] A) {
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        for (int x : A) {
            arrayList.add(x);

        }
        return arrayList;


    }

    public int[] toIntArray(ArrayList a) {
        int[] x = new int[a.size()];
        int i = 0;
        for (Object y : a) {
            x[i++] = (int) y;

        }

        return x;
    }
}
