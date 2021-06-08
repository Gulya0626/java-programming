package day37_methods_overloading;

public class DaySelector {
    public static void main(String[] args) {
        System.out.println(getDayName(8));
        System.out.println(getDayName(7));
        System.out.println(getDayName(4));

        //loop from 1 to 8 and call the getDayName with loop variable
        for(int i = 1; i < 8; i++) {
            System.out.println(i + " = " + getDayName(i));
        }

        //Store getDayName into variable and print variable
        String today = getDayName(6);
        System.out.println("today = " + today);
        String someDay = getDayName(0);
        if(someDay == null) {
            System.out.println("Someday is null for invalid day");

        }
    }

    public static String getDayName(int day) {
        switch (day) {
            case (1):
                return "Monday";
                //break; //unreachable code, because return already exits the method
            case (2):
                return ("Tuesday");
            case (3):
                return ("Wednesday");
            case (4):
                return ("Thursday");
            case (5):
                return ("Friday");
            case (6):
                return ("Saturday");
            case (7):
                return ("Sunday");
            default:
                System.out.println("Invalid day - " + day);
                return null; //nothing, no object
                //break;
        }
    }
}
