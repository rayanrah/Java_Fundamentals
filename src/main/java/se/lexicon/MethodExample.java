package se.lexicon;

public class MethodExample {
    public static void main(String[] args) {

        // Call the method we have created.
        System.out.println(addingNumbers(1,2,3)); // Output: 6

    }

    // Declare a method.
    static int addingNumbers(int a, int b, int c) {
        return a+b+c;
    }
}
