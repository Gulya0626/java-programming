package practice_with_aizat;

import java.util.Arrays;

public class ReverseStringAizat {
    public static void main(String[] args) {
        String objectName = "Car";
        String reverse = "";

        for (int i = objectName.length() - 1; i >= 0; i--) {
            reverse += objectName.charAt(i);
        }

        System.out.println(reverse);
        System.out.println("___________Array Reverse_____________");

        String word = "java";
        String reverse1 = "";

        char[] charArray = word.toCharArray(); //Storing word java in charArray & creating an array
        System.out.println(Arrays.toString(charArray)); //printing letters one by one separately

        for (int i = charArray.length-1; i >= 0 ; i--) {
            reverse1 += charArray[i]; //Storing reversed version of word "java" in reverse container
        }
        System.out.println(reverse1);
    }
}