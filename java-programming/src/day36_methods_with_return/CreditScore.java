package day36_methods_with_return;

public class CreditScore {
    public static void main(String[] args) {
        checkEligible(825);
        checkEligible(720);
        checkEligible(400);
       // gerCreditScore(800);
    }

    public static void checkEligible(int creditScore) {
        if(creditScore >= 700) {
            System.out.println("You're eligible for leasing this car");
        }else{
            System.out.println("Sorry.You're not eligible to lease this car");
        }
    }

    //public static int getCreditscore {
     //   return 800;
    }
