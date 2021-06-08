package day15_logicalops_switch_ternary;

public class JobOfferSelector {
    public static void main(String[] args) {
        String location = "Chicago";
        double salary = 150_000.0;
        boolean remote = true;
        boolean benefits = true;

        if(location.equals("Chicago") && salary >= 150_000.0 && remote && benefits){
            System.out.println("Yes, accept this job");
        } else {
            System.out.println("No, but thank you for offering");
        }
    }
}
