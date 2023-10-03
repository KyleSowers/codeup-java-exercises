import java.awt.*;
import java.util.Scanner;

public class MethodsExercises {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println(adding(3, 4));

        System.out.println(subtract(2, 9));

        System.out.println(multiply(3, 3));

        System.out.println(divide(10, 5));

        System.out.println(modulus(9, 3));

//        System.out.println(divide(10, 0));

//        The ChatGPT method for problem 2
//        int minvalue = 1;
//        int maxValue = 9;
//        int userNumber = getInteger(1, 9);
//        System.out.println("You entered a valid number: " + userNumber);

//        Class made version problem 2
//        System.out.println(getUserInput(1, 9));

        System.out.print(factorial());
//        System.out.print("Would you like to calculate a factorial again?: ");
//        String userAnswer = scanner.next().toLowerCase();
//        if (userAnswer.equals("yes")) {
//            System.out.print("%n");
//            System.out.println(factorial());
//        }


    }




    //    Methods for main
//    Adding method
    public static int adding(int num, int num2) {
        return num + num2;
    }

    //    Subtracting method
    public static int subtract(int num, int num2) {
        return num - num2;
    }

    //    Multiplication Method
    public static int multiply(int num, int num2) {
        return num * num2;
    }

    //    Division method
    public static int divide(int num, int num2) {
        return num / num2;
    }

    //    Modulus method
    public static int modulus(int num, int num2) {
        return num % num2;
    }
//    factorial number


//        Problem 2 userInteger min/max

//        Alt version: ChatGPT Solution (Learning a do/while with an additional while inside
//        public static int getInteger(int min, int max) {
//            Scanner scanner = new Scanner(System.in);
//            int userInput;
//
//            do{
//                System.out.print("Enter a number between " + min + " and " + max + ": ");
//                while (!scanner.hasNextInt()) {
//                    System.out.println("Invalid input. Please enter a valid number");
//                    scanner.nextLine(); //Clears the invalid input
//                }
//                userInput = scanner.nextInt();
//
//                if (userInput >= min && userInput <= max) {
//                    return userInput; //Returns valid input as an integer
//                } else {
//                    System.out.println("Invalid input. Please enter a number between " + min + " and " + max + ".");
//                }
//            } while (true);
//        }

//    simple solution to problem 2
//        public static int getUserInput(int min, int max) {
//            int userInput;
//
//            System.out.print("Enter a number between 1 and 9: ");
//            userInput = scanner.nextInt();
//
//            if (userInput >= 0 && userInput <= 9) {
//                System.out.printf("You entered a valid number!%n");
//                return userInput;
//            } else {
//                System.out.println("PLease enter a valid number! ");
//                return getUserInput(min, max);
//            }
//        }

    //    Problem 3
    public static long factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Provide a number between 1 and 10. You will receive the factorial of that number: ");
        int userFactorial = scanner.nextInt();
        int factNum = 1;
        if (userFactorial < 1 || userFactorial > 10) {
            System.out.println("Invalid number entered, please try again");
            return factorial();
        }
        for (int i = 1; i <= userFactorial; i++) {
            factNum *= i;
        }
        System.out.println("Thanks for the factorial number: " + userFactorial + " Which equals: ");
        return factNum;


        }
    }


