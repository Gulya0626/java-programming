package day36_methods_with_return;

public class Calculator {
    public static void main(String[] args) {
        System.out.println(add(10.5, 5.5));
        double sum = add(1, 3);
        System.out.println("sum = " + sum);
        System.out.println("100.0 + 200.0 = " + add(100, 200));

        System.out.println(minus(1000, 500));
        double d = minus(800, 600);
        System.out.println("d = " + d);

        System.out.println(multiply(10 , 10));
        double m = multiply(10, 10);
        System.out.println("m = " + m);

        System.out.println(divide(12, 3));
        double division = divide(12, 3);
        System.out.println("division = " + division);


    }
    public static double add(double num1, double num2) {
        double result = num1+num2;
        return result;
    }

    public static double minus(double num1, double num2) {
        double result = num1-num2;
        return result;

    }

    public static double multiply(double num1, double num2) {
        double result = num1 * num2;
        return result;
    }

    public static double divide(double num1, double num2) {
        double result = num1 / num2;
        return result;
    }

}




