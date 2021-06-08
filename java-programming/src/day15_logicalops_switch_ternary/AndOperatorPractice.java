package day15_logicalops_switch_ternary;

public class AndOperatorPractice {
    public static void main(String[] args) {
        boolean onSale = true;
        boolean freeShipping = true;
        String itemName = "Wooden spoon";

        if (onSale && freeShipping) {
            System.out.println("Adding to cart - " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }

        //add to cart only when it's freeShipping, onSale, and itemName is " Wooden spoon "
        if (freeShipping && onSale && itemName == "Wooden spoon"){
            System.out.println("Adding to cart " + itemName);
        } else {
            System.out.println("Continue shopping for good deals on - " + itemName);
        }
    }
}
