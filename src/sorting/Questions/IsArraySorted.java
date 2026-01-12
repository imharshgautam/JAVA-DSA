package Questions;

import Utility.ArrayUtil;

public class IsArraySorted {
    public static void main(String[] args) {

        int[] arr = ArrayUtil.inputArray();

        boolean isSorted = true;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                isSorted = false;
                break;   // important: ek baar unsorted mila, bas
            }
        }

        if (isSorted) {
            System.out.println("Array is sorted");
        } else {
            System.out.println("Array is not sorted");
        }
    }

}
