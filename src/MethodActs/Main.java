package MethodActs;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner((System.in));

        System.out.print("Enter first name: ");
        String fName = s.nextLine();

        System.out.print("Enter last name: ");
        String lName = s.nextLine();

        System.out.print("Enter course: ");
        String course = s.nextLine();

        System.out.print("Enter section: ");
        String section = s.nextLine();

        System.out.print("Enter year: ");
        int year =  s.nextInt();

        System.out.print("Enter MG: ");
        double mg = s.nextDouble();

        System.out.print("Enter FG: ");
        double fg = s.nextDouble();
        System.out.println();


        Student s1 = new Student(fName, lName, course, section, year, mg, fg);
        s1.introduceSelf();
        if(s1.evaluateGrade() >= 4){
            System.out.println("Honor: " + s1.evaluateGrade());
        }else if(s1.evaluateGrade() < 4 && s1.evaluateGrade()>=3){
            System.out.println("Passed: " + s1.evaluateGrade());
        }else{
            System.out.println("Failed: " + s1.evaluateGrade());
        }
    }
}
