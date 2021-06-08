package day09_scanner_practice;
import java.util.Scanner;

public class GroceryShopping {
    public static void main(String[] args) {
    Scanner scan = new Scanner (System.in);

    System.out.println("Enter price for milk:");
    double Price1 = scan.nextDouble();

    System.out.println("Enter price for bread:");
    double Price2 = scan.nextDouble();

    System.out.println("Enter price for cucumbers:");
    double Price3 = scan.nextDouble();

    double total = Price1 + Price2 + Price3;
    System.out.println("Total price is: $" + total);
    }
}
