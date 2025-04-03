package Midterms.Shapes;
public class Triangle extends Shape {
    // TODO implement Triangle
    double base, height, a,c;
    public Triangle(double base, double height, double a, double c, String color){
        super(color);
        this.base=base;
        this.height=height;
        this.a=a;
        this.c=c;
    }

    public double area(){
        return 0.5*base*height;
    }

    public double perimeter(){
        return a+base+c;
    }

    public String toString(){
        return super.toString() + " which is also a Triangle";
    }


    public static class EquilateralTriangle extends Triangle {
        // TODO implement EquilateralTriangle
        double side;
        public EquilateralTriangle(double side, String color){
            super(side,side,side,side,color);
            this.side=side;
        }

        public String toString(){
            return super.toString() + " which is also an Equilateral Triangle";
        }
        public double area(){
            return (Math.sqrt(3) / 4)*(side*side);
        }

    }
}