package day40b_RiviewClass;

public class SumOfNumbers {
    /**
     * [Sum of Numbers from String]
     * <p>
     * Create a method that will accept a String and returns the sum of all the numbers in the String.
     * <p>
     * Requirement: any numbers that are next to each other are not single digit numbers but instead read as a full number
     * Ex: a5bc12def100g
     * Here we would have added 5 + 12 + 100
     * NOT: 5 + 1 + 2 + 1 + 0 + 0
     */

    public static void main(String[] args) {
        System.out.println(getSumFromString("a5bc12def100g"));
    }

    public static int getSumFromString(String str) {

        str = str.replaceAll("[^\\d]", " ");
        System.out.println(str.trim());

        int sum = 0;
        String num = ""; //5
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) { //checks if every
                // character is a number (digit)

                num += str.charAt(i);

                if (Character.isDigit(str.charAt(i + 1))) {
                    sum += Integer.parseInt(num);
                    num = ""; //resets our string for the number
                }
            }
        }
        return sum;
    }
}
