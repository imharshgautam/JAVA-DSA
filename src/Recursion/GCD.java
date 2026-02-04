package Recursion;

public class GCD {

    public static int GCD(int a,int b) {
        if(a==0) return b;
        return GCD(b%a,a);

    }

    public static void main(String[] args) {
        int n = 16;
        int m = 12;
        System.out.println(GCD(n,m));

    }
}
