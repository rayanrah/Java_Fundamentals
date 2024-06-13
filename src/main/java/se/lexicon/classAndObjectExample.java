package se.lexicon;

public class classAndObjectExample {
    public static void main(String[] args) {
        class Car {
            String color;
            String model;
            int year;

            // Adding a behaviour (Methods)

            void Start() {
                System.out.println("Car is Starting");
            }

            void Stop() {
                System.out.println("Car is Stopping");
            }
        } // Car class

        // ----------------------------------------------------

        // Creating an object of the Car class.
        Car Mycar = new Car();

        Mycar.color = "red";
        Mycar.model = "Tesla Model S";
        Mycar.year = 2018;

        Mycar.Start();  // Outputs: Car is starting
        Mycar.Stop();   // Outputs: Car is stopping

        // Accessing properties

        System.out.println("The model of my car is " + Mycar.model + " from " + Mycar.year + " " +
                "and" + " the color is " + Mycar.color);
    } //Main
} //Class
