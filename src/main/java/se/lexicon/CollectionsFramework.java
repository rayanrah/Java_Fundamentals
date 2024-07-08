package se.lexicon;

import java.util.ArrayList;
import java.util.Iterator;

public class CollectionsFramework {
    public static void main(String[] args) {
        ex03();
    }

    // ---------------------- Using ArrayList method. ----------------------

    // ex01: Create a new ArrayList
    public static void ex01() {
        ArrayList<String> listOfFruits = new ArrayList<>();
        listOfFruits.add("Apple");
        listOfFruits.add("Banana");
        listOfFruits.add("Cherry");
        listOfFruits.add("Mango");

        System.out.println("--------------------------");
        System.out.println("Adding Three fruits to the ArrayList:");
        System.out.println(listOfFruits); // output: [Apple, Banana, Cherry, Mango]
        System.out.println("--------------------------");
        System.out.println("Checking the size of the ArrayList:");
        System.out.println(listOfFruits.size()); // output: 4
        System.out.println("--------------------------");
        System.out.println("Getting the first element of the ArrayList:");
        System.out.println(listOfFruits.get(0)); // output: Apple
        System.out.println("--------------------------");
        System.out.println("Iterating the ArrayList using 'Iterator' and remove the 'Banana' from the ArrayList:");
        Iterator<String> stringIterator = listOfFruits.iterator(); // Create an Iterator.
        while (stringIterator.hasNext()) {
            String fruits = stringIterator.next();
            System.out.println(fruits); // Output: Apple, Banana, Cherry, Mango

            if (fruits.equals("Banana")) {
                stringIterator.remove();
            }
        }
        System.out.println("-----");
        System.out.println("Adding if condition to remove the 'Banana' from the ArrayList:");
        System.out.println(listOfFruits); // Output: [Apple, Cherry, Mango]

        System.out.println("-----");
        System.out.println("Using for while loop with 'if condition' to remove the 'Cherry':");
        for (int i = 0; i < listOfFruits.size(); i++) {
            if (listOfFruits.get(i).equals("Cherry")) {
                listOfFruits.remove(i);
                System.out.println(listOfFruits);
            }
        }
        // ** With 'for while loop' you can not use the 'if condition' to remove the element in the ArrayList.
        System.out.println("-----");
        System.out.println("Iterating the ArrayList using 'for while loop':");
        for (String fruits : listOfFruits) {
            System.out.println(fruits);
        }
    } // ex01

    public static void ex02() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(200);
        numbers.add(500);
        numbers.add(300);
        numbers.add(200);

        System.out.println("Elements and the size of the ArrayList:");
        System.out.println(numbers); // output: [100, 200, 500, 300, 200]
        System.out.println(numbers.size()); // output: 5
        System.out.println("--------------------------");

        System.out.println("Removing the element '200' from the ArrayList using 'Integer.valueOf(200)':");
        boolean isRemoveObject = numbers.remove(Integer.valueOf(200));
        System.out.println(numbers);
        System.out.println("--------------------------");

    } // ex02

    public static void ex03() {
        ArrayList<String> euCars = new ArrayList<>();
        euCars.add("BMW");
        euCars.add("Audi");
        euCars.add("Porsche");
        System.out.println("ArrayList of euCars:");
        System.out.println(euCars);
        System.out.println("--------------------------");

        ArrayList <String> usaCars = new ArrayList<>();
        usaCars.add("Tesla");
        System.out.println("ArrayList of usaCars:");
        System.out.println(usaCars);
        System.out.println("--------------------------");

        System.out.println("Adding the usaCars to the euCars:");
        euCars.addAll(usaCars);
        System.out.println(euCars); // output: [BMW, Audi, Porsche, Tesla, Toyota]
        System.out.println("--------------------------");

        System.out.println("+ Adding the euCars to the index [1] of usaCars:");
        usaCars.addAll(1, euCars);
        System.out.println(usaCars);
        System.out.println("--------------------------");
        System.out.println("Check the last index of 'Tesla' in the usaCars:");
        System.out.println(usaCars.lastIndexOf("Tesla")); // output: 3
        System.out.println("info: The result will be '-1' if the element is not found.");

    } // ex03


} // CollectionsFramework

