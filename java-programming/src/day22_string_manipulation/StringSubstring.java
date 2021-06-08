package day22_string_manipulation;

public class StringSubstring {
    public static void main(String[] args) {
        String word = "java is fun";

        System.out.println(word.substring(0, 4));
        System.out.println(word.substring(0, 7));
        //print is
        System.out.println(word.substring(5, 7));
        /**
         * 2) Substring(startIndex) - it will read from start until end
         */

        System.out.println(word.substring(5));
    }

}
