package day16_switch_ternary;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class ApartmentLease {
    public static void main(String[] args) {
        System.out.println(" ***** WELCOME TO ADAIRE APARTMENTS ***** ");
        int numberOfBedrooms = 17;
        double startingPrice = 0;

        switch(numberOfBedrooms){
            case (0):
                System.out.println("Studio apartment selected");
                startingPrice = 1454;
                //reak;
            case (1):
                System.out.println("1 Bedroom apartment selected");
                startingPrice = 1725;
                //break;
            case (2):
                System.out.println("2 Bedroom apartment selected");
                startingPrice = 2899;
                break;
            default:
                System.out.println(numberOfBedrooms + " Bedroom currently unavailable");
                break;
                //return; means exit main method
        }
        System.out.println("Starting price : &" + startingPrice);
    }
}
