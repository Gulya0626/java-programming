package day55_abstraction.exercise_example;

public class Running extends Exercise {
//Running is a concrete class. It is extending an Abstract class. It must override all abstract methods in parent Exercise class

    // Sub class is overriding the abstract methods from Parent abstract class, see below:

    @Override
    public void perform() {
        System.out.println("Performing Running exercise");
    }

    @Override
    public int getCaloriesCount(int minutes) {
        return 0;
    }
}
