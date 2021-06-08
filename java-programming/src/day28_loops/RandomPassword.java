package day28_loops;

import java.util.*;

public class RandomPassword {
    public static void main(String[] args) {
        String source = "ABCDEFGHIJKLMNOPQRSTUVWXYZfghhjlkjmlhdfsfrdfchgjn456789087$%^&*(*&^%*)(";
        Random random = new Random(); //generate random number
        String password = "";

        for(int i = 1; i <= 8; i++) {
            int index = random.nextInt(71); // random num 0 - 79
            System.out.print(source.charAt(index));
            //System.out.print(random.nextInt(source.length()));

            //add the char to password variable using +=
            //password = password + source.charAt(index);
            password += source.charAt(index);
        }

        System.out.println("\nYour password = " + password);
    }
}
