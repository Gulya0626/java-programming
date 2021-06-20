package day55_abstraction.exercise_example;

// Class connot be final and abstract at the same time. Final means no inheritance, abstract means this class will have sub
//-> classes that inherit from it. //if you add final
public abstract class Exercise {
    public void start() {
        System.out.println("Warming up and starting the exercise");
    }

    /**
     * -abstract method - method without body.impl, just signature
     * -purpose: letting sub classes implement/override their own way
     */

    public abstract void perform(); //abstract method - method without body, just signature
    //method can't be final and abstract at same time. Final means cannot override. Abstract means MUST override - no body.
    //Method cannot be abstract and private at the same time , private is not inherited. Abstract must be inherited to be able to overridden
    // -> in sub classes

    /**
     * another abstract method tht concrete sub classes will override/implement
     * @ param minute - how long is exercise is performed
     * @ return number of calories burned/used
     */

    public abstract int getCaloriesCount(int minutes);

}
