package OfficeHours;

public class Stage1Calculator {
    public static void main (String []args) {
        double numOne = 5.0 ;
        double numTwo = 10.0 ;

        double addition = numOne + numTwo ;
        double subtraction = numOne - numTwo;
        double multiplication = numOne * numTwo;
        double division = numOne / numTwo;
        double Remainder = numOne % numTwo;
        //byte -> short -> int -> long -> float -> double;

        System.out.println ("Calculation for " + numOne + "&" + numTwo);
        System.out.println (numOne + "+" + numTwo + " = " + addition );
        System.out.println (numOne + "+" + numTwo + " = " + subtraction);
    }
}
