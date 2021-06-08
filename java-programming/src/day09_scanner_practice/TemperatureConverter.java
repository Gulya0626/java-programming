package day09_scanner_practice;

import java.util.Scanner;

public class TemperatureConverter {
        public static void main(String[] args) {
            Scanner input = new Scanner (System.in);
            System.out.println("###### CONVERT F TO C ######");
            System.out.println("Enter fahrenheit: ");
            double fahrenheit = input.nextDouble();
            double celsius = (fahrenheit - 32) * 5/9 ;
            System.out.println(fahrenheit + " fahrenheit will be " + celsius + " in celsius.");

            Scanner scan = new Scanner (System.in);
            System.out.println("Convert inch to cm");
            //todo
    }
}
