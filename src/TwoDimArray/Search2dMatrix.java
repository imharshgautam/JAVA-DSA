package TwoDimArray;

public class Search2dMatrix {

    public static void main(String[] args) {

        int[][] matrix = {
                {1, 4, 7, 11},
                {2, 5, 8, 12},
                {3, 6, 9, 16},
                {10, 13, 14, 17}
        };

        int target = 9;

        System.out.println(searchMatrix(matrix, target));
    }

    public static boolean searchMatrix(int[][] matrix, int target) {

        int m = matrix.length;
        int n = matrix[0].length;

        int i = 0;
        int j = n - 1;

        while (i < m && j >= 0) {
            if (matrix[i][j] == target)
                return true;
            else if (matrix[i][j] > target)
                j--;
            else
                i++;
        }

        return true;
    }
}
