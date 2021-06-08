package day12_conditional_statements;
import java.util.Scanner;

public class AmazonFreeShipping {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter your order total price:");
        double totalPrice = scan.nextDouble();

        if(totalPrice >= 25) {
            System.out.println("Free Shipping Eligible. Your order total: $" + totalPrice);
        }else{
            System.out.println("Not eligible for free shipping. Your order total: $" + totalPrice);

        }
        System.out.println("Thanks for shopping amazon!");

        Scanner input = new Scanner (System.in);
        System.out.println("How much money do you have?");
        int toys = input.nextInt();
        String dolls = input.nextLine();

        if (toys >= 999) {
            System.out.println("Yes, you have enough money to buy toys!");
        } else {
            System.out.println("No, not enough money to buy toys");
        }
        System.out.println("Thank you for shopping, have a nice day!");
    }
}
