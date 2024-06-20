package se.lexicon;

import java.util.Scanner;

public class JavaFundamentalsDemo {

    public static void main(String[] args) {

        ex18();
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

    // Ex:13 : iterating through the array using indexed-base for loop.
    public static void ex13() {

        int[] numbers = {1, 2, 3, 4, 7};

        // index based-for-loop
        for (int i = 0; i < numbers.length; i++)
            System.out.println("numbers[" + i + "]= " + numbers[i]);

        System.out.println("----------------");
        // Enhanced-for-loop (for-each-loop).
        for (int num : numbers) {
            System.out.println(num);
        }
    }

    // Ex:14 : Changing the value of array.
    public static void ex14() {
        int[] numbers = {10, 20, 30, 50};
        for (int i = 0; i < numbers.length; i++) {
            if (i == 2) {
                numbers[i] = 300;
            }

            System.out.println(numbers[i]);
        }
    }

    // Ex:15 : Expanding the Array size.
    public static void ex15() {
        int[] originalArray = {10, 20, 30, 50};

        for (int element : originalArray) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 1.First we need to create an Array that has 5 elements.
        int[] newArray = new int[originalArray.length + 1]; // [0,0,0,0,0]

        // 2. Use the index-for-loop to access the value of the 'originalArray'.
        // We add the value of 'originalArray' to the vale of the 'newArray'.
        // We want to add '7' to the newArray. we need to access the last index of newArray.

        for (int i = 0; i < originalArray.length; i++) {
            newArray[i] = originalArray[i]; // [10,20,30,50,0]
        }
        newArray[newArray.length - 1] = 7; // [10,20,30,50,7]

        // printout the newArray elements.
        for (int element : newArray) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    // Ex:16 : Sort the Array.
    public static void ex16() {
        int[] numbers = {4, 2, 5, 3, 7};

        // iterating over each element of Array.
        for (int i = 0; i < numbers.length; i++) {

            // inner loop to iterate over the remaining element in the Array.
            // Starting from next elements. i+1.
            for (int j = i + 1; j < numbers.length; j++) {

                if (numbers[i] > numbers[j]) { // ex: number 4 > 2.
                    int temp = numbers[i]; // 4
                    numbers[i] = numbers[j]; // We change the index of i and J.
                    numbers[j] = temp;
                } // if
            } // for j
        } //for i
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    } // ex16

    // Ex:17 : Find the Max number of the Array.
    public static void ex17() {
        int[] numbers = {5, 2, 3, 4, 7};

        // Declare the variable as a MaxNumber.as a default we choose the first element of Array.
        int maxNumber = 5;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > maxNumber) {
                maxNumber = numbers[i];
            } // if
        } // for-loop
        System.out.println("maxNumber is: " + maxNumber);
    } //ex17

    // Ex:18 : Multi-dimensional Array. We create an Array that has Two Dimensions.
    public static void ex18() {
        // 0 x 0
        // 0 x x
        // x 0 x
        String[][] matrixFormat = new String[3][3];

        matrixFormat[0][0] = "0";
        matrixFormat[0][1] = "x";
        matrixFormat[0][2] = "0";

        matrixFormat[1][0] = "0";
        matrixFormat[1][1] = "x";
        matrixFormat[1][2] = "x";

        matrixFormat[2][0] = "x";
        matrixFormat[2][1] = "0";
        matrixFormat[2][2] = "x";

        for (int i = 0; i < matrixFormat.length; i++) {

            for (int j = 0; j < matrixFormat.length; j++) {
                System.out.print(matrixFormat[i][j] + "\t");
            } // for J
            System.out.println("\n");
        } //for i
    } //ex18

} //Class