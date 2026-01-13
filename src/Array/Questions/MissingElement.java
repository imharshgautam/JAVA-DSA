package Array.Questions;

import java.util.Scanner;

public class MissingElement {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size, sc);

        int n = arr.length + 1;   // numbers from 1 to n
        int sum = n * (n + 1) / 2;

        int arrSum = 0;
        for (int i = 0; i < arr.length; i++) {
            arrSum += arr[i];
        }

        System.out.println(sum - arrSum);
        sc.close();
    }
}
