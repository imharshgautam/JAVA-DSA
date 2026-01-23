package Strings;

import java.util.Scanner;

public class Basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String str1 = "Harshita";
        String str2 = "Harsh";

        System.out.println(str1.indexOf('a'));   // if multiple a then return the first index
        System.out.println(str1.lastIndexOf('a'));  // return last index
        System.out.println(str1.toLowerCase());
        System.out.println(str1.toUpperCase());

        System.out.println(str1.contains("Harsh"));  // true
        System.out.println(str1.contains("Harsha")); // false

        System.out.println(str1.startsWith("Harsh")); // true
        System.out.println(str1.startsWith("arsh"));  // false

        System.out.println(str1.endsWith("ita")); // true
        System.out.println(str1.startsWith("t")); // false


        // compareTo
        // Harmeet < Harsh  because m < s
        // 0
        // 1
        // -1

        System.out.println(str1.compareTo(str2)); // ita => 3











        class Solution {
            public int firstUniqChar(String s) {

                // for (int i = 0; i < s.length(); i++) {
                //     if (s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))) {
                //     return i;
                //     }
                //  }
                // return -1;

                for(int i = 0; i < s.length(); i++){
                    boolean flag = true;
                    for(int j = 0; j < s.length(); j++){
                        if(s.charAt(i) == s.charAt(j) && i != j){
                            flag = false;
                            break;
                        }
                    }
                    if(flag){
                        return i;
                    }
                }
                return -1;
            }
        }









    }
}
