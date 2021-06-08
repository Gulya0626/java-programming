package day13_conditional_statements;

public class IfWithBooleanVariable {
    public static void main(String[] args) {
        boolean isHungry = true;
//      if (isHungry)
        if (isHungry == true){
            System.out.println("I'll go get smth to eat, then code java");
        } else {
            System.out.println("I'm not hungry, let's keep coding java");
        }

        double shoePrice = 130.44;
        boolean isAffordable = 200.0 >= shoePrice; //200 budget

        System.out.println("isAffordable = " + isAffordable);
        if (isAffordable) { // if(isAffordable == true) is possible
            System.out.println("I can afford it, let's buy");
        } else {
            System.out.println("Too expensive, let's keep coding java");
        }
        // CONTROL FLOW STATEMENTS

        boolean isRemoteJob = true;
        // if it's NOT remoteJob print "Sorry, I'm not interested";
        //Otherwise, print "Sure, I am interested, what is the interview process?"
        //if (isRemoteJob != true) //true
        if (isRemoteJob){
            System.out.println("Sorry, I'm not interested");
        } else {
            System.out.println("Sure, I am interested, what is the interview process");
        }


    }
}
