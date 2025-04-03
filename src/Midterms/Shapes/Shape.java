
package Midterms.Shapes;
import java.util.*;


public abstract class Shape implements Comparable<Shape> {
    String color;


    public Shape(String color) {
        this.color = color;
    }


    public abstract double area();
    public abstract double perimeter();


    @Override
    public int compareTo(Shape other) {
        return Double.compare(other.area(), this.area()); // Descending order
    }


    @Override
    public String toString() {
        return "A shape that is color " + color;
    }
}


// Comparator for sorting by perimeter
class PerimeterComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        return Double.compare(s2.perimeter(), s1.perimeter()); // Descending order
    }
}


// Comparator for sorting by color and area
class ColorComparator implements Comparator<Shape> {
    @Override
    public int compare(Shape s1, Shape s2) {
        int colorComparison = s1.color.compareToIgnoreCase(s2.color);
        if (colorComparison == 0) {
            return Double.compare(s2.area(), s1.area()); // Sort by area if color matches
        }
        return colorComparison; // Ascending order by color
    }
}
