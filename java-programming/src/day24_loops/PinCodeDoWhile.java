package day24_loops;

import java.util.*;

public class PinCodeDoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int secretPinCode = 1234;
        int pinCode; //declare here so it's visible to while condition
        do{
            System.out.println("Enter pin code");
            pinCode = scan.nextInt(); // DON'T DECLARE INT HERE
        }while(pinCode != secretPinCode);

        System.out.println("Welcome to your account");
    }
}
