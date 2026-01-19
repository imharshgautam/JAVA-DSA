package TwoDimArray;
import java.util.Scanner;

public class Add2Matrix {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int rows = sc.nextInt();
            int cols = sc.nextInt();

            int[][] A = new int[rows][cols];
            int[][] B = new int[rows][cols];
            int[][] sum = new int[rows][cols];

            // Input first matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    A[i][j] = sc.nextInt();
                }
            }

            // Input second matrix
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    B[i][j] = sc.nextInt();
                }
            }

            // Add matrices
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    sum[i][j] = A[i][j] + B[i][j];
                }
            }

            // Print result
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    System.out.print(sum[i][j] + " ");
                }
                System.out.println();
            }

    }

}
