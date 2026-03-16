package OOPS;

class Students{
    String name;
    private int rno = 23;
    double cgpa;

    private void print(){
        System.out.println(name + " " + rno + " " + cgpa);
    }

    void p(){
        print();
    }

    int getrno(){
        return rno;
    }

    void setRno(int x){
        rno = x;
    }
}

public class PrivateKeyword {
    public static void main(String[] args) {
        Students s = new Students();

        s.p();

        s.name = "Harsh";
        s.cgpa = 7.2;

        s.p();

        System.out.println(s.getrno());
        s.setRno(5);
        System.out.println(s.getrno());
    }
}
