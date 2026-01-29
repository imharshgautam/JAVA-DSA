package Strings;

public class Basics {
    public static void main(String[] args) {

        String str = "Harshita";
        String str2 = "Harsh";

        // -----------------------------
        // 1. length()
        // -----------------------------
        // Returns number of characters in the string
        System.out.println(str.length()); // 8


        // -----------------------------
        // 2. charAt(index)
        // -----------------------------
        // Returns character at given index
        System.out.println(str.charAt(0)); // H
        System.out.println(str.charAt(3)); // s


        // -----------------------------
        // 3. indexOf()
        // -----------------------------
        // Returns first occurrence index of character / string
        // Returns -1 if not found
        System.out.println(str.indexOf('a'));     // 1
        System.out.println(str.indexOf("ita"));   // 5
        System.out.println(str.indexOf('z'));     // -1


        // -----------------------------
        // 4. lastIndexOf()
        // -----------------------------
        // Returns last occurrence index
        System.out.println(str.lastIndexOf('a')); // 6


        // -----------------------------
        // 5. toLowerCase()
        // -----------------------------
        // Converts string to lowercase
        System.out.println(str.toLowerCase()); // harshita


        // -----------------------------
        // 6. toUpperCase()
        // -----------------------------
        // Converts string to uppercase
        System.out.println(str.toUpperCase()); // HARSHITA


        // -----------------------------
        // 7. contains()
        // -----------------------------
        // Checks if string contains given sequence
        System.out.println(str.contains("Harsh"));  // true
        System.out.println(str.contains("hello"));  // false


        // -----------------------------
        // 8. startsWith()
        // -----------------------------
        // Checks if string starts with given prefix
        System.out.println(str.startsWith("Har"));  // true
        System.out.println(str.startsWith("ar"));   // false


        // -----------------------------
        // 9. endsWith()
        // -----------------------------
        // Checks if string ends with given suffix
        System.out.println(str.endsWith("ita")); // true
        System.out.println(str.endsWith("ha"));  // false


        // -----------------------------
        // 10. equals()
        // -----------------------------
        // Compares content of strings (case-sensitive)
        System.out.println(str.equals("Harshita")); // true
        System.out.println(str.equals("harshita")); // false


        // -----------------------------
        // 11. equalsIgnoreCase()
        // -----------------------------
        // Compares strings ignoring case
        System.out.println(str.equalsIgnoreCase("harshita")); // true


        // -----------------------------
        // 12. compareTo()
        // -----------------------------
        // Lexicographical comparison
        // returns:
        // 0  -> strings equal
        // +ve -> first string > second
        // -ve -> first string < second
        System.out.println(str.compareTo(str2));
        // "Harshita" > "Harsh" → positive value


        // -----------------------------
        // 13. substring()
        // -----------------------------
        // Extracts part of string
        System.out.println(str.substring(2));     // rshita
        System.out.println(str.substring(2, 5));  // rsh


        // -----------------------------
        // 14. replace()
        // -----------------------------
        // Replaces characters or substring
        System.out.println(str.replace('a', 'x'));     // Hxrshitx
        System.out.println(str.replace("ita", "123")); // Harsh123


        // -----------------------------
        // 15. replaceAll()
        // -----------------------------
        // Uses regex to replace
        System.out.println(str.replaceAll("[aeiou]", "*")); // H*rsh*t*


        // -----------------------------
        // 16. trim()
        // -----------------------------
        // Removes leading and trailing spaces
        String s = "   Hello World   ";
        System.out.println(s.trim()); // "Hello World"


        // -----------------------------
        // 17. isEmpty()
        // -----------------------------
        // Checks if string length is 0
        String empty = "";
        System.out.println(empty.isEmpty()); // true


        // -----------------------------
        // 18. isBlank() (Java 11+)
        // -----------------------------
        // Checks empty or only spaces
        String blank = "   ";
        System.out.println(blank.isBlank()); // true


        // -----------------------------
        // 19. split()
        // -----------------------------
        // Splits string into array
        String data = "Java,Python,C++";
        String[] arr = data.split(",");
        for (String lang : arr) {
            System.out.println(lang);
        }


        // -----------------------------
        // 20. toCharArray()
        // -----------------------------
        // Converts string to character array
        char[] ch = str.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();


        // -----------------------------
        // 21. valueOf()
        // -----------------------------
        // Converts primitive to string
        int num = 100;
        String numStr = String.valueOf(num);
        System.out.println(numStr); // "100"


        // -----------------------------
        // 22. concat()
        // -----------------------------
        // Concatenates strings
        System.out.println(str.concat(" Sharma")); // Harshita Sharma


        // -----------------------------
        // 23. intern()
        // -----------------------------
        // Adds string to string pool
        String s1 = new String("Java").intern();
        String s2 = "Java";
        System.out.println(s1 == s2); // true
    }
}
