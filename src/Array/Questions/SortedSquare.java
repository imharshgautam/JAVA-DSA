package Array.Questions;

import java.util.Arrays;

public class SortedSquare {

    public static int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = nums[i] * nums[i];
        }

        Arrays.sort(arr);
        return arr;
    }

    public static void main(String[] args) {
        int[] nums = {-4, -1, 0, 3, 10};

        int[] result = sortedSquares(nums);

        for (int x : result) {
            System.out.print(x + " ");
        }
    }
}
