package day25_loops;

import java.util.Scanner;

public class StartEnd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter start number: ");
        int startNumber = scan.nextInt();
        int endNumber = scan.nextInt();

        if(startNumber > endNumber) {
            System.out.print("Reverse numbering is not supported");
        }

        for(int i = startNumber ; i <= endNumber ; i++){
            System.out.print(i+" ");
        }
    }
}
