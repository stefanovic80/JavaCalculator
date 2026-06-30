//package src;
public class CalculatorTris{

    public static float sum( float a, float b){
        return a + b;
    }

    public static float diff( float a, float b){
        return a - b;
    }

    public static float mult( float a, float b){
        return a * b;
    }

    public static float div( float a, float b){
        return a / b;
    }

    public static void main(String[] args){

        System.out.println("Sum is " + CalculatorTris.sum(5, 3));
        System.out.println("Diff is " + CalculatorTris.diff(5, 3));
        System.out.println("Mult is " + CalculatorTris.mult(5, 3));
        System.out.println("Div is " + CalculatorTris.div(5, 3));
    }

}