package day18_conditions_practice_strings_intro;

public class MultiBranchIf {
    public static void main(String[] args) {
        int number = 7;
        if(number > 0){
            System.out.println(number + " is positive");
        }else if (number < 0){
            System.out.println(number + " is negative");
        }else {
            System.out.println(number + " is zero");
        }

            int planet = 87;
            if (number > 0) {
                System.out.println(planet + " is positive");
            } else if (number < 0) {
                System.out.println(planet + " is negative");
            } else if (number == 0) {
                System.out.println(planet + " is zero");
            }
            System.out.println("planet = " + planet);
        }
    }

