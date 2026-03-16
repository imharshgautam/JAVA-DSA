package OOPS;

class Student{
    String  name;
    int rollno;
    double cgpa;

    void print(){
        System.out.println(name + " " + rollno + " " + cgpa);
    }
}

public class UserDefineDataType {


    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Harsh";
        s1.rollno = 23;
        s1.cgpa = 7.2;

//        System.out.println(s1.name+ " " + s1.rollno + " " +s1.cgpa);
        s1.print();

        Student s2 = new Student();
        s2.name = "MJ";
        s2.rollno = 34;
        s2.cgpa = 8.2;

//        System.out.println(s2.name+ " " + s2.rollno + " " +s2.cgpa);
        s2.print();
    }
}
