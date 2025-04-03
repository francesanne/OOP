package Midterms.Operation;

public class Addition extends Operation {

    public Addition(double left, double right) {
        super(left, right);
    }
    public double performOperation(){
        return left+right;
    }
}
