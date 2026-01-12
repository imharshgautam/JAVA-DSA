package Questions;

import Utility.ArrayUtil;
import java.util.Scanner;

public class KthSmallest {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayUtil.inputArray();
        int k = sc.nextInt();   // ✅ ADDED

        for (int i = 0; i < k; i++) {
            int min = Integer.MAX_VALUE;
            int minIndex = -1;

            for (int j = i; j < arr.length; j++) {
                if (arr[j] < min) {
                    min = arr[j];
                    minIndex = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(arr[k - 1]);
    }
}
