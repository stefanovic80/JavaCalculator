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

    /** Per eseguire le quattro operazioni su 10 e 5 digitare javac -d bin src/CalculatorTris.java 10 5
    */
    public static void main(String[] args){
        float a = Float.parseFloat(args[0]);
        float b = Float.parseFloat(args[1]);

        System.out.println("Sum is " + CalculatorTris.sum(a, b));
        System.out.println("Diff is " + CalculatorTris.diff(a, b));
        System.out.println("Mult is " + CalculatorTris.mult(a, b));
        System.out.println("Div is " + CalculatorTris.div(a, b));
    }

}