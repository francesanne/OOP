package Midterms.Operation;

public class Subtraction extends Operation{
    public Subtraction(double left, double right){
        super(left,right);
    }

    public double performOperation(){
        return left-right;
    }

}
