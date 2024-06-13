package se.lexicon;


public class JavaFundamentalsDemo {

    public static void main(String[] args) {
        ex7();
    }


    // Ex.01 - Declare a Method.
    public static int addingNumEx01(int a, int b, int c) {
        return a + b + c;
    }

    // Ex.02 - Declare Variable
    public static void ex2() {
        double balance = 4555555.00;
        System.out.println(balance);
    }

    // Ex.03: if else statement
    public static void ex3() {

        int studentScore = 80;

        if (studentScore >= 90) {
            System.out.println("Grade A.");
        } else if (studentScore >= 80) {
            System.out.println("Grade B.");
        } else {
            System.out.println("Grade C.");
        }

    }

    //Ex.04: Switch statement
    // The main method uses a "switch statement" to determine the name of a day based on the integer value
    // of the variable day.

    public static void ex4() {

        int day = 4;
        String dayName;

        switch (day) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            case 3:
                dayName = "Wednesday";
                break;
            case 4:
                dayName = "Thursday";
                break;
            case 5:
                dayName = "Friday";
                break;
            case 6:
                dayName = "Saturday";
                break;
            case 7:
                dayName = "Sunday";
                break;
            default:
                dayName = "Invalid day";
                break;
        }
        System.out.println(dayName);
    }

    //Ex.05: Create an Class and Object.
    // Creating an object of the Car class.

    public static void ex5() {

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
    }

    //Ex.06: Declare For Loop-01
    public static void ex6() {
        for (int i = 0; i < 5; i++) {
            System.out.println("iteration " + i);
        }
    }

    //Ex.07: Declare For Loop-02
    public static void ex7() {
        int number = 20;
        for (int i = 1; i <= number; i++) {
            if (i % 2 == 0) {
                System.out.println(i + "Is an even number.");
            } else {
                System.out.println(i + "Is an odd number.");
            }
        }
    }

    //Ex.08: Declare While Loop
    public static void ex8() {
        int i = 0;
        while (i < 5) {
            System.out.println("Iteration " + i);
            i++;
        }
    }

    //Ex.09: Declare Do While Loop.

    public static void ex9() {
        int i = 0;
        do {
            System.out.println("Iteration " + i);
            i++;
        }
        while (i < 5);
    }

}
