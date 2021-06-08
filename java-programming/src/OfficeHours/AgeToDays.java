package OfficeHours;


    /*
    - Declare two int variables: age and age in days
    - Use a base of 365 days in a year
    - Calculate and display:
      You are $age years old! That means you are $days old
     */
    public class AgeToDays {
        public static void main (String []args) {
            int age = 30;
            int ageInDays = 365 * age;
            System.out.println ("You're " + age + " years old!" +
                    " That means you're " + ageInDays + " days old.");
        }
}
