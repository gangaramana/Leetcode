package google.cracking_the_coding.problem_42;

class RainWater {
    public static void main(String[] arg){
        RainWater rainWater=new RainWater();
        System.out.println(rainWater.trap(new int[]{0,1,0,2,1,0,1,3,2,1,2,1}));
    }

    public int trap(int[] height) {
        int[] leftMax = calculateLeftMax(height);
        int[] rightMax = calculateRightMax(height);
        int sum = 0;
        for (int i = 0; i < height.length; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];

        }
        return sum;

    }

    public int[] calculateLeftMax(int[] height) {
        int[] max = new int[height.length];
        int currentMax = height[0];
        max[0] = height[0];
        for (int i = 1; i < height.length; i++) {
            currentMax = Math.max(currentMax, height[i]);
            max[i] = currentMax;
        }
        return max;
    }

    public int[] calculateRightMax(int[] height) {
        int[] max = new int[height.length];
        int currentMax = height[height.length - 1];
        max[height.length - 1] = currentMax;
        for (int i = height.length - 2; i >= 0; i--) {
            currentMax = Math.max(currentMax, height[i]);
            max[i] = currentMax;
        }
        return max;
    }


}
