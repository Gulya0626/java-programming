package day18_conditions_practice_strings_intro;

public class EvenOrOdd {
    public static void main(String[] args) {
        int num =4;

        if(num % 2 == 0){
            System.out.println(num + " is even");
        }else{
            System.out.println(num + " is odd");
        }

        int world = 8;
        if (world % 2 == 0) {
            System.out.println(world + " is EVEN");
        }else{
            System.out.println(world + " is ODD");
        }

        int restaurants = 55;
        if (restaurants % 10 == 0) {
            System.out.println("even");
        }else{
            System.out.println("odd");
        }
    }
}
