package Strings;

public class SubString {

    public static int sumSubstrings(String s) {
        int sum = 0;
        int n = s.length();

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                String sub = s.substring(i, j);
                sum += Integer.parseInt(sub);
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "6759";
        System.out.println(sumSubstrings(s));
    }
}
