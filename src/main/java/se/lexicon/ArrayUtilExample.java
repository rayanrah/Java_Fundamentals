package se.lexicon;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class ArrayUtilExample {
    public static void main(String[] args) {
        ex07();
    } //main

    // ex01: using 'ArrayList' classes.
    public static void ex01() {
        ArrayList<String> list = new ArrayList<>();
        list.add("rando,");
        list.add("Banana");
        list.add("Cherry");

        for (String fruitList : list)
            System.out.print(fruitList + " "); //
    }

    // ex02: Sorting arrays using array.util
    public static void ex02() {
        String[] names = {"Simon", "erik", "Ulf", "Jonas", "Ryan", "almond"};

        // Array.sort (names);
        Arrays.sort(names, String.CASE_INSENSITIVE_ORDER);

        // names in reverse order;
        Arrays.sort(names, Collections.reverseOrder(String.CASE_INSENSITIVE_ORDER));

        // print a sort method.
        System.out.println(Arrays.toString(names)); // output: [almond, erik, Jonas, Ryan, Simon, Ulf]

    } //ex02

    // ex03: method binarySearch --> It works on Sorter-Array
    public static void ex03() {
        int[] numbers = {700, 800, 500, 6000, 500, 100, 580};

        Arrays.sort(numbers);

        int index = Arrays.binarySearch(numbers, 100);
        System.out.println("index = " + index);
        if (index < 0) {
            System.out.println("Data not found.");
        } // if-class
    } //ex03

    // ex04: Extend the Array with the new elements | Arrays.copyOf ()
    public static void ex04() {
        int[] numbers = {10, 20, 30};
        int newNumber = 50;
        int[] newArray = Arrays.copyOf(numbers, numbers.length + 1); //Means: [10,20,30, 0]
        newArray[newArray.length - 1] = newNumber; //Means: [10,20,30, 0]

        System.out.println(Arrays.toString(newArray)); // [10,20,30,50]
    } //ex04

    // ex05: Concept of Arrays.copyOf and equal in Arrays.
    public static void ex05() {
        char[] letters = {'A', 'B', 'C'};

        char[] referenceArray = letters;
        char[] copyOfReference = Arrays.copyOf(letters, letters.length);

        letters[0] = 'M';

        System.out.println(referenceArray);
        System.out.println(copyOfReference);
    } // ex05

    // ex06: Combining Arrays with Arrays.copyOf ().
    public static void ex06() {
        int[] numbers = {1, 2, 3, 4, 8, 100};

        int startIndex = 2; //position we want to Start from.
        int endIndex = numbers.length; // Position we want to ent at.

        int[] range = Arrays.copyOfRange(numbers, startIndex, endIndex);

        System.out.println(range);
    } //ex06

    // ex07: Create an Array with default value.
    public static void ex07 () {
        char [] letters = new char [10];
        Arrays.fill(letters, 'X');

        System.out.println(letters); // output: XXXXXXXXXX
    } // ex07

} // class
