package day10_shorthand_operators;

import java.sql.SQLOutput;

public class ChangeBalance {
    public static void main(String[] args) {
        double balance = 1230.55;
        System.out.println("balance = " + balance);

        double baklava = 22.50;
        System.out.println("baklava = " + baklava);
        // decrease balance by baklava price
        balance = balance - baklava;
        System.out.println("balance after baklava = " + balance);

        double kenafe = 44.45;
        System.out.println("kenafa = " + kenafe);
        balance = balance - kenafe;
        System.out.println("balance after kenafa = " + balance);

        //second kenafe is 50% off. let's buy it
        kenafe = kenafe / 2;
        System.out.println("kenafe = " + kenafe);
        //buy it and decrease balance with kenafe price;
        balance = balance - kenafe;
        System.out.println("balance after second kenafe = " + balance);

        double plov = 7.99;
        System.out.println("plov = " + plov);
        balance = balance - plov;
        System.out.println("The balance after plove = " + balance);

        double icedTea = 3.0;
        System.out.println("IcedTea = " + icedTea);
        //buy 4 iced teas and decrease balance;
        balance = balance - icedTea * 4;
        System.out.println("the balance after 4 iced teas = $" + balance);

        //return baklava;
        System.out.println("Returning baklava: " + baklava);
        balance = balance + baklava;
        System.out.println("Balance after returning baklava = $" + balance);

        int cake = 100;
        System.out.println("Cake is: " + cake);
        balance = balance - cake;
        System.out.println("The balance after buying cake: $" + balance);
    }

}
