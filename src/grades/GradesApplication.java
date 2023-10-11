package grades;
import java.util.Scanner;
import java.util.HashMap;

public class GradesApplication {



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student student1 = new Student("Sid");
        Student student2 = new Student("Biff");
        Student student3 = new Student("Goodman");
        Student student4 = new Student("joker");

        student1.addGrade(79);
        student1.addGrade(88);
        student1.addGrade(89);

        student2.addGrade(92);
        student2.addGrade(94);
        student2.addGrade(88);

        student3.addGrade(84);
        student3.addGrade(96);
        student3.addGrade(90);

        student4.addGrade(97);
        student4.addGrade(91);
        student4.addGrade(94);

        HashMap<String, Student> students = new HashMap<>();
        students.put("toyture", student1);
        students.put("hellomcfly", student2);
        students.put("lazertazermichelle", student3);
        students.put("?serious?", student4);



        System.out.println("Here are the user names available to access.");

        for (String i : students.keySet()) {
                System.out.println(i);
            }

        String userChoice;
        String userContinue = "";
        String userSeeAll = "";
        do {
            System.out.println("Here are the user names available to access.");

            for (String i : students.keySet()) {
                System.out.println(i);
            }

            System.out.println("Which user would you like to see more of? ");
            userChoice = scanner.nextLine();
            if (students.containsKey(userChoice)) {
                System.out.println(students.get(userChoice).getName());
                System.out.println(students.get(userChoice).getGrades());
                System.out.println(students.get(userChoice).getGradeAverage());
            } else {
                System.out.println("No users with that username were found.");
            }

            System.out.println("Would you like to see all grades for everyone? ");
                userSeeAll = scanner.nextLine().toUpperCase();
            if (userSeeAll.equals("Y")) {
                System.out.println(student1.getGrades());
                System.out.println(student2.getGrades());
                System.out.println(student3.getGrades());
                System.out.println(student4.getGrades());
            }

                System.out.print("Would you like to continue, Y/N?");
                userContinue = scanner.nextLine().toUpperCase();
            if (userContinue.equals("N")) {
                System.out.println("Goodbye, and have a wonderful day!");
            }

        } while (userContinue.equals("Y"));
    }
}
