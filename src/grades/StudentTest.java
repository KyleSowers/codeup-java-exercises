package grades;

import java.util.ArrayList;

public class StudentTest {

    public static void main(String[] args) {
        Student student1 = new Student("Kyle");
        student1.addGrade(95);
        student1.addGrade(84);
        student1.addGrade(94);
        student1.addGrade(88);

        System.out.println(student1.getGrades());
        System.out.println(student1.getGradeAverage());
        System.out.println(student1.getName());



    }
}
