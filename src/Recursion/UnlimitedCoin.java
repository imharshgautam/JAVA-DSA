package Recursion;
import java.util.ArrayList;

//public class UnlimitedCoin {
//
//    public static void main(String[] args) {
//        int[] coin = {2, 3, 5};
//        int total = 8;
//        String ans = "";
//        f(coin, total, ans);
//    }
//
//    public static void f(int[] coin, int total, String ans) {
//        if (total == 0) {
//            System.out.println(ans);
//            return;
//        }
//        if (total < 0) {
//            return;
//        }
//        for (int i = 0; i < coin.length; i++) {
//            f(coin, total - coin[i], ans + coin[i] + " ");
//        }
//    }
//}


public class UnlimitedCoin {
    public static void main(String[] args) {
        int total = 8;
        int[] coins = {2, 3, 5};
        ArrayList<Integer> ans = new ArrayList<>();

        findCombinations(coins, total, ans);
    }

    static void findCombinations(int[] coins, int total, ArrayList<Integer> ans) {
        if (total == 0) {
            System.out.println(ans);
            return;
        }

        if (total < 0) return;

        for (int i = 0; i < coins.length; i++) {
            ans.add(coins[i]);                 // choose
            findCombinations(coins, total - coins[i], ans); // explore
            ans.remove(ans.size() - 1);        // un-choose (BACKTRACK)
        }
    }
}








