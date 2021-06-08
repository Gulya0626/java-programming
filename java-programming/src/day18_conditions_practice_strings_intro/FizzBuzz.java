package day18_conditions_practice_strings_intro;

public class FizzBuzz {
    public static void main(String[] args) {
        int number = 30;
        if(number % 3 == 0 && number % 5 == 0) {
            System.out.println("FizzBuzz");
        }else if(number % 3 == 0) {
            System.out.println("Fizz");
        }else if(number % 5 == 0){
                System.out.println("Buzz");
        }else{
            System.out.println(number);
        }

        int number1 = 90;
        String result = "FizzBuzz";
        String result1 = "Fizz";
        String result2 = "Buzz";

        if (number1 % 3 == 0 && number1 % 5 == 0) {
            System.out.println("It's = " + result);
        } else if (number1 % 3 == 0) {
            System.out.println("It's = " + result1);
        } else if (number1 % 5 == 0) {
            System.out.println("It's = " + result2);
        } else {
            System.out.println("Wrong entry");
        }
    }
}
