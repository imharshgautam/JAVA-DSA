package Strings;

import java.util.Scanner;

public class CountDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        String str = "";
        str = str + num;
        System.out.println(str.length());
    }
}
