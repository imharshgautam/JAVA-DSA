package Array.Questions;//import java.util.Scanner;
//import java.util.Set;
//import java.util.TreeSet;
//
//public class Array.Questions.RemoveDuplicateElement {
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//
//        int size = sc.nextInt();
//        int[] arr = Array.Questions.InputArray.inputArray(size, sc);
//
//        Set<Integer> s = new TreeSet<>();
//
//        for (int ele : arr) {
//            s.add(ele);
//        }
//
//        int j = 0;
//
//        // Copy unique elements back to array
//        for (int ele : s) {
//            arr[j++] = ele;
//        }
//
//        // Print only unique elements
//        for (int i = 0; i < j; i++) {
//            System.out.print(arr[i] + " ");
//        }
//    }
//}

import java.util.Scanner;
public class RemoveDuplicateElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int size = sc.nextInt();
        int[] arr = InputArray.inputArray(size, sc);

        if (arr.length == 0) return;

        int i = 0;

        for (int j = 1; j < arr.length; j++) {
            if (arr[i] != arr[j]) {
                i++;
                arr[i] = arr[j];
            }
        }

        int k = i + 1;

        for (int x = 0; x < k; x++) {
            System.out.print(arr[x] + " ");
        }
    }
}

