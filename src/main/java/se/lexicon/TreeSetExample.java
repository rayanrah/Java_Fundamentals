package se.lexicon;

import java.util.TreeSet;

public class TreeSetExample {

    public static void main(String[] args) {

        TreeSet<String> fruits = new TreeSet<String>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Orange");
        fruits.add("Kiwi");
        System.out.println("Created a list of fruits using TreeSet Method: ");
        System.out.println("In this method the Elements are sorted alphabetically: ");
        System.out.println(fruits);
        System.out.println("--------------------------");
        System.out.println("You can sort them in ascending order: ");
        System.out.println(fruits.descendingSet());


    } // end of main


} // end of TreeSet
