package problem_461;

public class HammingDistance {
    public static void main(String[] args) {
        HammingDistance h=new HammingDistance();
        int k=h.hammingDistance(32,31);
        System.out.println(k);

    }

    public int hammingDistance(int x, int y) {
        int distance = 0;
        for (int i = 31; i >= 0; i--) {
            if (((x >> i&1) ^ (y >> i&1)) == 1) {
                ++distance;
            }
        }
        return distance;
    }
}
