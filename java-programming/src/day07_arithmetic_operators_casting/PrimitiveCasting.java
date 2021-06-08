package day07_arithmetic_operators_casting;

public class PrimitiveCasting {
    public static void main (String [] args) {
        int num1 = 100;
        byte b1 = (byte)num1;
        short shNum1 = (short)num1;
        long lNum1 = num1;
        System.out.println (num1);
        System.out.println (b1);
        System.out.println (shNum1);
        System.out.println (lNum1);

        int apples = 10;
        short grapes = (short)apples;
        System.out.println(apples);

        double cherries = 20;
        byte watermelon = (byte)cherries;
        System.out.println(watermelon);

        short pears = 30;
        int plums = pears;
        System.out.println(pears);

        long cucumber = 40;
        int tomato = (int)cucumber;
        System.out.println(cucumber);

    }
}
