package TwoDimArray;

public class ForEach2D {
    public static void main(String[] args) {
        int[][] arr = {  {1,2,3},
                {4,5,6},
                {7,8,9},
                {4,2,7}};

        for(int i = 0; i < arr.length;i++){
            for(int ele : arr[i]){
                System.out.print(ele + " ");
            }
            System.out.println();
        }
    }
}
