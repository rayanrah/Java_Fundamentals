package se.lexicon;

public class Car {
    // Declare group of filed related to the Car Class.
    String color;
    String model;
    int year;

    // Adding a behaviour (Methods)

    public String getCarInfo() {

        return "My Car is" + " " + model + " and " + color + " color" + " and year " + year + ".";
    }

} // Car class