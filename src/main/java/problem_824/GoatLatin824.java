package problem_824;

public class GoatLatin824 {
    public static void main(String[] args) {
        String[] x = new String[]{"Kjhgfgd", "iuyftgdfds", "etrew", ""};
        GoatLatin824 g = new GoatLatin824();
        String ss = "Kjhgfgd uyftgdfds etrew";
        System.out.println(g.toGoatLatin(ss));
//        System.out.println(x.);
    }

    public String toGoatLatin(String S) {
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder mainString = new StringBuilder();
        stringBuilder.append("ma");

        for (String k : S.split(" ")) {
            char c = k.toLowerCase().toCharArray()[0];
            stringBuilder.append('a');
            String ee = "something" + stringBuilder;


            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                mainString.append(k + stringBuilder + " ");


            } else {
                mainString.append(k.substring(1) + k.toCharArray()[0] + stringBuilder + " ");

            }
        }


        return mainString.toString().trim();

    }
}
