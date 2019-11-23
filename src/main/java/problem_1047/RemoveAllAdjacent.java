package problem_1047;


public class RemoveAllAdjacent {
    public static void main(String[] args) {
//        StringBuffer stringBuffer = new StringBuffer("abbacb");
//        stringBuffer.deleteCharAt(2);
//        System.out.println(stringBuffer);
        RemoveAllAdjacent removeAllAdjacent = new RemoveAllAdjacent();
       String x= removeAllAdjacent.removeDuplicates("abbacb");
        System.out.println(x);

    }

    public String removeDuplicates(String S) {
        StringBuffer stringBuffer = new StringBuffer(S);
        helper(stringBuffer);


        return stringBuffer.toString();
    }

    private void helper(StringBuffer st) {
        int size = st.length();
        int prev = 0;
        int next;
        for (int i = 1; i < size; i++) {
            next = i;
            if (st.charAt(prev) == st.charAt(next)) {
                st.deleteCharAt(prev);
                st.deleteCharAt(prev);
                helper(st);
                break;
            } else {
                prev = next;
            }

        }


    }
}
