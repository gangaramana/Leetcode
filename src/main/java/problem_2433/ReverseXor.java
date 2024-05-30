package problem_2433;

public class ReverseXor {
    public static void main(String[] args) {
    }

    public int[] findArray(int[] pref) {

//pref[0] = res[0]
        //pref[1] = res[0] ^ res[1]
        //pref[2] = res[0] ^ res[1] ^ res[3]
        // if we do xor of pref[1] and pref[2] duplicates get cancelled out an d we get the result
        int[] res= new int[pref.length];
        res[0]=pref[0];
        for (int i=1;i< pref.length;i++){
            res[i]= pref[i]^ pref[i-1];
        }
        return res;
    }
}
