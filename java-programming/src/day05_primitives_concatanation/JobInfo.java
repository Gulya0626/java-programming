package day05_primitives_concatanation;

public class JobInfo {
    public static void main (String [] args) {
        String jobTitle = "SDET";
        String company = "Google";
        String jobDescription = "Experience in Java, Selenium, Cucumber, JUnit";
        double salary = 150000;
        byte yearsOfExperience = 1;
        boolean hasBenefits = true;

        System.out.println ("Job Title :" + jobTitle);
        System.out.println ("Company: "  + company) ;
        System.out.println ("Job Description: " + jobDescription);
        System.out.println ("Salary: $" + salary);
        System.out.println ("Years Of Experience: " + yearsOfExperience);
        System.out.println ("Has Benefits: "  + hasBenefits);
    }
}
