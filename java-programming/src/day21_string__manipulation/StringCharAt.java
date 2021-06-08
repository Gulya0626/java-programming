package day21_string__manipulation;

public class StringCharAt {
    public static void main(String[] args) {
        String word = "java";
        System.out.println(word.charAt(0));
        System.out.println(word.charAt(1));
        System.out.println(word.charAt(2));
        System.out.println(word.charAt(3));

        String word1 = "selenium";

        System.out.println(word1.charAt(0));
        System.out.println(word1.charAt(1));
        System.out.println(word1.charAt(2));
        System.out.println(word1.charAt(3));
        System.out.println(word1.charAt(4));
        System.out.println(word1.charAt(5));
        System.out.println(word1.charAt(6));
        System.out.println(word1.charAt(7));

        String company = "Cybertek";
        System.out.println("first letter: " + company.charAt(0));
        char zero = company.charAt(0);
        char first = company.charAt(1);
        char second = company.charAt(2);
        char third = company.charAt(3);
        char forth = company.charAt(4);
        char fifth = company.charAt(5);
        char sixth = company.charAt(6);
        char seventh = company.charAt(7);
        System.out.println(zero + " " + first + " " + second + " " + third + " " + forth + " " + fifth + " " + sixth + " " + seventh);
    
        String withSpaces = zero + " " + first + " " + second + " " + third + " " + forth + " " + fifth + " " + sixth + " " + seventh;
        System.out.println("withSpaces = " + withSpaces);

    }
}
