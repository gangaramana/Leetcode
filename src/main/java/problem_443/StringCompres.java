package problem_443;

public class StringCompres {
    public static void main(String[] args) {
//        StringCompres stringCompres = new StringCompres();
//        int x = stringCompres.compress(new char[]{'a', 'a', 'a', 'b', 'b', 'b', 'c', 'c', 'c', 'c', 'c', 'c', 'd', 'd', 'd', 'd', 'd', 'e','d','e'});
//        System.out.println(x);

        char [] chars=new char[12];
        System.out.println(chars.length);
        for (char c:chars){
            System.out.print(c);
        }
    }

    public int compress(char[] chars) {
        int j = 0, subarryCount = 0, totalCount = 0;
        for (int i = 0; i < chars.length; ) {
            char c = chars[i];
            if (i == chars.length - 1) {
                totalCount = totalCount + 1;
                break;
            }

            j = i;
            while (c == chars[j]) {
                subarryCount++;
                if (j < chars.length - 1) {
                    j++;
                } else {

                    break;
                }
            }
            if (subarryCount>1) {
                totalCount = totalCount + 1 + String.valueOf(subarryCount).length();
            }
            else {
                totalCount = totalCount  + String.valueOf(subarryCount).length();
            }
            subarryCount = 0;
            i = j;

        }
        return totalCount;


    }
}
