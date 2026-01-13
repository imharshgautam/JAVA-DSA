package Array.Questions;

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size,sc);
        int sum = sc.nextInt();

        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++ ){
                if(arr[i] + arr[j] == sum){
                    System.out.println(arr[i] + " " + arr[j]);
                }
            }
        }
    }
}
