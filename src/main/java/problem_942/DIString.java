package problem_942;

public class DIString {
    public static void main(String[] args) {
        DIString d = new DIString();
        int[] a = d.diStringMatch("DDI");
        for (int r : a) {
            System.out.println(r + " ");

        }

    }

    public int[] diStringMatch(String S) {
        int length = S.toCharArray().length, i = 0, p = 0;
        int k = length;
        int[] a = new int[S.toCharArray().length + 1];


        for (char c : S.toCharArray()) {
            if (c == 'I') {
                a[i++] = p++;

            } else {
                a[i++] = k--;
            }

        }

//        System.out.println(S.toCharArray()[length - 1]);
        if (S.toCharArray()[length - 1] == 'D') {
            a[i] = p;
        } else {
            a[i] = k;
        }


        return a;
    }
}
