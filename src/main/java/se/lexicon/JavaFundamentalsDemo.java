package se.lexicon;


import java.util.Scanner;

public class JavaFundamentalsDemo {

    public static void main(String[] args) {
        ex12();
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

    //Ex.05: Call instance method and its fields.
    // Creating an object of the instance Car.

    public static void ex5() {

        Car Mycar = new Car();

        Mycar.color = "red";
        Mycar.model = "Tesla Model S";
        Mycar.year = 2018;

        System.out.println(Mycar.getCarInfo());
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

    // Ex:10 : Use Method to find the smallest number among three.
    public static void GetNumbers() {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram;
        do {
            System.out.println("Insert the First Number");
            double X = scanner.nextDouble();

            System.out.println("Insert the Second Number");
            double Y = scanner.nextDouble();

            System.out.println("Insert the Third Number");
            double Z = scanner.nextDouble();

            // Find the smallest number.
            double smallestNumber = Math.min(Math.min(X, Y), Z);

            // Display the smallest Number.
            System.out.println("The smallest number is: " + smallestNumber);

            // Ask the user if they want to continue
            System.out.println("Do you want to continue? (yes/no)");
            String userResponse = scanner.next().toLowerCase();

            // Determine if the loop should continue based on the user's response
            continueProgram = userResponse.equals("yes");

        } while (continueProgram);

        System.out.println("Exiting the program ... GoodBye! ");
    } // Do-while loop

    // Ex:11 : Initializing an Array for different value types.

    public static void ex11(String[] args) {

        // Syntax for declaring Array in single line.
        int[] numbers = new int[3]; // output: [0, 0, 0].

        // Define the value for the array.
        int[] numbersarray = new int[]{1, 2, 8}; //This array has 3 elements.
        int[] numersArrayShortSyntax = {1, 2, 8}; //Shorten way of declaring.

        String[] stringArray = {"Mar", "Martin", "Jose"}; // Declare an array for String.

        char[] characterArray = {'a', 'b', 'c'}; // Declare an array for Char.
    }

    // Ex:12 : Accessing an Array elements.

    public static void ex12() {

        String[] names = new String[3]; // Array with  default values [null, null, null].

        System.out.println(names.length); // It will print the number of Elements.

        // Add value to the first index.
        names[0] = "Fredrick";
        names[names.length - 1] = "John";

        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);

    }


} //Class