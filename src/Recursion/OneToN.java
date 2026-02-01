package Recursion;
import java.util.Scanner;

//public class OneToN {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(1,n);
//    }
//
//    public static void print(int x,int y) {
//        if(x > y) return;
//        System.out.println(x);
//        print(x+1,y);
//    }
//}


//public class OneToN {
//    static int n;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        n = sc.nextInt();
//        print(1);
//    }
//
//    public static void print(int x) {
//        if (x > n) return;
//        System.out.println(x);   // print current number
//        print(x + 1);
//    }
//}


//public class OneToN {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        print(n);
//    }
//
//    public static void print(int n) {
//        if(n == 0) return;
//        print(n-1);
//        System.out.print(n+" ");
//    }
//}


public class OneToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        print(n);
    }

    public static void print(int n) {
        if(n == 0) return;
        System.out.print(n+" ");
        print(n-1);
        if(n!=1)System.out.print(n+" ");
    }
}