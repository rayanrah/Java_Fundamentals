package se.lexicon;

public class switchStatementExample {
    public static void main(String[] args) {

       /*
       - The main method uses a "switch statement" to determine the name of a day based on the
       integer value of the variable day."

       - The day name is printed to the console. */
       //--------------------------------------------

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
}
