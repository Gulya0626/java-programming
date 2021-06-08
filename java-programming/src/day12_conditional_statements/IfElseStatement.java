package day12_conditional_statements;

public class IfElseStatement {
    public static void main(String[] args) {
        if (10 > 5) {
            System.out.println("Condition is true");
        } else {
            System.out.println("Condition is false");
        }
        int count = 25;
        //check if count is more than 30. If yes, print "count is more than 30"
        //otherwise print "count is less than 30"
        if (count > 30) { //false
            System.out.println("count is more than 30");
        } else {
            System.out.println("count is less than 30");
        }

        if (50 <= 70) {
            System.out.println("yes, it's true");
        } else {
            System.out.println("no, it's false");
        }


        byte age = 10;
        if (age >= 18) {
            System.out.println("Eligible to vote");
            System.out.println("Age is greater or equal to 18");
        } else {
            System.out.println("Not Eligible to vote");
            System.out.println("Age is less than 18");
        }
    }
}
