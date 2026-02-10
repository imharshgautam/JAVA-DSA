package Sorting.Algorithm;

import Utility.ArrayUtil;

public class SelectionSort {
    public static void main(String[] args) {

        int[] arr = ArrayUtil.inputArray();

        for(int i = 0; i < arr.length-1; i++){
            int min = Integer.MAX_VALUE;
            int minIndex = -1;
            for(int j = i; j < arr.length; j++){
                if(arr[j] < min){
                    min = arr[j];
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        ArrayUtil.printArray(arr);
    }
}
