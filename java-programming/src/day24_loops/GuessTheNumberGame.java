package day24_loops;

import java.util.*;

public class GuessTheNumberGame {
    public static void main(String[] args) {
        Random randomNum = new Random();
        Scanner scan = new Scanner(System.in);
        //System.out.println("randomNum.nextInt(101));
        int secretNumber = randomNum.nextInt(101);
        int guessingNumber = 0;
           do {
                System.out.println("Guess the secret number");
                guessingNumber = scan.nextInt();
                if(guessingNumber > secretNumber){
                    System.out.println("Wrong your number too large");
                }else if(guessingNumber < secretNumber){
                    System.out.println("Wrong your number is too small");
                }
        }while(secretNumber != guessingNumber);

        System.out.println("Congrats, you secret number is " + secretNumber);
    }
}
