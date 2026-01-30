package Strings;

public class StringBuilderNotes {

    /*
     ================================
        JAVA STRINGBUILDER NOTES
     ================================

     1) What is StringBuilder?
     -------------------------
     StringBuilder is a class in Java used to create and modify strings.

     It is MUTABLE.
     Mutable = You can change the same object.

     String is IMMUTABLE.
     Immutable = You cannot change the same object.
     Every change creates a NEW object in memory.

     Example with String (BAD for many changes):
     -------------------------------------------
     String s = "Hello";
     s = s + " World";
     -> Creates new object (slow, more memory)

     Example with StringBuilder (GOOD):
     ----------------------------------
     StringBuilder sb = new StringBuilder("Hello");
     sb.append(" World");
     -> Same object is modified (fast, less memory)
    */

    public static void main(String[] args) {

        /*
         2) Creating StringBuilder
        */
        java.lang.StringBuilder sb = new java.lang.StringBuilder("Hello");


        /*
         3) append() - Add text at end
        */
        sb.append(" World");
        System.out.println("After append: " + sb);
        // Output: Hello World


        /*
         4) insert() - Insert at specific index
        */
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);
        // Output: Hello, World


        /*
         5) delete() - Delete characters from start to end-1
        */
        sb.delete(5, 6);
        System.out.println("After delete: " + sb);
        // Output: Hello World


        /*
         6) reverse() - Reverse the string
        */
        sb.reverse();
        System.out.println("After reverse: " + sb);
        // Output: dlroW olleH


        /*
         7) charAt() - Get character at index
        */
        char ch = sb.charAt(0);
        System.out.println("charAt(0): " + ch);
        // Output: d


        /*
         8) setCharAt() - Change character at index
        */
        sb.setCharAt(0, 'D');
        System.out.println("After setCharAt: " + sb);
        // Output: DlroW olleH


        /*
         9) Why StringBuilder is Faster?
         --------------------------------
         BAD WAY (String in loop):
         for(int i = 0; i < 1000; i++){
             s = s + i;   // Creates new object every time
         }

         GOOD WAY (StringBuilder in loop):
         for(int i = 0; i < 1000; i++){
             sb.append(i);  // Same object modified
         }
        */


        /*
         10) String vs StringBuilder (EXAM POINT)
         ----------------------------------------

         String:
         - Immutable
         - Slower for many changes
         - More memory usage
         - Thread-safe

         StringBuilder:
         - Mutable
         - Faster for many changes
         - Less memory usage
         - NOT thread-safe
        */


        /*
         11) When to use what?
         ---------------------
         Use String:
         - When text does NOT change

         Use StringBuilder:
         - When text changes many times
         - In loops
         - While reversing, editing strings
        */


        /*
         12) One-line summary:
         ---------------------
         String = Immutable (slow for changes)
         StringBuilder = Mutable (fast for changes)
        */
    }
}
