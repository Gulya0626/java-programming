package day14_multi_branch_if_statements;

public class DayActivity {
    public static void main(String[] args) {
        String weather = "cold";

        if (weather.equals("sunny")) {
            System.out.println("Go to park, do hiking and code java");
        } else if (weather.equals("rainy")) {
            System.out.println("Stay home, drink tea and code java");
        } else if (weather.equals("snowy")) {
            System.out.println("clean the car then build snowman, drink hot chocolate and code java");
        } else if (weather.equals("windy")){
            System.out.println("get ready for power loss, fly a kite and code java");
        } else {
            System.out.println("Just keep coding java");
        }

        String dayOfWeek = "Friday";
        if (dayOfWeek.equals("Monday")) {
            System.out.println("Monday is the first day of the week");
        } else if (dayOfWeek.equals("Tuesday")) {
            System.out.println("Tuesday is the second day of week");
        } else {
            System.out.println("No, it's not " + dayOfWeek);
        }
    }
}
