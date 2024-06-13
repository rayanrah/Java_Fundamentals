package se.lexicon;

public class classAndObjectExample {
    public static void main(String[] args) {
        class Car {
            String color;
            String model;
            int year;

            // Adding a behaviour (Methods)

            void Start() {
                System.out.println("My Car with model" + " " + model + " is Starting");
            }

            void Stop() {
                System.out.println("My Car with model" + " " + model + " is Stopping");
            }
        } // Car class

        // ----------------------------------------------------

        // Creating an object of the Car class.
        Car Mycar = new Car();

        Mycar.color = "red";
        Mycar.model = "Tesla Model S";
        Mycar.year = 2018;

        System.out.println("The model of my car is " + Mycar.model + " from " + Mycar.year + " " +
                "and" + " the color is " + Mycar.color); // Output: The model of my car is Tesla
        // Model S from 2018 and the color is red.

        // Accessing properties
        Mycar.Start();  // Output: My Car with model Tesla Model S is Starting
        Mycar.Stop();   // Output: My Car with model Tesla Model S is Stopping

    } //Main
} //Class
