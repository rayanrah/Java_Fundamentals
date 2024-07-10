package se.lexicon;

import java.util.HashSet;

public class HashSetExample {

    public static void main(String[] args) {

        HashSet <String> countries = new HashSet<>();
        System.out.println("Create a HashSet of 5 countries");
        countries.add("Finland");
        countries.add("Sweden");
        countries.add("Denmark");
        countries.add("Norway");
        countries.add("Finland");
        countries.add("Sweden");
        countries.add("Finland");
        System.out.println(countries);
        System.out.println("We have added 2 times 'Sweden' and 'Finland' in the list but it does not count it twice.");
        System.out.println("--------------------------");







    } // end of main

} // end of class
