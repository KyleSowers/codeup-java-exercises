package shapes;

import java.util.Scanner;

public class CircleApp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please input a radius of a circle: ");
        double radius = scanner.nextDouble();

        Circle userRadius = new Circle(radius);

        System.out.printf("The ares of your circle is: %s%n" , userRadius.getArea());

        System.out.printf("The circumference of your circle is: %s%n" , userRadius.getCircumference());


    }
}
