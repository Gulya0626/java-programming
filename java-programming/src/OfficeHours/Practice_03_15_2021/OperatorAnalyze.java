package OfficeHours.Practice_03_15_2021;

public class OperatorAnalyze {
    public static void main(String[] args) {
        int a = 5;
        int b = a++ + a-- + a * 2 + a + ++a;
        //      5     6     5 * 2   5   6
        // total: 32
        // print
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int a1 = 200;
        int b1 = -a1++ + - --a1 * a1-- % 2 + a1;
        //       -200  + - 200 * 200 % 2 + 199;
        System.out.println("a1 = " + a1);
        System.out.println("b1 = " + b1);
    }

}
