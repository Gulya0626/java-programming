package OfficeHours.Practice03_24_2021;

public class AccountNumber {
    public static void main(String[] args) {
        String accountNumber = "5000000";

        if (accountNumber.startsWith("2")) { // if(accountNumber.charAt(0) == '2')

            if (accountNumber.length() == 7) {
                System.out.println("Valid 7 digit account number");

            } else if (accountNumber.startsWith("5")) {

                if (accountNumber.length() == 7) {
                    System.out.println("Valid 10 digit account number");

                }

            } else {

                System.out.println("Not valid 10 digit account number");
            }

        } else {
            System.out.println("Not valid account number");
        }
    }
}
