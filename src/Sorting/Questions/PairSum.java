package Questions;
import Utility.ArrayUtil;
import java.util.Arrays;
import java.util.Scanner;

public class PairSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = ArrayUtil.inputArray();
        int target = sc.nextInt();
        boolean twoSum = false;
        Arrays.sort(arr);

        int i = 0, j = arr.length-1;
        while(i < j){
            if(arr[i] + arr[j] == target){
                twoSum = true;
                break;
            }
            else if(arr[i] + arr[j] > target) j--;
            else if(arr[i] + arr[j] < target) i++;
        }
        System.out.println(twoSum);
    }
}
