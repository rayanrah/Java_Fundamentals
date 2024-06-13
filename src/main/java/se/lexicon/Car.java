package se.lexicon;

public class Car {
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