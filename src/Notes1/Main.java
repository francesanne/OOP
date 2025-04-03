package Notes1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Person p = new Person();
        // p.firstName = "Frances";
        // p.lastName = "Riconalla";
        // p.age = 20;
        // p.sex = 'F';

        // System.out.println("Name: " + p.firstName + " " + p.lastName);
        // System.out.println("Age: " + p.age);
        // System.out.println("Sex: " + p.sex);

        // Instantiation for constructor with parameters
        Product p = new Product("Coke", 20.1F);
        Product p1 = new Product("Milk", 150.0F);

        Person per = new Person("Frances", "Rico", 'F', 20);

        // Taking user input
        Scanner sc = new Scanner(System.in);
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        float price = sc.nextFloat();

        // Passed the user input on created object
        Product p2 = new Product(name, price);
    }
}