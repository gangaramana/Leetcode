package cracking_the_coding_interview.strings;

public class StringCompression {
    public static void main(String[] args) {
        System.out.println(compression("aaabbbcddg"));
    }

    public static String compression(String compressionString) {
        StringBuilder stringBuilder = new StringBuilder();

        if (compressionString != null && !compressionString.isEmpty()) {
            char previous = compressionString.charAt(0);
            int count = 1;
            for (int i = 1; i <= compressionString.length(); i++) {
                if (i == compressionString.length()) {
                    append(stringBuilder, previous, count);
                } else if (previous == compressionString.charAt(i)) {
                    count++;
                } else {
                    append(stringBuilder, previous, count);
                    previous = compressionString.charAt(i);
                    count = 1;
                }
            }
        }
        return stringBuilder.toString();
    }

    public static StringBuilder append(StringBuilder builder, char character, int count) {
        builder.append(character);
        builder.append(count);
        return builder;
    }
}

//runtime O(N)
