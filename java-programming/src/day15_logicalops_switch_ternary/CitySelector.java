package day15_logicalops_switch_ternary;

public class CitySelector {
    public static void main (String []args){
        String city = "Paris";
        String city2 = "Dubai";

        if (city.equals("Paris") && city2.equals("Tampa")){
            System.out.println("Yay! Willing to relocate to " + city);
        } else {
            System.out.println("Not considering " + city2);
        }

        String city3 = "Tampa";
        String city4 = "NY";
        if (city3.equals("Tampa") && city4.equals("LA")) {
            System.out.println("Yes, I'm moving to " + city3);
        } else {
            System.out.println("No, I prefer " + city4);
        }


        //Saim, Murodil -> it's a java class
        //Otherwise -> it's Soft skill class with Nadir

        String teacher = "Gurhan";

        if (teacher.equals("Saim") || teacher.equals("Murodil")){
            System.out.println("It's java class with " + teacher);
        } else {
            System.out.println("Soft skill class with " + teacher);
        }

        if(teacher.equals("Saim") || teacher.equals("Murodil")) {
            System.out.println("It's java class with " + teacher);
        } else if(teacher.equals("Nadir") || teacher.equals("Gurhan")) {
            System.out.println("Soft skill class with " + teacher);
        } else {
            System.out.println("Some other class with " + teacher);
        }

        //company - "Google", salary >= 100k
        String company = "Gucci";
        double salary = 150_000.0;

        if(company.equals("Google") || salary >= 85_000){
            System.out.println("Accepting offer from " + company);
        } else {
            System.out.println("Rejecting offer from " + company);
        }
    }
}
