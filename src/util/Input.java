package util;
import java.util.Scanner;

public class Input {

    private Scanner scanner;

//    Scanner Constructor
    public Input() {
        this.scanner = new Scanner(System.in);
    }
//    Methods Problem 3
    public String getString() {
        System.out.println("Hello User! Provide a word here: ");
        String word = scanner.nextLine();
        System.out.printf("You chose the word: %s.%n", word);
        return word;
    }

    public Boolean yesNo() {
        System.out.println("Would you like to continue? Y/N or Yes/No here: ");
        String shouldContinue = scanner.nextLine().toLowerCase();
        if (!shouldContinue.equals("y") || !shouldContinue.equals("yes")) {
            return true;
        } else {
            return false;
        }
    }

    public int getInt(int min, int max) {
        System.out.printf("Provide a number between %d and %d: %n", min, max);
        int userNum = scanner.nextInt();
        if (userNum >= min && userNum <= max) {
            return userNum;
        } else {
            return getInt(min, max);
        }
    }

    public int getInt() {
        System.out.println("Provide a single number here: ");
        try {
            String userString = getString();
            int isAInteger = Integer.valueOf(userString);
            return isAInteger;
        } catch (NumberFormatException e) {
            System.out.println("This did not appear to be a number");
            e.printStackTrace();
            return 0;
        }
    }

//    For import to MoviesApplication.js file
    public int getInt2() {
        System.out.println("Enter your choice: ");
        int userInteger = scanner.nextInt();
        return userInteger;
    }

    public double getDouble(double min, double max) {
        System.out.printf("Provide a decimal number between %s and %s here: %n", min, max);
        try {
            String userInput = getString();
            double userDouble = Double.valueOf(userInput);
            if (userDouble >= min && userDouble <= max) {
                return userDouble;
            } else {
                return getDouble(min, max);
            }
        } catch (NumberFormatException e) {
            System.out.println("This did not appear to be a number");
            e.printStackTrace();
            return 0;
        }
    }

    public double getDouble() {
        System.out.println("Provide a decimal number here: ");
        double userDoubleNum = scanner.nextDouble();
        return userDoubleNum;
    }


//  Main
    public static void main(String[] args) {

    }
}
