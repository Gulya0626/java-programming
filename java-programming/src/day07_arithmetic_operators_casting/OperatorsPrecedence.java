package day07_arithmetic_operators_casting;

public class OperatorsPrecedence {
    public static void main (String [] args){
        System.out.println(10+5); //15
        System.out.println(10 + 5 - 3); //12
        System.out.println(10 - 5 + 3); //8
        System.out.println(10 - (5 + 3)); //2

        System.out.println(2 * 3); //6
        System.out.println(2 * 3 / 3); //2
        System.out.println(20 / (2 * 2)); // 20 / 4 = 5
        System.out.println(4 * 4); //16
        System.out.println(5 + 4 * 2 -5); //8

        // System.out.println(10 / 0); CANNOT DIVIDE BY ZERO. ERROR WHILE CODE RUNNING
        //int num = 10;
        //System.out.println(num / 0); // Error/Exception during runtime

        System.out.println(2 + 5 * 3); //17
        System.out.println((2 + 5) * 3); //21

        System.out.println(10 / 3); //3
        System.out.println(5 / 2); //2

    }
}
