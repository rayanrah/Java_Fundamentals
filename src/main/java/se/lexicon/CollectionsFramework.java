package se.lexicon;

import java.util.*;

public class CollectionsFramework {
    public static void main(String[] args) {
        ex07();
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

        ArrayList<String> usaCars = new ArrayList<>();
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

    public static void ex04() {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(100);
        numbers.add(500);
        numbers.add(200);
        numbers.add(300);
        numbers.add(200);

        System.out.println("Original ArrayList:");
        System.out.println(numbers);
        System.out.println("--------------------------");

        numbers.sort(null); // Another way of sorting: Collections.sort(numbers);
        System.out.println("Sorted ArrayList:");
        System.out.println(numbers);
        System.out.println("--------------------------");

        System.out.println("Sorted ArrayList in reverse order:");
        numbers.sort(Collections.reverseOrder());
        System.out.println(numbers);
        System.out.println("--------------------------");
        System.out.println("List of letters with Capital and small letters:");
        List<String> letters = Arrays.asList("A", "B", "c", "d", "D");
        System.out.println(letters);
        letters.sort(String.CASE_INSENSITIVE_ORDER); // Collections.sort(letters, String.CASE_INSENSITIVE_ORDER);
        System.out.println("------");
        System.out.println("Sorted list of letters regardless of case");
        System.out.println(letters);

    } //ex04

    public static void ex05() {
        String product1 = "Apple";
        String product2 = "Apple";

        System.out.println("Comparing two objects with the same element: " + product1 + " and " + product2);
        boolean isCompareString = product1.equals(product2);
        System.out.println(isCompareString); // Output: true

        System.out.println("Get Hashcode for two objects: " + product1 + " and " + product2);
        System.out.println("Hashcode for " + product1 + " is: " + product1.hashCode()); // Output: 101
        System.out.println("Hashcode for " + product2 + " is: " + product2.hashCode()); // Output: 101
        System.out.println("--------------------------");
    } // ex05

    public static void ex06() {
        // create a new object of person.
        Person person1 = new Person(1, "John", "Doe", "jdoe@me.com");
        Person person2 = new Person(1, "John", "Doe", "jdoe@me.com");

        System.out.println("Location memory of two Person: person1 and person2");
        System.out.println(person1); // output: se.lexicon.Person@d6dc9a4c
        System.out.println(person2); // output: se.lexicon.Person@d6dc9a4c
        System.out.println("------");

        System.out.println("Comparing two objects with the 'Equals method' that have same element become 'False' because it checks the location memory");
        System.out.println("We need to '@Override the equals method' in order to compare two objects with the same element.");
        System.out.println("We do it in the Person class.");
        boolean isEqualPersons = person1.equals(person2);
        System.out.println(isEqualPersons); // output: True
        System.out.println("--------------------------");
        System.out.println("output before @override: se.lexicon.Person@d6dc9a4c"); // output: True
        System.out.println("------");
        System.out.println("output ofter @override .toString method:"); // output: True
        System.out.println(person1.toString()); // output before override: se.lexicon.Person@d6dc9a4c


    } // ex06

    public static void ex07() {
        ArrayList<Person> people = new ArrayList<>();

        people.add(new Person(3, "John", "Doe", "jdoe@me.com"));
        people.add(new Person(1, "Alice", "Doe", "Alice@me.com"));
        people.add(new Person(2, "Marc", "Doe", "Marc@me.com"));
        people.add(new Person(4, "Beatrice", "Doe", "jdoe@me.com"));

        System.out.println("Iterate the ArrayList and print the Person object.");
        for (Person person : people) { // (Type of element + name of variable : collection)
            System.out.println(person);
        }
        System.out.println("--------------------------");

        System.out.println("Sorting object by id: using 'Comparable interface'");
        System.out.println("We will encounter an Error using .sort method | we need to implement the 'Comparable interface'");
        System.out.println("TO do that we need to override the 'compareTo' method in the 'Person' class");
        System.out.println("------");
        System.out.println("result after override the 'compareTo' method:");
        Collections.sort(people);
        for (Person person : people) { // (Type of element + name of variable : collection)
            System.out.println(person);
        }
        System.out.println("--------------------------");

        System.out.println("'Comparator' Interface for sorting Name:");
        Collections.sort(people, new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return o1.getName().compareTo(o2.getName());
            }
        });
        for (Person person : people) { // (Type of element + name of variable : collection)
            System.out.println(person);
        }
        System.out.println("--------------------------");

        System.out.println("'Comparator' Interface for sorting Email: using shortcut 'Lambda Expression'");
        Collections.sort(people, (o1,o2) -> o1.getEmail().compareTo(o2.getEmail()));

        for (Person person : people) { // (Type of element + name of variable : collection)
            System.out.println(person);
        }
        System.out.println("--------------------------");

    } // ex07

} // CollectionsFramework

