package Array.Questions;

import java.util.*;

public class IntersectionOfTwoSortedArray {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 2, 3, 4};
        int[] arr2 = {2, 2, 3, 5};

        int[] result = intersection(arr1, arr2);

        System.out.print("Intersection: ");
        for (int x : result) {
            System.out.print(x + " ");
        }
    }

    public static int[] intersection(int[] arr1, int[] arr2) {
        ArrayList<Integer> list = new ArrayList<>();

        int i = 0, j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                list.add(arr1[i]);
                i++;
                j++;
            }
            else if (arr1[i] < arr2[j]) {
                i++;
            }
            else {
                j++;
            }
        }

        int[] ans = new int[list.size()];
        for (int k = 0; k < list.size(); k++) {
            ans[k] = list.get(k);
        }

        return ans;
    }
}
