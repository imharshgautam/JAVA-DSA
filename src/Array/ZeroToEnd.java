import java.util.Scanner;

public class ZeroToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int size = sc.nextInt();
         int[] arr = InputArray.inputArray(size, sc);

         int index = 0;

         for (int i = 0; i < arr.length; i++) {
         if (arr[i] != 0) {
         arr[index] = arr[i];
         index++;
             }
         }

         for (int i = index; i < arr.length; i++) {
         arr[i] = 0;
         }

         PrintArray.printArray(arr);

    }
}
