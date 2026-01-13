package Array.Questions;

import java.util.Scanner;

public class RotateArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int size = sc.nextInt();
         int[] arr = InputArray.inputArray(size, sc);

         int n = arr.length;
         int d = sc.nextInt();   // number of rotations

         d = d % n; // handle d > n

        //  Left Rotate

//         Array.Questions.ReverseArray.reverseArray( arr, 0, d - 1);
//         Array.Questions.ReverseArray.reverseArray( arr, d, n - 1);
//         Array.Questions.ReverseArray.reverseArray( arr, 0, n - 1);

        // RIGHT ROTATION

//        Array.Questions.ReverseArray.reverseArray( arr, 0, n - 1);
//        Array.Questions.ReverseArray.reverseArray( arr, 0, d - 1);
//        Array.Questions.ReverseArray.reverseArray( arr, d, n - 1);

        PrintArray.printArray(arr);

    }

}
