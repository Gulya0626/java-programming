package day25_loops;

public class ForLoopFirst {
    public static void main(String[] args) {

        /**
         below is infinite loop with for loop like: while(true)
         for (;;){
         System.out.println("Java is fun");
         }
         */

        for(int i = 0; i <= 5; i++) {
            System.out.println("Hello world");
        }
        System.out.println();

        //for loop: 1-10. print the numbers
        // initializing variable + condition if true it will run the code
        for(int a = 1; a < 10; a++) { //can be ++a
            System.out.print(a);
        }
    }
}
