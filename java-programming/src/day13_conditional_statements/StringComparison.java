package day13_conditional_statements;

public class StringComparison {
    public static void main(String[] args) {
        String city = "LA";
        if (city.equals("LA")){
            System.out.println("It's LA");
        } else {
            System.out.println("It's not LA");
        }

        String weather = "sunny";
        // if weather == "sunny" { --> it works but avoid;
        if (weather.equals("sunny")) {
            System.out.println("Let's go out and code java");
        } else {
            System.out.println("No, let's stay indoors and code java");
        }
    }
}
