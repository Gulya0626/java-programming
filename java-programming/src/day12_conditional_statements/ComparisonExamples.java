package day12_conditional_statements;

public class ComparisonExamples {
    public static void main(String[] args) {
        int speedLimit = 5_5; //55
        int currentSpeed = 4_5; //45
        System.out.println(currentSpeed > speedLimit); //false 45 not more than 55
        System.out.println(speedLimit < currentSpeed); //false 55 not less than 45
        System.out.println(speedLimit == currentSpeed); //false not equal

        boolean isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");

        //45 increasing by 20 => 65
        currentSpeed += 20; //65
        isSpeeding = currentSpeed > speedLimit;
        System.out.println("Are you speeeding? - " + isSpeeding);
        System.out.println("currentSpeed = " + currentSpeed + "mph");
        System.out.println("speedLimit = " + speedLimit + "mph");
        
        currentSpeed -= 10;
        isSpeeding = currentSpeed != speedLimit;
        System.out.println("isSpeeding = " + isSpeeding);

        double accountBalance = 250.25;
        double itemPrice = 200.99;
        System.out.println("Can I afford? - " + (accountBalance >= itemPrice)); //true

        boolean canAfford = accountBalance >= itemPrice;
        System.out.println("Can afford = " + canAfford);

        //Decrease balance tby itemPrice. Using shorthand operators

        accountBalance = accountBalance - itemPrice;
        --itemPrice;
        accountBalance -= itemPrice;


        boolean isBroke = accountBalance <= 0;
        System.out.println("Am I broke? - " + isBroke);
        System.out.println(accountBalance);

        double inWallet = 1000;
        double dress = 200;
        boolean balanceLeft = inWallet >= dress;
        System.out.println("Do I have more money left? - " + balanceLeft);





    }
}
