package Midterms.Shapes;
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) {
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }




    //inner class
    public static class Square extends Rectangle {

        public Square(double side, String color) {
            super(side,side,color);
        }


        public String toString(){
            return super.toString() + " which is also a Square";
        }


    }
}