package day10_shorthand_operators;

import java.util.Scanner;

public class WeatherToday {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("How's the weather today?");
        //String weather = "rainy";
        //String weather = scan.next(); //printed 1 word out of 2
        String weather = scan.nextLine(); //printed 2 words and more
        System.out.println(weather + " - is a nice day today!");

    }
}