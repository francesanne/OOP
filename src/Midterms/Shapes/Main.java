package Midterms.Shapes;
import java.util.*;
import java.util.Scanner;import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Shape> shapes = new ArrayList<>();

        // Shape input loop
        while (true) {
            System.out.print("Enter shape: ");
            String shapeType = sc.nextLine();
            if (shapeType.equalsIgnoreCase("DONE")) break;

            Shape shape = null;
            String color;
            double len, wid, side, a, b, radius, base, height, c;

            switch (shapeType) {
                case "Rectangle":
                    System.out.print("Enter length: ");
                    len = sc.nextDouble();
                    System.out.print("Enter width: ");
                    wid = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Rectangle(len, wid, color);
                    break;

                case "Square":
                    System.out.print("Enter side: ");
                    side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Rectangle.Square(side, color);
                    break;

                case "Ellipse":
                    System.out.print("Enter a: ");
                    a = sc.nextDouble();
                    System.out.print("Enter b: ");
                    b = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse(a, b, color);
                    break;

                case "Circle":
                    System.out.print("Enter radius: ");
                    radius = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Ellipse.Circle(radius, color);
                    break;

                case "Triangle":
                    System.out.print("Enter base: ");
                    base = sc.nextDouble();
                    System.out.print("Enter height: ");
                    height = sc.nextDouble();
                    System.out.print("Enter a: ");
                    a = sc.nextDouble();
                    System.out.print("Enter c: ");
                    c = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle(base, height, a, c, color);
                    break;

                case "Equilateral Triangle":
                    System.out.print("Enter side: ");
                    side = sc.nextDouble();
                    sc.nextLine();
                    System.out.print("Enter color: ");
                    color = sc.nextLine();
                    shape = new Triangle.EquilateralTriangle(side, color);
                    break;
            }

            if (shape != null) {
                shapes.add(shape);
            }
        }

        // Sorting input loop
        while (true) {
            System.out.print("Sort by: ");
            String sortType = sc.nextLine();
            if (sortType.equalsIgnoreCase("DONE")) break;

            switch (sortType) {
                case "Area":
                    Collections.sort(shapes); // Uses Comparable
                    for (Shape s : shapes) {
                        System.out.printf("Area of %s: %.2f\n", s, s.area());
                    }
                    break;

                case "Perimeter":
                    shapes.sort(new PerimeterComparator());
                    for (Shape s : shapes) {
                        System.out.printf("Perimeter of %s: %.2f\n", s, s.perimeter());
                    }
                    break;

                case "Color":
                    shapes.sort(new ColorComparator());
                    for (Shape s : shapes) {
                        System.out.printf("Area of %s: %.2f\n", s, s.area());
                    }
                    break;

                default:
                    System.out.println("Invalid sort type.");
            }
        }
        sc.close();
    }
}