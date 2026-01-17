package TwoDimArray;

import java.util.ArrayList;

public class ArrayLists2D {
    public static void main(String[] args) {

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        // Example: add a row
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);

        ArrayList<Integer> b = new ArrayList<>();
        b.add(4);
        b.add(5);
        b.add(6);

        ArrayList<Integer> c = new ArrayList<>();
        c.add(7);
        c.add(8);
        c.add(9);


        arr.add(a);
        arr.add(b);
        arr.add(c);


        arr.add(new ArrayList<>());
        arr.get(arr.size()-1).add(5);
        arr.get(arr.size()-1).add(9);


//        System.out.println(arr);

//        for(int i = 0; i < arr.size(); i++){
//            for(int j = 0; j < arr.get(i).size(); j++){
//                System.out.print(arr.get(i).get(j)+" ");
//            }
//            System.out.println();
//        }

        for(ArrayList<Integer> List : arr){
            for (int ele : List){
                System.out.print(ele+" ");
            }
            System.out.println();
        }
    }
}
