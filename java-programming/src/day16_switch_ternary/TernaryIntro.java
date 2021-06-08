package day16_switch_ternary;

public class TernaryIntro {
    public static void main(String[] args) {
        int score = 40;
        String result = score >= 60 ? "Pass" : "Fail";
        System.out.println("result = " + result);


        //Ex: 2

        int n1 = 5, n2 = 10;
        int max;

//        if(n1 > n2) {
//            max = n1;
//        } else {
//            max = n2;
//        }
//
//        System.out.println("max = " + max);
//
//        // with ternary
//
//        max = (n1 > n2) ? n1 : n2;
//        System.out.println("max = " + max);
//
//        //Ex:3
//
//        String action;
//        boolean isGreen = true;
//
//        if (isGreen) {
//            action = "Can drive";
//        } else {
//            action = "Can't drive";
//        }
//        System.out.println(action);
//
//        // With ternary operator
//
//        String action1;
//        boolean isGreenC = false;
//        action1 = (isGreenC) ? "Can drive" : "Can't drive";
//        System.out.println(action1);
//
//    //Ex:4
//
          int bill = 3000;
          int discount = (bill > 2000) ? 15 : 10;
          System.out.println("discount = " + discount);
//    //Ex:5

          bill = 1120;
          int quantity = 9;
          if(bill > 1000){
              if(quantity > 11){
                  discount = 10;
              }else{
                  discount = 9;
              }
          }else{
              discount = 5;
          }

          // convert to single statement:

          discount = (bill > 1000) ? (quantity > 11) ? 10 : 9 : 5;
          System.out.println(discount);



          //Ex:6

          int typeSelection = 1;
          int drinkSelection = 1;
          double price;
          String drink = "none";

          if(typeSelection == 1) {
              System.out.println("Hot Drinks: 1 -Tea, 2 - Coffee");
              if (drinkSelection == 1) {
                  price = 2.0;
                  drink = "tea";
              } else if (drinkSelection == 2) {
                  price = 4.0;
                  drink = "coffee";
              } else {
                  System.out.println("Invalid hot drink selection");
              }
          }else if (typeSelection == 2){
              System.out.println("Cold drinks: 1 - Iced tea. 2 - Lemonade");
              if(drinkSelection == 1){
                  price =  3.2;
                  drink = "iced tea";
              }else if (drinkSelection == 2){
                  price = 4.0;
                  drink = "Coffee";
              }else{
                  System.out.println("Invalid cold drink selection");
              }
          }else{
              System.out.println("Invalid drink type selection");
          }

          if(drink.equals("none")){
              System.out.println("Please try again");
          }else{
              System.out.println("");
          }
       }
    }

