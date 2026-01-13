package Array.Questions;

import java.util.Scanner;

public class ProductElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size,sc);

        int product = 1;
        for(int i = 0; i < arr.length; i++){
            product = product * arr[i];
        }

        System.out.println(product);

    }
}
