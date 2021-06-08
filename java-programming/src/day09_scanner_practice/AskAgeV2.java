package day09_scanner_practice;
import java.util.Scanner;

public class AskAgeV2 {
    public static void main(String[] args) {
       Scanner predmet = new Scanner(System.in);
        System.out.println("How old are you?");
        int age = predmet.nextInt();
        System.out.println(age + " - that's great age!");

        Scanner yabloko = new Scanner(System.in);
        System.out.println("How much is pizza?");
        double price = yabloko.nextDouble();
        System.out.println("$" + price + "?"+ " Oh, that's too cheap");

        Scanner pomidor = new Scanner(System.in);
        System.out.println("How much is tomato?");
        double price1 = pomidor.nextDouble();
        System.out.println("$"+ price1 + " - That's expensive");

    }
}
