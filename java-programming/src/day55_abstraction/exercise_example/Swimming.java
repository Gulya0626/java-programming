package day55_abstraction.exercise_example;

public class Swimming extends Exercise {
    //Swimming is concrete class - sub class of abstract Exercise
    //-> parent class. It is showing errors because we have abstract methods
    //-> in parent class that Swimming MUST override/implement

    @Override
    public void perform() {
        System.out.println("Performing swimming in a pool or ocean");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return minutes * 11;
    }
}
