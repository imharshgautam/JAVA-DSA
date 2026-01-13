import java.util.Scanner;

public class SecondLargest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size,sc);

        int max = Integer.MIN_VALUE;
        int smax = 0;

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }

        for(int i = 0; i < arr.length; i++){
            if(arr[i] > smax && arr[i] != max){
                smax = arr[i];
            }
        }

        System.out.println("Second Largest : " + smax);
    }
}
