package day18_conditions_practice_strings_intro;

public class Authentication {
    public static void main(String[] args) {
        int expLast4SSN = 1234;
        int expPinCode = 4321;

        int last4SSN = 1234;
        int pinCode = 1111;

        if(last4SSN == expLast4SSN && pinCode == expPinCode) {
            System.out.println("Authentication is successful");
        }else{
            System.out.println("Authentication unsuccessful");
            if(last4SSN != expLast4SSN){ //telling why it's not successful
                System.out.println("Last 4 SSN number is incorrect");
            }else{
                System.out.println("Pin Code is incorrect");
            }
        }
    }
}
