package Array.Questions;

class Solution {
    public boolean threeConsecutiveOdds(int[] arr) {
        int count = 0;

        for (int num : arr) {
            if (num % 2 != 0) {
                count++;
                if (count == 3) return true;
            } else {
                count = 0;
            }
        }
        return false;
    }
}

public class ConsThreeOdd {
    public static void main(String[] args) {
        Solution sol = new Solution();

        int[] arr1 = {2, 6, 4, 1, 3, 5};
        int[] arr2 = {1, 2, 3, 5};

        System.out.println(sol.threeConsecutiveOdds(arr1)); // true
        System.out.println(sol.threeConsecutiveOdds(arr2)); // false
    }
}
