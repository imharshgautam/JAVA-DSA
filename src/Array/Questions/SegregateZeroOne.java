package Array.Questions;

import java.util.Scanner;

public class SegregateZeroOne {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size, sc);

        int countOfZero = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                countOfZero++;
            }
        }

        // fill zeros
        for (int i = 0; i < countOfZero; i++) {
            arr[i] = 0;
        }

        // fill ones
        for (int i = countOfZero; i < arr.length; i++) {
            arr[i] = 1;
        }

        PrintArray.printArray(arr);




//        int left = 0, right = arr.length - 1;
//
//        while (left < right) {
//            if (arr[left] == 0) left++;
//            else if (arr[right] == 1) right--;
//            else {
//                int temp = arr[left];
//                arr[left] = arr[right];
//                arr[right] = temp;
//            }
//        }


    }
}
