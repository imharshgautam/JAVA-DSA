package Recursion;
import java.util.Scanner;

public class NumSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(Sum(num));
    }

    public static int Sum(int n) {
        if(n == 0) return 0;
        return (n%10) + Sum(n/10);
    }
}