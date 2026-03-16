package OOPS;

public class PolyMorphism {

    public static class Dog{
        void speak(){
            System.out.println("Bhau bhau");
        }
    }

    public static class Cat{
        void speak(){
            System.out.println("meow meow");
        }
    }

    public static class Human{
        void speak(){
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        Dog tommy = new Dog();
        Human Honey = new Human();
        Cat snowbell = new Cat();

        tommy.speak();
        Honey.speak();
        snowbell.speak();

    }

}
