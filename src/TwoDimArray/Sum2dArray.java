package TwoDimArray;
import java.util.Scanner;

public class Sum2dArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int row = sc.nextInt();
        int col = sc.nextInt();

        int[][] arr = new int[row][col];

        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                sum = sum + arr[i][j];
            }
        }

        System.out.println("Sum of 2D array is : " + sum);
}}
