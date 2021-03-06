package day26_loops;

public class PrintChars {
    public static void main(String[] args) {
        String word = "gulya";
        System.out.println(word.length());

        /**
         * Below is long way without loop
         */

        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));
        System.out.println(word.charAt(4)); // error

        for(int i = word.length() -1; i >= 0 ; i--) {
            System.out.println(word.charAt(i));
        }
    }
}
