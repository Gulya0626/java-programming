package day50_inheritance;

public class StaticBlockTest {
    public static void main(String[] args) {
        //we will create static block object
        StaticBlockDemo st1 = new StaticBlockDemo(); //it runs one time only  /after constructor will run
        StaticBlockDemo st2 = new StaticBlockDemo(); //it  will run second time b/c 1st one already in memory //constructor
//constructor runs each time
        // initializer runs only one time before doing anything
        StaticBlockDemo st3 = new StaticBlockDemo(); //constructor
        System.out.println(StaticBlockDemo.num); //25
        StaticBlockDemo st4 = new StaticBlockDemo(50);
        System.out.println(StaticBlockDemo.num); //75
    }
}

