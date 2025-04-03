package MethodActs;

public class Student {

    String firstName, lastName, course, section;
    int year;
    double midtermGrade, finalGrade;

    Student(String firstName, String lastName, String course, String section, int year, double midtermGrade, double finalGrade){
        this.firstName=firstName;
        this.lastName=lastName;
        this.course=course;
        this.section=section;
        this.year=year;
        this.midtermGrade=midtermGrade;
        this.finalGrade=finalGrade;
    }
    //outputs full name, year, course, section of student
    void introduceSelf(){
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Year: " + year);
        System.out.println("Course: " + course);
        System.out.println("Section: " + section);
    }
    double evaluateGrade(){
        return (midtermGrade+finalGrade)/2;
    }
}
