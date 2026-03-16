package OOPS;

public class Constructors {
    public static class car{
        int seats;
        String name;
        double length;
        String type;

        car(){

        }

        car(int x, String s, double d, String t ){
            seats = x;
            name = s;
            length = d;
            type = t;
        }

        void print(){
            System.out.println(name + " " + type + " " + length + " " + seats);
        }

    }

    public static  int max(int a, int b){
        return Math.max(a,b);
    }

    public static  int max(int a, int b, int c){        // Method Overloading
        return Math.max(a,Math.max(b,c));
    }

    public static void main(String[] args) {
        car s1 = new car(7,"XUV700",4.5,"SUV");
        s1.print();

        car s2 = new car();
        s2.name = "Honda City";
        System.out.println(s2.name);


        System.out.println(max(22,33,44));
        System.out.println(max(22,33));

    }



}
