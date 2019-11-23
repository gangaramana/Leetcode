package problem_605;

import java.util.LinkedList;
import java.util.Queue;

public class CanplaceFlowers {
    public static void main(String[] args) {
        CanplaceFlowers canplaceFlowers = new CanplaceFlowers();
        boolean b = canplaceFlowers.canPlaceFlowers(new int[]{0, 0,0}, 2);
        System.out.println(b);
    }

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0, totalFlowers = 0;

        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                count++;
            } else {
                if (count == i) {
                    totalFlowers = totalFlowers + count / 2;

                } else if (count > 2) {
                    queue.add(count);

                }
                count = 0;
            }
        }
        if (count == flowerbed.length) {
            if (count % 2 == 0) {
                totalFlowers = totalFlowers + (count / 2);
            } else {
                totalFlowers = totalFlowers + (count / 2) + 1;
            }
        } else {
            totalFlowers = totalFlowers + count / 2;
        }
        while (!queue.isEmpty()) {
            int no = queue.remove();
            if (no % 2 == 0) {
                totalFlowers = totalFlowers + (no / 2) - 1;
            } else {
                totalFlowers = totalFlowers + no / 2;
            }
        }
        // System.out.println(totalFlowers);
        if (totalFlowers >= n) {
            return true;
        }
        return false;
    }
}
