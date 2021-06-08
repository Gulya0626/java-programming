package OfficeHours.Practice_03_08_2021;

import java.util.Scanner;

// PIC: PACKAGE -> IMPORT -> CLASS;

public class Rectangle {
    public static void main(String[] args) {
        // hard coded values
        // double length = 5;
        // double width = 3;
        // dynamic with Scanner;
        Scanner input = new Scanner(System.in);
        double length = input.nextInt();
        // double = int
        double width = input.nextDouble();

        double perimeter = 2 * (length + width);
        double area = length * width;
        System.out.println("perimeter = " + perimeter);
        System.out.println("area = " + area);

    }
}
