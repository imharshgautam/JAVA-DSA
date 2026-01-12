import java.util.ArrayList;      // ArrayList class import
import java.util.Collections;   // Collections utility class (reverse, sort, etc.)
import java.util.Iterator;      // Iterator for traversal

/*
 * =========================
 * ARRAYLIST NOTES (INLINE)
 * =========================
 *
 * ▶ ArrayList is a resizable (dynamic) array.
 * ▶ Part of Java Collection Framework.
 * ▶ Internally uses a normal array.
 *
 * ▶ IMPORTANT FEATURES:
 *   1. Dynamic size (auto grows/shrinks)
 *   2. Stores OBJECTS only (no primitives)
 *   3. Maintains insertion order
 *   4. Allows duplicate values
 *   5. Allows null values
 *   6. Random access supported (fast get)
 *
 * ▶ WRAPPER CLASSES:
 *   int    → Integer
 *   double → Double
 *   char   → Character
 *
 * ▶ DEFAULT CAPACITY:
 *   Initial capacity = 10 (internally)
 *   Grows by: (oldCapacity * 3 / 2) + 1
 *
 * ▶ WHEN TO USE ARRAYLIST:
 *   ✔ More access operations
 *   ✔ Less insert/delete in middle
 *
 * ▶ TIME COMPLEXITY:
 *   get()           → O(1)
 *   add(element)   → O(1) amortized
 *   add(index,e)   → O(n)
 *   remove(index)  → O(n)
 */

public class ArrayListDemo {

    public static void main(String[] args) {

        // Creating an ArrayList of Integer type
        // Syntax: ArrayList<DataType> name = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        // add(element) → adds element at the end
        arr.add(18);
        arr.add(20);
        arr.add(22);
        arr.add(24);
        arr.add(26);
        arr.add(17);

        // add(index, element) → insert at specific index
        arr.add(2, 99);

        // Printing the whole ArrayList
        System.out.println(arr);

        // get(index) → returns element at given index (O(1))
        System.out.println("Element at index 2: " + arr.get(2));

        // set(index, element) → updates value at index
        arr.set(1, 50);
        System.out.println("After set(): " + arr);

        // contains(element) → check if element exists
        System.out.println("Contains 24? " + arr.contains(24));

        // size() → number of elements
        System.out.println("Size: " + arr.size());

        // Traversing using for loop
        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i) + " ");
        }
        System.out.println();

        // Traversing using enhanced for-each loop
        for (int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();

        // Traversing using Iterator
        Iterator<Integer> it = arr.iterator();
        while (it.hasNext()) {
            System.out.print(it.next() + " ");
        }
        System.out.println();

        // remove by index
        arr.remove(3);
        System.out.println("After remove index 3: " + arr);

        // remove by value
        arr.remove(Integer.valueOf(17));
        System.out.println("After remove value 17: " + arr);

        // Reverse the ArrayList
        Collections.reverse(arr);
        System.out.println("Reversed: " + arr);

        // Sort the ArrayList
        Collections.sort(arr);
        System.out.println("Sorted: " + arr);

        // Clear all elements
        arr.clear();
        System.out.println("After clear(): " + arr);

        // isEmpty() → check if list is empty
        System.out.println("Is empty? " + arr.isEmpty());
    }
}
