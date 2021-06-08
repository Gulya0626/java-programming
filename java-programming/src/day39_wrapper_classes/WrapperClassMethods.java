package day39_wrapper_classes;

public class WrapperClassMethods {
    public static void main(String[] args) {
        System.out.println(Integer.max(10, 5));
        System.out.println(Integer.sum(50, 35));
        System.out.println(Integer.min(5, 2));
        System.out.println("Min int: " + Integer.MIN_VALUE);
        System.out.println("Max int: " + Integer.MAX_VALUE);

        System.out.println(Double.max(234.6, 45.7));
        System.out.println("Min Double: " + Double.MIN_VALUE);
        System.out.println("Max Double: " + Double.MAX_VALUE);

        System.out.println(Double.compare(5, 1)); //first larger than 2nd
        System.out.println(Double.compare(5, 5)); //both equal
        System.out.println(Double.compare(5, 45)); //1st is smaller than 2nd

        System.out.println(Character.isDigit('8'));
        System.out.println(Character.isDigit('v'));
        System.out.println(Character.isAlphabetic('Q'));
        System.out.println(Character.isLetter('r'));
        System.out.println(Character.isLetter('9'));
        char letter = 'A';
        if(Character.isUpperCase(letter)) {
            System.out.println("Is it uppercase?");
        }
        String word = "JaVa iS Fun";
        for (int i=0; i < word.length(); i++) {
            if(Character.isLowerCase(word.charAt(i))) {
                System.out.print(word.charAt(i));
            }
        }
        System.out.println(Character.MIN_VALUE);
    }
}
