package problem_11;


public class ContainerWithMostWater {
    public static void main(String[] args) {
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        int[] h = new int[]{1, 1};
        int z = containerWithMostWater.maxArea(h);
        System.out.println(z);
    }



    public int maxArea(int[] height) {

        int a= maxAreaHelper(height, 0, 0, height.length - 1);
        return a;
    }

    public int maxAreaHelper(int[] h, int maxA, int start, int end) {
        if (end - start >= 1) {
            int x = 0;
            if (h[end] >= h[start]) {
                x = (end - start) * h[start];
                start++;
            } else {
                x = (end - start) * h[end];
                end--;
            }
            if (maxA < x) {
                maxA = x;
            }
           maxA= maxAreaHelper(h, maxA, start, end);

        }
        return maxA;


    }
}
