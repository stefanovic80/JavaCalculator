package src;
public class CalculatorBis{

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
        float value;
        CalculatorBis calc = new CalculatorBis();
        calc.sum(5, 3);
        calc.diff(5,3);

        System.out.println("Sum is " + calc.sum(5, 3));
        System.out.println("Diff is " + calc.diff(5, 3));
        System.out.println("Mult is " + calc.mult(5, 3));
        System.out.println("Div is " + calc.div(5, 3));
    }

}