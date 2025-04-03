package Midterms.Operation;

public class Multiplication extends Operation{
    public Multiplication(double left, double right){
        super(left,right);
    }

    public double performOperation(){
        return left*right;
    }
}
