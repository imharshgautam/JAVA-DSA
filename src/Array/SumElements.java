import java.util.Scanner;

public class SumElements {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size, sc);

        int sum = 0;
        for (int Ele : arr) {
            sum = sum + Ele;
        }

        System.out.println(sum);



    }
}
