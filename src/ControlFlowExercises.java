import java.util.Scanner;

public class ControlFlowExercises {

    public static void main (String[] args) {

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
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an integer: ");



    }
}
