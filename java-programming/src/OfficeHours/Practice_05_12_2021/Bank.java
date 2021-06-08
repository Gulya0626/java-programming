package OfficeHours.Practice_05_12_2021;

public class Bank {
    public static void main(String[] args) {

        BankAccount bankAccountOne = new BankAccount();
        bankAccountOne.accountHolderName = "James Bond";
        bankAccountOne.pin = 1234;
        bankAccountOne.balance = 1_000_000;
        bankAccountOne.accountNumber = 21332131;

        System.out.println(bankAccountOne.pin);
        bankAccountOne.getBalance(2234);
        System.out.println();

        System.out.println(new BankAccount().accountHolderName);



    }
}
