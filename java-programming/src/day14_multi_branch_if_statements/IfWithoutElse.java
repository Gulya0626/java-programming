package day14_multi_branch_if_statements;

public class IfWithoutElse {
    public static void main(String[] args) {
        int year = 2025;
        if (year == 2020){
            System.out.print("Covid-19 pandemic year,");
            System.out.println(" wear mask and keep 6 ft distance");
        } else {
            System.out.println("No pandemic");
        }
        System.out.println("Keep coding java");

        String country = "CANADA";
        if (country.equals("USA")){
            System.out.println("Washington DC is the capital");
            System.out.println("White house is in Pennsylvania ave");
        }
        System.out.println("WELCOME TO " + country);

        String city = "New York";
        if(city.equals("New York")){
            System.out.println("I will move to " + city);
        } else {
            System.out.println("No, I will not move there");
        }

        int year1 = 2030;
        if (year1 == 2040){
            System.out.println("I'm successful in my career");
        } else {
            System.out.println("I'm on my highest level of success");
            System.out.println("I'm happy and very rich!");
        }
    }
}
