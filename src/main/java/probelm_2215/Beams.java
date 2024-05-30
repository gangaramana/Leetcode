package probelm_2215;

public class Beams {
    public static void main(String[] args) {
Beams beams=new Beams();
int res=beams.numberOfBeams(new String[]{"00000","00101","10100","11110","11100","01001","00100","11010"});
        System.out.println(res);
    }

    public int numberOfBeams(String[] bank) {
        int result=0;
        if (bank.length <= 1) {
            return result;
        }
        int previous = nofOnes(bank[0]);
        for (int i = 1; i < bank.length; i++) {
            int present=nofOnes(bank[i]);
            if (present!=0 && previous!=0){
                result=result+present*previous;
                previous=present;
            }
            else if (previous == 0 && present!=0){
                previous=present;
            }
        }
return result;
    }

    private int nofOnes(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1') {
                count++;
            }
        }
        return count;
    }
}
