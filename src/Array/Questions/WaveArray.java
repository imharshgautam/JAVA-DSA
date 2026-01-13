package Array.Questions;

import java.util.Scanner;

public class WaveArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int size = sc.nextInt();
         int[] arr = InputArray.inputArray(size, sc);

         for(int i = 0; i < arr.length-1; i +=2){  // odd case handle krne ke liye last tak jao he mmttt
             int temp = arr[i];
             arr[i] = arr[i+1];
             arr[i+1] = temp;
         }

         PrintArray.printArray(arr);
    }
}
