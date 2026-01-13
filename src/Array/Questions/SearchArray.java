package Array.Questions;

import java.util.Scanner;

public class SearchArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size,sc);

        int key = sc.nextInt();
        boolean isPresent = false;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == key){
                System.out.println("Key is present at Index : " + i);
                isPresent = true;
                break;
            }
        }
        if (isPresent == true) {
            System.out.println("Key is present");
        } else {
            System.out.println("Key is not present");
        }
    }
}
