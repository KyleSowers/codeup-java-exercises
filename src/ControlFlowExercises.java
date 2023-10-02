import java.util.Scanner;
import java.util.*;

public class ControlFlowExercises {

    public static void main(String[] args) {

//  1. Loops Basics
//  a. While
//        int i = 5;
//        while (i <= 15) {
//            System.out.println(i);
//            i++;
//        }

//  b. Do While
//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);

//  backwards
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i > -11);

//   squared 1000000
//        long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i < 1000000);

//   refactor 1A to for loop
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i);
//        }

//   refactor 1B's to for loops
//        for (int i = 0; i < 101; i+=2) {
//            System.out.println(i);
//        }

//        for (int i = 100; i > -11; i-=5) {
//            System.out.println(i);
//        }

//        for (long i = 2; i < 1000000; i*=i) {
//            System.out.println(i);
//        }


//   2. Fizzbuzz
//        for(int i = 1; i < 101; i++) {
//            if (i % 3 == 0 && i % 5 == 0) {
//                System.out.println("FizzBuzz");
//                continue;
//            }
//            if (i % 3 == 0) {
//                System.out.println("Fizz");
//                continue;
//            } else if (i % 5 == 0) {
//                System.out.println("Buzz");
//                continue;
//            } else {
//                System.out.println(i);
//                continue;
//            }
//        }


//   3. Display table of powers
//        Formatter fmt;
//        Scanner scanner = new Scanner(System.in);
//        String input1 = "";
//
//        do {
//            System.out.print("Enter an integer: ");
//            int userInput = scanner.nextInt();
//
//            int i;
//            System.out.println("number | squared | cubed");
//            for (i = 1; i <= userInput; i++) {
//                fmt = new Formatter();
//
//                fmt.format("%4d  | %4d  | %4d", i, i * i, i * i * i);
//                System.out.println(fmt);
//            }
//            System.out.print("Would you like to continue? Enter Yes or No: ");
//            input1 = scanner.next().toLowerCase();
//
//        } while (input1.equals("yes"));


//    Problem 4
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your numerical grade? (1 - 100): ");
        int userInput = scanner.nextInt();

//function gradeChecker(userInput) {
        int counter = 0;

            if (userInput <= 59) {
                counter++;
            }
            if (userInput <= 66) {
                counter++;
            }
            if (userInput <= 79) {
                counter++;
            }
            if (userInput <= 87) {
                counter++;
            }
            if (userInput <= 100) {
                counter++;
            }

            switch (counter) {
                case 1:
                    System.out.println("Your grade is an F");
                    break;
                case 2:
                    System.out.println("Your grade is a D");
                    break;
                case 3:
                    System.out.println("Your grade is a C");
                    break;
                case 4:
                    System.out.println("Your grade is a B");
                    break;
                case 5:
                    System.out.println("Your grade is an A");
                    break;
            }



    }
}