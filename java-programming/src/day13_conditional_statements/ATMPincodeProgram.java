package day13_conditional_statements;

import java.util.Scanner;

public class ATMPincodeProgram {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("*** WELCOME TO TD BANK ***");
        System.out.println("Please enter your pincode: ");
        int secretPincode = scan.nextInt();
        int inputPincode = 2022;

        if (secretPincode != inputPincode) {
            System.out.println("Welcome to your account");
            System.out.println("You can withdraw, check balance, deposit");
        } else {
            System.out.println("Incorrect pin");
            System.out.println("Please try again.");
        }
            System.out.println("Thank you for using TD Bank");
    }
}

