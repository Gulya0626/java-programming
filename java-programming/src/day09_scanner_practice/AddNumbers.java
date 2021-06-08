package day09_scanner_practice;
import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        // create scanner object
        Scanner scan = new Scanner(System.in);
        // ask question
        System.out.println("Enter 2 numbers");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int result = num1 + num2;
        System.out.println("Result: "+ result);

        Scanner hotel = new Scanner(System.in);
        System.out.println("Enter 2 hotel numbers: ");
        int room1 = hotel.nextInt();
        int room2 = hotel.nextInt();
        int numbers = room1 + room2;
        System.out.println(numbers);

        Scanner in = new Scanner(System.in);
        System.out.println("What are the numbers for the each banquet rooms?");
        int wedding1 = in.nextInt();
        int birthday2 = in.nextInt();
        System.out.println("Thank you!");


    }
}
