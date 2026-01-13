package Questions;

import Utility.ArrayUtil;
import java.util.Arrays;
import java.util.ArrayList;

public class CommonElements {
    public static void main(String[] args) {

        int[] arr1 = ArrayUtil.inputArray();
        int[] arr2 = ArrayUtil.inputArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        ArrayList<Integer> common = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                common.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }

        // print result
        for (int x : common) {
            System.out.print(x + " ");
        }
    }
}
