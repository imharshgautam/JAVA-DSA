package OOPS;

public class PassingClassToMethods {
    public static class car{
        int seats;
        String name;
        double length;
        String type;

        void print(){
            System.out.println(name + " " + seats + " " + length + " " + type);
        }
    }

    public static void main(String[] args) {
        car c = new car();

        c.name = "XUV700";
        c.seats = 5;
        c.length = 5;
        c.type = "SUV";

        System.out.println( c.name + " " + c.seats + " " + c.type + " " + c.length);

        change(c);

        System.out.println(c.seats);

        c.print();
    }

    private static void change(car c){
        c.seats = 7;
    }
}
