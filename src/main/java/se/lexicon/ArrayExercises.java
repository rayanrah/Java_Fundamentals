package se.lexicon;

public class ArrayExercises {
    public static void main(String[] args) {
        ex02();
    } // main

    // ex01: Create a Array 'int' type and print it.
    public static void ex01() {
        int[] numbers = {10, 20, 40, 50, 60};

        // using enhanced for loop for iteration.
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println(); // output: 10 20 40 50 60
    } //ex01

    //ex02:Create a program and create a method with name ‘indexOf’.
    // It  will find and return the index of an element in the array.
    // If the element doesn’t exist your method should return -1 as value.
    //1. Create a int Array:

    // Define the indexOf Method:
    // This take an array and target values as parameters and return the index.

    public static void ex02() {
        int[] numbers = {100, 50, 30, 60, 80};
        int target = 80;

        int index = indexOf(numbers,target);
        if (index != -1) {
            System.out.println("The index position of number " + target + " is: " + index);
        } else {
            System.out.println(target + "is not in the array");
        }
    }

    // Create a Method indexOf:
    public static int indexOf(int[] array, int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return i;
            }
        }
        return -1;
    } //for


} //class
