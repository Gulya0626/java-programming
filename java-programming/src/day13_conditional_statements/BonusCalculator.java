package day13_conditional_statements;

public class BonusCalculator {
    public static void main(String[] args) {
        double bonus = 0;
        double salesAmount = 1500.0;

        if (salesAmount <= 2000.35) {
            System.out.println("Good job, you are qualified for bonus");
            bonus = 50.0;
        } else {
            System.out.println("Great job, you're qualified for full bonus");
            bonus = 100.0;
        }
    }
}
