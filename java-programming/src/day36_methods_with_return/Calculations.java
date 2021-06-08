package day36_methods_with_return;

public class Calculations {
    public static void main(String[] args) {
        System.out.println("Add 10+45 = " + Calculator.add(10, 45));
        System.out.println("Minus 100-80 = " + Calculator.minus(100, 80));
        System.out.println("Divide 15 / 3 = " + Calculator.divide(15, 3));
        System.out.println("Multiply 6 * 6 = " + Calculator.multiply(6, 6));

        double d1 = 234.3;
        double d2 = 321.5;
        double result = Calculator.minus(d1, d2);
        System.out.println("result = " + result);
    }
}
