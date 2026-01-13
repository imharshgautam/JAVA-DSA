import java.util.Scanner;

public class EvenOddOperation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size,sc);

        for(int i = 0; i < arr.length; i++){
            if(i == 0){
                arr[i] = arr[i] + 10;
            }
            else{
                arr[i] = arr[i] * 2;
            }
        }

        PrintArray.printArray(arr);
    }
}
