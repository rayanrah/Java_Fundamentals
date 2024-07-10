package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayVsArrayList {
    public static void main(String[] args) {

        // --- Create a new Array --- //

        // Method 1: Initialize with a specific size.
        String[] friendsArray1 = new String[3]; // Array with three spaces. [null, null, null]

        // Method 2: Initialize with predefined elements.
        String[] friendsArray2 = {"John", "Marcus", "Anton"}; // Array with 3 elements.

        // --- Create a new ArrayList --- //

        // Method 1: Initialize an empty ArrayList.
        // ArrayList does not have a fixed size initially.
        ArrayList<String> friendsArrayList1 = new ArrayList<>();

        // Method 2: Initialize ArrayList with initial elements using Arrays.asList().
        ArrayList<String> friendsArrayList2 = new ArrayList<>(Arrays.asList("John", "Marcus", "Anton"));

        // --- Printing Array and ArrayList --- //

        // Printing the memory address of the array (not its contents).
        System.out.println(friendsArray1); // This only prints the memory address of the array.

        // Printing the second element of the array.
        System.out.println(friendsArray2[1]); // Prints "Marcus".

        // Printing the third element of the ArrayList.
        System.out.println(friendsArrayList2.get(2)); // Prints "Anton".

        // --- Getting Size --- //

        // Getting the size of the array.
        System.out.println(friendsArray2.length); // Prints the size of the array: 3.

        // Getting the size of the ArrayList.
        System.out.println(friendsArrayList2.size()); // Prints the size of the ArrayList: 3.

        // --- Adding an Element --- //

        // Adding a new element at index 2 in the ArrayList.
        friendsArrayList2.add(2, "Richard"); // Adds "Richard" at index 2.
        System.out.println(friendsArrayList2); // Output: [John, Marcus, Richard, Anton]

        // --- Changing Elements --- //

        // Changing the second element of the ArrayList.
        friendsArrayList2.set(1, "newName"); // Sets index 1 to "newName".
        System.out.println(friendsArrayList2); // Output: [John, newName, Richard, Anton]

        // Changing the second element of the array.
        friendsArray2[1] = "NewName"; // Sets index 1 to "NewName".
        System.out.println(friendsArray2[1]); // Prints "NewName".

        // --- Removing an Element --- //

        // Removing the second element from the ArrayList.
        friendsArrayList2.remove(1); // Removes the element at index 1.
        System.out.println(friendsArrayList2); // Output: [John, Richard, Anton]
    }
}
