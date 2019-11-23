package problem_852;

public class PeakIndexInArray {
    public static void main(String[] args) {
        PeakIndexInArray peakIndexInArray=new PeakIndexInArray();
        System.out.println(peakIndexInArray.peakIndexInMountainArray(new int[]{0,1,0}));


    }

    public int peakIndexInMountainArray(int[] A) {
        int index=0;
        int i=0;
        while (A[i]<A[i+1]){
            i++;
        }
        return i;

    }
}
