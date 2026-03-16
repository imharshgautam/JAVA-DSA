package OOPS;

public class Mraks {
    public static class StudentData{
        String name;
        int rno;
        int [] marks;
        StudentData(int s){
            marks = new int[s];
        }

        StudentData(int[] s){
            marks = s;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        StudentData s1 = new StudentData(arr);

        StudentData s2 = new StudentData(2);

        s1.marks[0] = 100;

        System.out.println(s1.marks[0]);
    }
}
