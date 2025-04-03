package Midterms.Operation;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double n1 = s.nextDouble();
        System.out.print("Enter the second number: ");
        double n2 = s.nextDouble();

        System.out.print("Choose an operator (+ - * /): ");
        char op = s.next().charAt(0);

        Operation operation;
        switch(op){
            case '+':
                operation = new Addition(n1,n2);
                break;
            case '-':
                operation = new Subtraction(n1,n2);
                break;
            case '*':
                operation = new Multiplication(n1,n2);
                break;
            case '/':
                operation = new Division(n1,n2);
                break;
            default:
                System.out.println("Invalid operator.");
                return;
        }


        System.out.print("Enter code: ");
        int code = s.nextInt();

        if(code==12){
            System.out.println("SUCCESS");
        }else {
            System.out.println("FAILED");
        }
        operation.printResult();
    }
}
