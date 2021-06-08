package day22_string_manipulation;

import java.lang.*; //added by default / automatically

public class ReverseUsingCharAt {
    public static void main(String[] args) {
        String word = "java";

        System.out.print(word.charAt(3)); //print not ln
        System.out.print(word.charAt(2));
        System.out.print(word.charAt(1));
        System.out.println(word.charAt(0));
        System.out.println(word);

        //print using single statement and concat +
        System.out.println("" + word.charAt(3) + word.charAt(2) //start with string "" double quotes to avoid char
                              + word.charAt(1) + word.charAt(0));

        String world = "" + word.charAt(3) + word.charAt(2)
                + word.charAt(1) + word.charAt(0);
        System.out.println("word = " + word);
        System.out.println("world = " + world);

        if(word.equalsIgnoreCase(world)){
            System.out.println("This is palindrome");
        }else{
            System.out.println("This is not palindrome");
        }
    }
}
