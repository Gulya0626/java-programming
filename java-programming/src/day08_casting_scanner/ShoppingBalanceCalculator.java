package day08_casting_scanner;

public class ShoppingBalanceCalculator {
    public static void main (String [] args ){
        // balance -> 345.55

        // price1 -> 20.88
        // price2 -> 89.99
        // price3 -> 15

        //remainingBalance -> calculate

        // Your initial balance: $345.55
        // Your remaining balance: $219.68

        double balance = 345.55;
        double price1 = 20.88;
        double price2 = 89.99;
        double price3 = 15;
        double remainingBalance = balance - price1 - price2 - price3; // -> 1st way to do
        //double remainingBalance = balance - (price1+price2+price3);
        //balance = remainingBalance;
        System.out.println ("Your initial balance: \t$" + balance);
        System.out.println ("Your remaining balance: $" + remainingBalance);

        int balanceWithNoCents = (int)remainingBalance ;
        System.out.println ("Your remaining balance without cents: $" + balanceWithNoCents);

        double onlineCourse = 12000.80;
        double payment1 = 6000;
        double payment2 = 6000;
        //The remaining balance is zero,it is paid off in full
        double theRemainingBalance = onlineCourse - (payment1+payment2);
        System.out.print("The remaining balance is " + theRemainingBalance + ",");
        System.out.println(" it is paid off in full");

        int balanceWithNoChange = (int)theRemainingBalance;
        System.out.println("Your remaining balance without cents " + balanceWithNoChange);

    }
}
