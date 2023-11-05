import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.print("Hello, World!");

        int myFavoriteNumber = 25;
        System.out.println("\n" + myFavoriteNumber);

        String myString = "Codeup";
        System.out.println(myString);

        char myStirng = 'C';
        System.out.println(myStirng);


        myString = "3.14159";
        System.out.println(myString);

        long myNumber = (long) 3.14;
        System.out.println(myNumber);

        myNumber = 123L;
        System.out.println(myNumber);

        myNumber = 123;
        System.out.println(myNumber);

        Float myNumber1 = 3.14f;
        System.out.println(myNumber1);

        int x = 5;
        System.out.println(x++);
        System.out.println(x);
////        x is a value of 5, on the first print it remains 5, post incremented, second print is new current value 6
        int y = 5;
        System.out.println(++y);
        System.out.println(y);
//        x is 5, pre incremented to first post - posts 6, second print equals current value 6

//        String class;
//        cannot use class as variable name

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;
//        System.out.println(three);

//        int three = (int) "three";

        int a = 4;
        a += 5;
        System.out.println(a);

        int b = 3;
        int c = 4;
        c *= b;
        System.out.println(c);

        int d = 10;
        int e = 2;
        d /= e;
        e -= d;
        System.out.println(d);
        System.out.println(e);

//        If the value is larger than the type can hold, data could be lost;
//        If the value is less than a larger than needed type, all works fine;
//        If you increment past a types max hold, data could be lost;


    }
}

