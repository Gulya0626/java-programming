package day18_conditions_practice_strings_intro;

public class IfWithoutCurlyBraces {
    public static void main(String[] args) {
        String today_sClass = "python";

        if(today_sClass.equals("java")) {
            System.out.println("java is fun");
            System.out.println("Java is fun again");
        }else{
            System.out.println("It's not java. It's " + today_sClass);
        }
    }
}
