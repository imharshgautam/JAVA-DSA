package Strings;

public class ReverseWords {

    public static String reverseWords(String s) {
        // Trim spaces and split by one or more spaces
        String[] words = s.trim().split("\\s+");

        StringBuilder sb = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);

            if (i != 0) {
                sb.append(" ");
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        String s = "  hello   world  ";
        System.out.println(reverseWords(s)); // world hello
    }
}
