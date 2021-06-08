package day16_switch_ternary;

public class CappuccinoBuyer {
    public static void main(String[] args) {
        String size = "Grande";
        double price = 0.0;
        int calories = 0;

        if (size.equals("Tall")){
        }
        switch (size){
            case "Tall":
                System.out.println("Tall cappuccino please");
                price = 3.69;
                calories = 90;
                break;
            case "Grande":
                System.out.println("Grange cappuccino please");
                price = 3.99;
                calories = 120;
                break;
            case "Venti":
                System.out.println("Venti cappuccino please");
                price = 4.29;
                calories = 150;
                break;
            default:
                System.out.println("We don't serve that " + size + " size of cappuccino");
        }
            System.out.println("Total price  is $" + price);
            System.out.println("You'll consume " + calories + " calories in total");
    }
}
