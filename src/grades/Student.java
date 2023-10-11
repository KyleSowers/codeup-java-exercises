package grades;

import java.util.ArrayList;

public class Student {

//    fields/attributes (variables in javascript)
    private String name;


    private ArrayList<Integer> grades;

//  Constructor (will assign a form of value to attributes(fields)
    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName() {
        System.out.println("Users name is:");
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade) {
        grades.add(grade);
    }

    // returns the average of the students grades
    public double getGradeAverage() {
        int theAverage = 0;
        for(int singleGrade : grades) {
            theAverage += singleGrade;
        }
        System.out.println("Grade average is:");
        return theAverage / grades.size();
    }

    public ArrayList<Integer> getGrades() {
        System.out.println("Grades are:");
        return grades;
    }
}
