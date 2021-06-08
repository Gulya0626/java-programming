package day15_logicalops_switch_ternary;

import com.sun.xml.internal.xsom.XSUnionSimpleType;

public class NotLogicalOperator {
    public static void main(String[] args) {
        System.out.println("!true = " + (!true));
        System.out.println("!false = " + (!false));

        int age = 20;
        //check if age is not more than 7. "Need to sit in child car seat."
        if (!(age < 7)){
            System.out.println("Need to seat in car seat. Age = " + age);
        } else {
            System.out.println("Can seat in regular seat. Age = " + age);
        }

        boolean isSmokingAllowed = false;
        //if smoking allowed: print "Smoking is not allowed here, exit
        if (!isSmokingAllowed){
            System.out.println("Smoking is not allowed here. Exit.");
        } else {
            System.out.println("It's allowed to smoke");
        }

        boolean isAffordable = true;
        if (!isAffordable){
            System.out.println("Item not affordable");
        }

        String env = "qa";
        if (!env.equals("qa")){
            System.out.println("In wrong environment for QA testing");
        }

        String carModel = "Tesla";
        if (!carModel.equals("Tesla")){
            System.out.println("Not interested");
        } else {
            System.out.println("Interested");
        }

        String secretPassword = "abc123";
        String inputPassword = "abc321";
        if (!secretPassword.equals("abc123")){
            System.out.println("Incorrect password");
        }
         // second way:
        if (!inputPassword.equals(secretPassword)){
            System.out.println("Wrong password");
        }
    }
}
