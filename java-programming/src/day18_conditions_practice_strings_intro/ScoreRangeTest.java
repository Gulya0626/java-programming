package day18_conditions_practice_strings_intro;

public class ScoreRangeTest {
    public static void main(String[] args) {
        int score = 200;

        if (score >= 1 && score <= 40){
            System.out.println("D");
        } else if(score >= 41 && score <= 60){
            System.out.println("C");
        } else if(score >= 61 && score <= 90){
            System.out.println("B");
        } else if (score >= 91 && score <=100) {
            System.out.println("A");
        } else if (score <= 0 || score > 100){
            System.out.println("Invalid");
        } else {
            System.out.println("Invalid score " + score);
        }

//        int num1, num2, num3;
//        num1 = 10;
//        num2 = 44;
//        num3 = 11;
//

        int score1 = 61;
        if (score1 >= 1 && score1 <= 40){
            System.out.println('D');
        } else if (score1 >= 41 && score1 <= 60){
            System.out.println("C");
        } else if (score1 >= 61 && score1 <= 90){
            System.out.println("B");
        } else if (score1 >= 91 && score1 <= 100){
            System.out.println("A");
        } else {
            System.out.println("Invalid score " + score);
        }

        int age = 13;
        if (age >= 1 && age <= 5){
            System.out.println("Toddler");
        } else if (age <= 16 && age >= 12){
            System.out.println("Teenager");
        }
    }
}
