package myPractice;

public class ReverseString {


    /**
     * 1. String reverse.
     * Write a method that will take one string as an argument and will return the reverse version of this string.
     * <p>
     * // reverseStr("apple")  -> elppa
     * // reverseStr("John")   -> nhoJ
     * // reverseStr("phone")  -> enohp
     * // reverseStr("123456") -> "654321"
     */

    public static void main(String[] args) {
        String word = "john";
        System.out.println(reverse(word));

    }

    public static String reverse(String word) {
        String reversed = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            reversed += word.charAt(i);
        }
        return reversed;

    }
}

