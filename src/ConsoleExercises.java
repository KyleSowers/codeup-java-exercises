import java.sql.SQLOutput;
import java.util.Scanner;

public class ConsoleExercises {

    public static void main (String[] args) {
//        1st eprinting data to the console
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %s.%n", pi);

        System.out.printf("The value of pi is %,.2f%n", pi);

        System.out.printf("Total: %-10.2f: %n", pi);

        System.out.printf("%20.10s\n", pi);

        String s = "Hello world";
        System.out.printf("The String object %s is at hash code %h%n", s, s);
//  Calling the scanner
        Scanner scanner = new Scanner(System.in);
//  Enter and print an integer
        System.out.print("Enter an Integer: ");
        int userInput = scanner.nextInt();
////  Enter three words and print
//        System.out.print("Enter three words: ");
//        String input1 = scanner.next().toLowerCase();
//        String input2 = scanner.next().toLowerCase();
//        String input3 = scanner.next().toLowerCase();
//        scanner.nextLine();
//
//        System.out.println(input1);
//        System.out.println(input2);
//        System.out.println(input3);
//
////        if less than 3 words it will not pass until 3
////        if more than 3 words, only first three print
//
////  Enter a sentence and print
//        System.out.print("Enter a short sentence: ");
//        String userSentence = scanner.nextLine();
//
//        System.out.println(userSentence);
//
////  Calculate perimeter and area
//        System.out.print("Enter the classroom length in inches (just a number): ");
//        float length = Float.parseFloat(scanner.nextLine());
//        System.out.print("Enter the classroom width in inches (just a number): ");
//        float width = Float.parseFloat(scanner.nextLine());
//        System.out.print("Enter the classroom height in inches (just a number): ");
//        float height = Float.parseFloat(scanner.nextLine());
//
////  Equations for room perimeter/area/volume
//        Float area = length * width;
//        Float perimeter = (20 * length) + (2 * width);
//        Float volume = length * width * height;
//
//        System.out.printf("The classroom perimeter is %s inches, while the area is %s inches, while the volume is %s.%n", perimeter, area, volume);
//
//
    }

}
