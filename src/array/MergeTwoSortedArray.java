public class MergeTwoSortedArray {

    public static void main(String[] args) {

        int[] a = {2, 5, 6, 9, 20};
        int[] b = {1, 3, 4, 5, 7, 8, 90};

        int[] c = new int[a.length + b.length];

        // merge call
        merge(c, a, b);

        // print merged array
        for (int ele : c) {
            System.out.print(ele + " ");
        }
    }

    // Method to merge two sorted arrays
    public static void merge(int[] c, int[] a, int[] b) {

        int i = 0, j = 0, k = 0;

        // compare and insert smaller element
        while (i < a.length && j < b.length) {
            if (a[i] < b[j]) {
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }

        // remaining elements of a[]
        while (i < a.length) {
            c[k++] = a[i++];
        }

        // remaining elements of b[]
        while (j < b.length) {
            c[k++] = b[j++];
        }
    }
}
