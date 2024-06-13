package se.lexicon;

public class ifStatementExample {
    public static void main(String[] args) {

        int studentScore = 80;

        if (studentScore >= 90) {
            System.out.println("Grade A.");
        } else if (studentScore >= 80) {
            System.out.println("Grade B.");
        } else {
            System.out.println("Grade C.");
        }

        String name = "Ryan";
        String age = "old";
        System.out.println(name.concat(" Ramzy").concat(age));


    } // Main
} //Class
