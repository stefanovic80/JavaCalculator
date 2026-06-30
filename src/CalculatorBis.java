//package src;
public class CalculatorBis{

    public float sum( float a, float b){
        return a + b;
    }

    public float diff( float a, float b){
        return a - b;
    }

    public float mult( float a, float b){
        return a * b;
    }

    public float div( float a, float b){
        return a / b;
    }

    public static void main(String[] args){
        CalculatorBis calc = new CalculatorBis();

        System.out.println("Sum is " + calc.sum(5, 3));
        System.out.println("Diff is " + calc.diff(5, 3));
        System.out.println("Mult is " + calc.mult(5, 3));
        System.out.println("Div is " + calc.div(5, 3));
    }

}