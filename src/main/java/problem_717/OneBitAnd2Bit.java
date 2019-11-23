package problem_717;

public class OneBitAnd2Bit {
    public static void main(String[] args) {
        int [] x=new int[]{0};//{1, 0, 1, 1, 0, 0, 1, 0, 1, 0, 0};
        OneBitAnd2Bit oneBitAnd2Bit = new OneBitAnd2Bit();
        boolean b = oneBitAnd2Bit.isOneBitCharacter(x);
        System.out.println(b);

    }

    public boolean isOneBitCharacter(int[] bits) {
        int i = 0, length = bits.length;

            for (; i < length - 1; ) {
                if (bits[i] == 0) {
                    i = i + 1;
                } else {
                    i = i + 2;
                }
            }
        if (i == bits.length - 1) {
            return true;
        }
        return false;
    }
}
